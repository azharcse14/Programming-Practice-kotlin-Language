package Kotlin.Map

fun main() {
    val myMap = mapOf(1 to "Hasina", 2 to "Khala", 44 to "jala")

    for (m in myMap){
        println(m)
    }

    for (key in myMap.keys){
        println(myMap[key])
//        println(myMap.keys)
    }
}