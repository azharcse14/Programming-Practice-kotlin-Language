package Kotlin.Function.`User defined functions`

fun main() {
    sumValues(33,44) {
        println(it)
    }

    sumValues2(22, {
        println(it)
    }, 33)

    sumValues3(myOutput = { myRes ->
        println(myRes)
    }, 12, 13)

    sumValues4(myOutput = {
        println(it)
    },
    55,66,{
        println(it)
        })
}

fun sumValues(fN:Int, sN:Int, myOutput:(Int)->Unit){
    myOutput(fN+sN)
}

fun sumValues2(fN:Int, myOutput:(Int)->Unit, sN:Int) {
    myOutput(fN + sN)
}

fun sumValues3(myOutput:(Int)->Unit, fN:Int, sN:Int){
    myOutput(fN+sN)
}

fun sumValues4(myOutput:(Int)->Unit, fN:Int, sN:Int, myOutput2:(Int)->Unit){
    var res = fN+sN
    myOutput(res)
    myOutput2(res+2)
}