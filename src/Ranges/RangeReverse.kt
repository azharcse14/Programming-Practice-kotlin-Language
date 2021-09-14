package Kotlin.Ranges

fun main() {
    val oneToFive = 1..5
    for (n in oneToFive.reversed()){
        println(n)
    }
}