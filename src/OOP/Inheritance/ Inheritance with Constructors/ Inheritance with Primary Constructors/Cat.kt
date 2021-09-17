package Kotlin.OOP.Inheritance.` Inheritance with Constructors`.` Inheritance with Primary Constructors`

class Cat(color:String, age:Int):Animal(color) {

    init {
        println("$color color and age: $age")
    }

    fun meow(){
        println("Meow")
    }
}