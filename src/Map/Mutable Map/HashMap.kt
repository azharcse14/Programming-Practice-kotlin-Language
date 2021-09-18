package Kotlin.Map.`Mutable Map`

fun main() {
    var myMap = HashMap<Int, String>()

    myMap.put(1, "Konok capa")
    myMap.put(2, "Rojonigondha")
    myMap.put(3, "Joba")
    myMap.put(4, "Poddo")
    myMap.put(5, "Sapla")

    for (m in myMap){
        println(m)
    }

    for (key in myMap.keys){
        println(myMap[key])
//        println(myMap.keys)
    }
}