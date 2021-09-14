package Kotlin.ControlFlow

fun main() {

    myloop@ for (x in 'A'..'D'){
        for (n in 1..4){
            if (n==2||n==4)
                continue@myloop

            println("$x and $n")
        }

    }
}