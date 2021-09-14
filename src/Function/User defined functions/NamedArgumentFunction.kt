package Kotlin.Function.`User defined functions`

fun main() {
    student(age = 22)
}

fun student(name:String = "", age:Int = 18){
    println("Name: $name , Age: $age")
}