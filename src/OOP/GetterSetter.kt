package Kotlin.OOP

import java.util.*

fun main(args: Array<String>) {

    val myId = Registration("mdazharcse14@gmail.com","cse@123",25,'M')

    println(myId.email_id)
    myId.email_id = "mdazharcse14@gmail.com"
    println(myId.email_id)
    println(myId.password)
    println("${myId.age}")
    println("${myId.gender}")

    // throw IllegalArgumentException("Passwords is too small")
    myId.password = "abc"

    // throw IllegalArgumentException("Age should be 18+")
    myId.age= 5

    // throw IllegalArgumentException("User should be male")
    myId.gender = 'F'
}

class Registration( email: String, pwd: String, age: Int , gender: Char) {

    var email_id: String = email
        // Custom Getter
        get() {
            return field.lowercase(Locale.getDefault())
        }
    var password: String = pwd
        // Custom Setter
        set(value){
            field = if(value.length > 6) value else throw IllegalArgumentException("Passwords is too small")
        }

    var age: Int = age
        // Custom Setter
        set(value) {
            field = if(value > 18 ) value else throw IllegalArgumentException("Age must be 18+")
        }
    var gender : Char = gender
        // Custom Setter
        set (value){
            field = if(value == 'M') value else throw IllegalArgumentException("User should be male")
        }
}


