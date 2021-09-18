package Kotlin.`Null Safe Operator`

fun main() {
    val name:String? = null


    val len = if (name!=null)
                name.length
            else
                -1
    val length = name?.length ?: -1

    println(length)
}