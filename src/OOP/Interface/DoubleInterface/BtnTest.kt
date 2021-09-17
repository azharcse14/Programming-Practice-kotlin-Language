package Kotlin.OOP.Interface.DoubleInterface

fun main() {
    val myButton = MyButton()

    println(myButton.name)

    myButton.onTouch()
    myButton.onClick()
}