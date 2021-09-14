package Kotlin.Ranges

fun main() {

    val oneToTen = 1..10
    val odd = oneToTen.step(2)

    for(n in odd){
        println(n)
    }

    println("\n\n")

    for (i in 2..10 step 2){
        println(i)
        Thread.sleep(1000)
    }
}