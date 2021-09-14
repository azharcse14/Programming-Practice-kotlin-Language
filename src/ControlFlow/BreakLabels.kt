package Kotlin.ControlFlow

fun main() {

    myloop@ for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if(n==2)
                break@myloop
        }
    }
}