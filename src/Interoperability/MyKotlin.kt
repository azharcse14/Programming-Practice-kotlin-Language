package Kotlin.Interoperability

import Interoperability.Java

fun main() {
    val i = Java()
    println(i)
}

fun hello(){
    println("Hello Kotlin")
}

@JvmOverloads
fun sum(a:Int, b:Int, c:Int=0):Int{
    return a+b+c
}