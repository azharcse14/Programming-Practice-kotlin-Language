package Kotlin.Ranges

fun main() {
    val oneToTen = 1..10
    println("3 in oneToTen ${3 in oneToTen}")
    println("7 in oneToTen ${1 in oneToTen}")

    for (i in 111 downTo 1){
        println(i)
    }
}