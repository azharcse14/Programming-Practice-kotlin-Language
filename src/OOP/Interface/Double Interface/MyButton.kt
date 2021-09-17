package Kotlin.OOP.Interface.DoubleInterface

class MyButton:MyInterface, MySecondInterface {
    override var name: String = "Click"

    override fun onTouch() {
        println("onTouch Button")
    }

    override fun onClick() {
        super<MyInterface>.onClick()
        super<MySecondInterface>.onClick()
        println("Button was clicked")
    }
}