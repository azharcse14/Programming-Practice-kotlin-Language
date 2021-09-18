package Kotlin.`Null Safe Operator`

fun main() {
    val name:String? = null

    println("name length is: ${name?.length}")
}