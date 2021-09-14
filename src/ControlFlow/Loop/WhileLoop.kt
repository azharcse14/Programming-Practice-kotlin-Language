package Kotlin.ControlFlow.Loop

fun main() {
    var num = 10

    //A simple while loop in Kotlin

    while(num>=5){
        println("Loop: $num")
        num--
    }

    while (num<=100){
        println(num)
        num++
        Thread.sleep(1000)
    }

    //Infinite While loop
    while (true){
        println("Infinite")
    }

    while(num>=5){
        println("Loop: $num")
        num++
    }

    while(num<=10){
        println("Loop: $num")
        num--
    }
}