package Kotlin.String

/*Access character in a string at a specific index*/
fun main() {
    var str = "Book"

    /*We can get a character from a specific index in a string using the get() method
    which is equivalent to the charAt() method of Java*/

    println("3rd Index: ${str.get(3)}")

    /**
     * Another way of doing the same
     * This is the recommended way
     */
    println("3rd Index: ${str[3]}")
}