package Kotlin.ControlFlow.Expression.WhenExpression

fun main() {
    var num = 78

    when(num) {
        in 1..9 -> println("$num is a single digit number")
        in 10..99 -> println("$num is a two digit number")
        in 100..999 -> println("$num is a three digit number")
        else -> println("$num has more than three digits")
    }
}