package Kotlin.Function.`User defined functions`

fun main() {
    var sum = getSum(1,2,3,4,5,6,7,8,9,0)
    println(sum)
}

fun getSum(vararg numbers:Int):Int{

    var sum = 0

    for (number in numbers){
        sum = sum + number
    }
    return sum
}