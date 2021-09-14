package Kotlin.Array

fun main() {

    /**
     * Array that holds multiple different data types
     */
    var arr = arrayOf(10, "BeginnersBook", 10.99, 'A')

    /**
     * Displaying 4th element
     */
    println(arr[3])

    /**
     * modifying 4th element
     */
    arr[3] = 100

    /**
     * modifying 4t 3rd element
     */
    arr.set(2,100)

    /**
     * Displaying 4th element again
     */
    println(arr[3])

    /**
     * Displaying 3rd element again
     */
    println(arr.get(2))


}