package Kotlin.Apply

fun main() {
    var person = Person()

    with(person){
        name = "Arafat"
        age = 23

        println(age)
    }
}