package app.contactos

class Contact(
    name:String,
    lastName:String,
    company:String,
    age:Int,
    weight:Float,
    address:String,
    number:Int,
    email:String,
    picture:Int ) {

    var name:String = ""
    var lastName:String = ""
    var company:String = ""
    var age:Int = 0
    var weight:Float = 0F
    var address:String = ""
    var number:Int = 0
    var email:String = ""
    var picture:Int = 0

    init{
        this.name = name
        this.lastName = lastName
        this.company = company
        this.age = age
        this.weight = weight
        this.address = address
        this.number = number
        this.email = email
        this.picture = picture
    }

}