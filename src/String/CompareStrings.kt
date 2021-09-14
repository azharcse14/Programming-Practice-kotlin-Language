package Kotlin.String

fun main() {
    var str1 = "Book"
    var str2 = "book"

    /**
     * true if equals, otherwise false
     */
    println("String Equals? : ${str1 == str2}")
    println("String Equals? : ${str1.equals(str2)}")

    /**
     * 0 if equals, otherwise false
     */
    println("String Equals? : ${str1.compareTo(str2)}")
}