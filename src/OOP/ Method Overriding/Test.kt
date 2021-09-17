package Kotlin.OOP.` Method Overriding`

fun main() {

    val cat = Cat()
    println(cat.age)
    cat.meow()
    cat.eat("Huri")
    println(cat.color)
    cat.eat()

    val dog = Dog()
    println(dog.breed)
    dog.bark()
    println(dog.color)
    dog.eat("addi")
    dog.eat()

    val animal = Animal()

    animal.eat("Fucka")
    animal.eat()



}
