package Kotlin.Function.`User defined functions`

fun main() {
    
    println(additionT(22,33))
    println(additionT(22,33,44))
    println(additionT(22,33,44,55))
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

