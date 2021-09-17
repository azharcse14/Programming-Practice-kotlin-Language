package Kotlin.OOP.Interface

fun main() {
    val myButton = MyButton()

    println(myButton.name)

    myButton.onTouch()
    myButton.onClick()
}