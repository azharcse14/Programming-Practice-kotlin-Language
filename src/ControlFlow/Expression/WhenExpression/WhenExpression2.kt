package Kotlin.ControlFlow.Expression.WhenExpression

fun main() {
    var ch = 'x'

    when(ch){
        'A', 'a',  'E', 'I', 'O', 'U' -> println("$ch is a Vowel")

        else -> println("$ch is a Consonant")
    }
}