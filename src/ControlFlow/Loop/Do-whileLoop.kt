package Kotlin.ControlFlow.Loop

fun main() {
    var num = 10

    //Kotlin do-while loop Example
    do {
        println(num)
        num++
    }while (num<=15)

    //A do-while loop at least run once
    do {
        println("Loop: $num")
        num++
    }
    while (false)

    //Infinite do while loop in Kotlin

//    Example 1:
    do {
        println("Loop: $num")
        num++
    }
    while (true)

//    Example 2:
    do {
        println("Loop: $num")
        num--
    }
    while (num<=105)

//    Example 3:
    do {
        println("Loop: $num")
        num++
    }
    while (num>=100)
}