package Kotlin.ControlFlow.Expression.WhenExpression

fun main() {
    var age = 18

    when(age){
//        age->{
//            var num = 20 - age
//            println("Age $num")
//        }
        in 1..17 -> {
            val num = 18 - age
            println("You will be eligible for voting in $num years")
        }
        in 18..100 -> println("You are eligible for voting")
    }
}