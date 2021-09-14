package Kotlin.Function.`User defined functions`

fun main() {
    sumValuesCrossInline(myOutput = {
        println(it)

        if (it<7){
//            return
        }
        println("Done")
    },
        55,66,{
            println(it)
        })
}

inline fun sumValuesCrossInline(
    crossinline myOutput:(Int)->Unit,
    fN:Int, sN:Int,
    myOutput2:(Int)->Unit){
    var res = fN+sN
    myOutput(res)
    myOutput2(res+2)
}