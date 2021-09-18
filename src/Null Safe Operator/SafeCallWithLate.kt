package Kotlin.`Null Safe Operator`

fun main() {
    var name:String? = null


    name?.let {
        println("name length is: ${name.length}")
    }
}