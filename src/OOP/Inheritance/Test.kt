package Kotlin.OOP.Inheritance

fun main() {

    val cat = Cat()
    println(cat.age)
    println(cat.meow())
    println(cat.eat("Huri"))
    println(cat.color)

    val dog = Dog()
    println(dog.breed)
    println(dog.bark())
    println(dog.color)
    println(dog.eat("addi"))

}
