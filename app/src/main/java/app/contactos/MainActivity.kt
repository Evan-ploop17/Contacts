package app.contactos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    private var contacts:ArrayList<Contact>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        contacts = ArrayList()
        contacts?.add(Contact("Esteban",
            "S alas",
            "Globant",
            21,
            80.4F,
            "cll",
            300,
            "gmail",
            R.drawable.foto_01))

        var list = findViewById<ListView>(R.id.listContcts)
        var adapter = CustomAdapter(this, contacts!!)
        list.adapter = adapter
    }

    // Con este código se relaciona el menu con el toolbar en la actividad
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.newContact -> {
                val intent = Intent(this, NewContact::class.java)
                startActivity(intent)
                return true
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
    }
}