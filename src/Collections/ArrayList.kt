package Kotlin.Collections

fun main() {
    var list = ArrayList<String>()

    list.add("Bangla")
    list.add(1,"English")
    list.add("ICT")

    for (i in list){
        println(i)
    }

    println(list.size)
}