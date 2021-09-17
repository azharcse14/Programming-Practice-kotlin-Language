package Kotlin.OOP.Inheritance.` Inheritance with Constructors`.` Inheritance with Primary Constructors`

class Dog(color:String, breed:String):Animal(color) {

    init {
        println("$color color and breed: $breed")
    }

    fun bark(){
        println("Dog saheb barking")
    }
}