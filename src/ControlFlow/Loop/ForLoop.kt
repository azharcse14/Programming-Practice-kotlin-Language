package Kotlin.ControlFlow.Loop

fun main() {

    //A simple example of for loop in Kotlin
    for(i in 1..10){
        println("range i: $i")
    }
    println()

    //Kotlin for loop using Array
    val myArray = arrayOf("Steve", "Robin", "Kate", "Lucy")
    for (i in myArray){
        println("array i: $i")
    }
    println()

    //Kotlin for loop iterating though array indices
    for (n in myArray.indices){
        println("myArray[$n]: ${myArray[n]}")
    }
    println()

    //Function withIndex() in for loop
    for ((index, value) in myArray.withIndex()){
        println("Index: $index  Value: $value")
    }
}