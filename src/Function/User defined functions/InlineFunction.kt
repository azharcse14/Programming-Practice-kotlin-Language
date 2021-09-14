package Kotlin.Function.`User defined functions`

fun main() {
    sumValuesInline(myOutput = {
        println(it)
    },
        55,66,{
            println(it)
        })
}

inline fun sumValuesInline(myOutput:(Int)->Unit, fN:Int, sN:Int, myOutput2:(Int)->Unit){
    var res = fN+sN
    myOutput(res)
    myOutput2(res+2)
}