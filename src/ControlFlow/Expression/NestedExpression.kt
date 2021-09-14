package Kotlin.ControlFlow.Expression

fun main() {
    val num = 101
    if(num<0)
        println("Negative Number")
    else {
        //Nested expression
        if(num%2 == 0)
            println("Even Number")
        else
            println("Odd Number")
    }

}