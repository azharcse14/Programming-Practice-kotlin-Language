package Kotlin.Operators

fun main(args: Array<String>)
{
    var c = 30
    var d = 40
    println("c > d = "+(c>d))
    println("c < d = "+(c.compareTo(d) < 0))
    println("c >= d = "+(c>=d))
    println("c <= d = "+(c.compareTo(d) <= 0))
    println("c == d = "+(c==d))
    println("c != d = "+(!(c?.equals(d) ?: (d === null))))
}
