package Kotlin.OOP.` Method Overriding`

class Cat:Animal() {
    var age = -1

    fun meow(){
        println("Meow")
    }

    override fun eat(){
        println("coco krunch")
    }
}