package Kotlin.Function.`User defined functions`


fun main() {

    val x = 60
    val y:Int =100
    val res = x greaterValue y
    println(res)
}


infix fun Int.greaterValue(other:Int):Int{
    return if (this>other)
        this
    else
        other
}