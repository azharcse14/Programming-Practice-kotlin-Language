package Kotlin.OOP.` Method Overriding`

class Dog:Animal() {
    var breed = ""

    fun bark(){
        println("Dog saheb barking")
    }

    override fun eat(){
        println("hula ban")
    }
}