package Kotlin.ControlFlow.Loop

fun main() {
    var students = arrayOf("Azim", "kalim", "Alim", "Mahi", "Zahid")

    students.forEach { student ->
        println(student)
    }
}