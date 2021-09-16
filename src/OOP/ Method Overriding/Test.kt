package Kotlin.OOP.` Method Overriding`

fun main() {

    val cat = Cat()
    println(cat.age)
    println(cat.meow())
    println(cat.eat("Huri"))
    println(cat.color)
    println(cat.eat())

    val dog = Dog()
    println(dog.breed)
    println(dog.bark())
    println(dog.color)
    println(dog.eat("addi"))
    println(dog.eat())

    val animal = Animal()

    animal.eat("Fucka")
    animal.eat()



}
