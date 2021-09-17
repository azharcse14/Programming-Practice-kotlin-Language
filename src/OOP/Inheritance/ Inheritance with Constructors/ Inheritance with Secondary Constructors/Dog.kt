package Kotlin.OOP.Inheritance.` Inheritance with Constructors`.` Inheritance with Secondary Constructors`

class Dog:Animal {
    var breed = ""

    constructor(color:String, breed:String):super(color){
        println("$color color and breed: $breed")
    }

    fun bark(){
        println("Dog saheb barking")
    }
}