package Kotlin.Function.`User defined functions`


fun main() {
    var array = intArrayOf(1,2,3,4,5,6,7,8,9,0)
    
    var sum = getSumSO(*array)
    println(sum)

    var sum2 = getSumSO(1,2,3,4,5,6,7,8,9,0,*array)
    println(sum2)
}

fun getSumSO(vararg numbers:Int):Int{

    var sum = 0

    for (number in numbers){
        sum = sum + number
    }
    return sum
}