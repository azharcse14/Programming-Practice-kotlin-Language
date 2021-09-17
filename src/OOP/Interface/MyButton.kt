package Kotlin.OOP.Interface

class MyButton:MyInterface {
    override var name: String = "Click"

    override fun onTouch() {
        println("onTouch Button")
    }

    override fun onClick() {
        super.onClick()
        println("Button was clicked")
    }
}