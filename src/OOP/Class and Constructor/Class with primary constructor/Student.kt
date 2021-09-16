package Kotlin.OOP.Class.`Class with primary constructor`

class Student(name:String) {

    var sName = "dummy"

    init {
        sName = name
        println("this is init block and name is $name")
    }

    fun sayHello(){
        println(sName)
    }
}