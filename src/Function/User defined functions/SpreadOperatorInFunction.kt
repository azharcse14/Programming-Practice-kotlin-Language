package Kotlin.Function.`User defined functions`


fun main() {
    var array = intArrayOf(1,2,3,4,5,6,7,8,9,0)

    var sum = getSumSO(*array)
    println(sum)

    var sum3 = getSumSO(1,2,3,4,5,6,7,8,9,0,*array)
    println(sum3)

    var sum1 = getSumSO1(0,1,2,3,4,5,6,7,8,9,0,*array)
    println(sum1)

    var sum2 = getSumSO2(0,1,2,3,4,5,6,7,8,9,0,*array, b = 9)
    println(sum2)

}

fun getSumSO(vararg numbers:Int):Int{

    var sum = 0

    for (number in numbers){
        sum = sum + number
    }
    return sum
}

fun getSumSO1(a:Int, vararg numbers:Int):Int{

    var sum = a

    for (number in numbers){
        sum += number
    }
    return sum
}
fun getSumSO2(a:Int, vararg numbers:Int, b:Int):Int{

    var sum = a+b

    for (number in numbers){
        sum += number
    }
    return sum
}