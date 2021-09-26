package Kotlin.Operators

fun main()
{
    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits: " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())
}
