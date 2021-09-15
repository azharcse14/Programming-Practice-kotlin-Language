package Kotlin.Function.`User defined functions`

fun main() {

    val str1 = "Hello "
    val str2 = "world"
    val str3 = "Hey "
    val res = str3.add(str1,str2)

    println(res)

    val x = 60
    val y:Int =10
    println(x.greaterNumber(y))
}

fun String.add(s1:String, s2:String):String{

    return this + s1 + s2
}

fun Int.greaterNumber(other:Int):Int{
    return if (this>other)
        this
    else
        other
}