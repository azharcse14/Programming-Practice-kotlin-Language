package Kotlin.Function.`User defined functions`

fun main() {
    var sum = recSum(4,1)
    println(sum)

}

tailrec fun recursiveFunctionTailrec(){
    println("b " +
            "Hello Tailrec")

    recursiveFunctionTailrec()
}

tailrec fun recSum(i:Long, j:Long):Long{

    return if (i<1){
        j
    }else{
        recSum(i-1, i+j)
    }
}