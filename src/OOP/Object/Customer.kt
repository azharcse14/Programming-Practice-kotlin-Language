package Kotlin.OOP.Object

object Customer:SuperClass() {

    var count = -1

    fun typeOfCustomer():String{
        return "indian"
    }

    override fun myMethod(){
        println("objct method")
    }


}