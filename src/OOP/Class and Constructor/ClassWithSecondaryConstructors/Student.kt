package Kotlin.OOP.`Class and Constructor`.ClassWithSecondaryConstructors

class Student(name:String) {

    var sName = "dummy"
    var id = -1

    init {
        sName = name
        println("this is init block and name is $name")
    }

    constructor(name: String, id:Int):this(name){
        this.id = id
    }

    fun sayHello(){
        println(sName)
    }
}