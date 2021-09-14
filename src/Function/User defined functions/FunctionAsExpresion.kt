package Kotlin.Function.`User defined functions`

fun main() {
    var largestNumber = max(40,6)
    println(largestNumber)

    var smallestNumber = min(77,99)
    println(smallestNumber)
}

//Multiple Statement
fun max(a:Int, b:Int):Int =
    if (a>b){
        println("$a is grater Number")
        a
    } else{
        println("$b is grater Number")
        b
    }

//Single Statement
fun min(a:Int, b:Int):Int = if (a<b) a else b