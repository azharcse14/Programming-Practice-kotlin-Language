package Kotlin.Function.`User defined functions`


fun main() {
    sumValuesNoInline(myOutput = {
        println(it)
        println("Done")
    },
        55,66,{
            println(it)
        })
}

inline fun sumValuesNoInline(
    myOutput:(Int)->Unit,
    fN:Int, sN:Int,
    noinline myOutput2:(Int)->Unit){
    var res = fN+sN
    myOutput(res)
    myOutput2(res+2)
}