package Kotlin.ControlFlow

fun main() {
    for (i in 1..9){
        if (i==5){
            continue
        }
        println("Print $i")
    }
}