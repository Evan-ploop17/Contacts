package app.contactos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context:Context, items:ArrayList<Contact>): BaseAdapter() {

    var items:ArrayList<Contact>? = null

    init {
        this.items = items
    }

    override fun getCount(): Int {
        return this.items?.count()!!
    }

    override fun getItem(position: Int): Any {
        return this.items?.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    // Se toman los datos de la clase y se ponen en los elementos de la lista
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var viewHolder:ViewHolder? = null
        var view:View? = convertView

        // Miramos si la lista esta llena
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.template_contact, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else{
            viewHolder = view as? ViewHolder
        }

        // Asignamos los valores de la clase a los valores del template
        val item = getItem(position) as Contact
        viewHolder?.name?.text = item.name + " " + item.lastName
        viewHolder?.picture?.setImageResource(item.picture)
        viewHolder?.company?.text = item.company

        return view!!
    }

    class ViewHolder(view:View){
        var name:TextView? = null
        var picture:ImageView? = null
        var company:TextView? = null

        init {
            this.name = view.findViewById(R.id.textName)
            this.picture = view.findViewById(R.id.imageView)
            this.company = view.findViewById(R.id.textCompany)
        }
    }

}