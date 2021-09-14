package Kotlin

fun main() {
    var a:Int = 33;
    var b:Float = a.toFloat()
    var c:String = b.toString()
    var x:Double = 44.67868
    var y:Int = x.toInt()
    var z:Char = y.toChar()

    println(a)
    println(b)
    println(c)
    println(c)
    println(x)
    println(y)
    println(z)

    /**
     * Double to int type casting
     */
    println("4.554 to int: " + (4.554.toInt()))

    /**
     * int to Char type casting
     */
    println("66 to Char: " + (65.toChar()))

    /**
     * Char to int type casting
     */
    println("B to int: " + ('B'.code))
}