package Kotlin.Ranges

fun main() {
    val oneToFive = 1.rangeTo(5)
    val sixToThree = 6.downTo(3)

    println("rangeTo:")
    for(x in oneToFive){
        println(x)
    }

    for (i in 1.rangeTo(5)){
        println(i)
    }

    println("downTo")
    for(n in sixToThree){
        println(n)
    }

    for (i in 9.downTo(1)){
        println(i)
    }
}