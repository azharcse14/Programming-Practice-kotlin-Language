package Kotlin.Collections

fun main() {
    val myArray = Array<Int>(5){ 0 }

    myArray[0] = 8
    myArray[4] = 33
    myArray[1] = 12

    for (element in myArray){
        println(element)
    }
}