package Kotlin.With

fun main() {
    var person = Person()

    person.apply{
        name = "Arafat"
        age = 23

        println(age)
    }.worker()

}