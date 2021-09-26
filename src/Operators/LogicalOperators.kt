package Kotlin.Operators

fun main() {
    var x = 100
    var y = 25
    var z = 10
    var result = false
    if(x > y && x > z)
        println(x)
    if(x < y || x > z)
        println(y)
    if( result.not())
        println("Logical operators")
}
