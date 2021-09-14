package Kotlin.Function.`User defined functions`

fun main() {

    var sum= {a:Int, b:Int -> a+b}
    println(sum(33,44))
}