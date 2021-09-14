package Kotlin

fun main() {
    //---------------------------- Declare a String in Kotlin ----------------
    /**
     * These Strings are Immutable which
     * means they are read-only and
     * unchangeable
     */
    val website = "Dimikaloy"

    /**
     * This is how we declare long strings
     */
    val longString = """Welcome to Dimikaloy.com"""


    /**
     * Mutable Strings
     */
    var name = "Azharul"
    var lName = "Islam"
    name = "$name $lName"
    println("Name is: $name")
}