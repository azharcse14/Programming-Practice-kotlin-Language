package Kotlin.ControlFlow.Loop


fun main() {
    for (i in 1..10){
        for (j  in 'A'..'J'){

            println("$i is $j")
        }

    }

    for (x in 'A'..'D'){
        for (n in 1..4){
            println("$x and $n")
        }

    }
}