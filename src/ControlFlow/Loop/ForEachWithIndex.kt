package Kotlin.ControlFlow.Loop

fun main() {
    var employees = arrayOf("MD", "CEO", "CIO", "CTO", "HRM", "TL", "SE", "AO")

    employees.forEachIndexed { index, employee ->
        println("$index -> $employee")
    }
}