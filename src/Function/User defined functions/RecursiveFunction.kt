package Kotlin.Function.`User defined functions`

fun main() {
   recursiveFunction5t()
}

fun recursiveFunction(){
    println("Recursive Function")
    recursiveFunction()
}

var i=0
fun recursiveFunction5t(){
    i++
    println("Recursive Function")
    if (i<5){
        recursiveFunction5t()
    }

}