package Kotlin.OOP.` Method Overriding`

open class Animal {

    var color  = "Red"

    fun eat(e:String){
        println(e)
    }

    open fun eat(){
        println("coco")
    }
}