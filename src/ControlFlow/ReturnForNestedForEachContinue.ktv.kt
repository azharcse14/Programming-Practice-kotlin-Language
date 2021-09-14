package Kotlin.ControlFlow

fun main() {
    var employees = arrayOf("MD", "CEO", "CIO", "CTO", "HRM", "TL", "SE", "AO")

    employees.forEach myLoop@{

        employees.forEach {

            if (it=="TL"){
                return@myLoop
            }
        }

        println(it)
    }
}