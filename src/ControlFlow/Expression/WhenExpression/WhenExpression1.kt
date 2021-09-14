package Kotlin.ControlFlow.Expression.WhenExpression

fun main() {
    var ch = 'a'

    when(ch) {

        'A','a' -> println("$ch is vowel")
        'E','e' -> println("$ch is vowel")
        'I','i' -> println("$ch is vowel")
        'O','o' -> println("$ch is vowel")
        'U','u' -> println("$ch is vowel")

        else -> println("$ch is Consonant")
    }
}