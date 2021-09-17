package Kotlin.OOP.Inheritance.` Inheritance with Constructors`.` Inheritance with Secondary Constructors`

open class Animal {

    var color = "Blue"

    constructor(color:String){
        this.color = color

        println(color)
    }

    fun eat(e:String){
        println(e)
    }
}