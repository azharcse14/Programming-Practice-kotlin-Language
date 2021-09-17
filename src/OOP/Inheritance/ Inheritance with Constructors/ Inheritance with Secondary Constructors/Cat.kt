package Kotlin.OOP.Inheritance.` Inheritance with Constructors`.` Inheritance with Secondary Constructors`


class Cat:Animal {
    var age = -1

    constructor(color: String, age: Int) : super(color){
        println("$color color and age: $age")
    }

    fun meow(){
        println("Meow")
    }
}