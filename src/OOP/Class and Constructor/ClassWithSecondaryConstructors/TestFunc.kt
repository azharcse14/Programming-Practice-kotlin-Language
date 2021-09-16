package Kotlin.OOP.`Class and Constructor`.ClassWithSecondaryConstructors

fun main() {
    var student = Student("Akij", 56)
    var sayHello = student.sayHello()

    println(sayHello)
    println(student.id)
}