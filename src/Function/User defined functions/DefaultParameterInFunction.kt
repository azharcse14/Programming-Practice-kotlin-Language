package Kotlin.Function.`User defined functions`

fun main() {
    var result = findVolume(88,44, 5)
    println(result)
}

fun findVolume(length:Int, breadth:Int, height:Int=10):Int{

    return length*breadth*height

}