package Kotlin.String

/* We can display a substring in Kotlin using the subSequence() method.
We can provide the fromIndex and toIndex in the subSequence(fromIndex, toIndex) method where fromIndex is inclusive and toIndex is exclusive.*/

fun main() {
    var str = "Bangladesh"

    /**
     * Here fromIndex is inclusive and
     * toIndex is exclusive which means
     * 5th index char will not be included
     */
    println("Index from 2 to 5: " + str.subSequence(2,5))
}