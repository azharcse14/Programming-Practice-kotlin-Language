package Kotlin.Function.`User defined functions`

fun main() {

    additionT(22,33)
    additionT(22,33,44)
    additionT(22,33,44,55)

    println(additionT(22.22, 33.33))
    
}

fun additionT(a:Int, b:Int){
    println(a+b)
}


fun additionT(a:Int, b:Int, c:Int){
    println(a+b+c)
}

fun additionT(a:Int, b:Int, c:Int, d:Int){
    println(a+b+c+d)
}

fun additionT(a:Double, b:Double): Double {
    return a+b
}

fun additionT(a:Double, b:Double, c:Double){
    println(a+b+c)
}

