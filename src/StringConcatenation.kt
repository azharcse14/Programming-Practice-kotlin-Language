package Kotlin

fun main(args: Array<String>) {

    //String templates
    val str1 = "hello"
    val str2 = "hi"
    val str3 = "bye"

    // string interpolation
    val str4 = "$str1 $str2 $str3"

    // displaying concatenated string
    println(str4)

    //*************************** String concatenation using Plus (+) Arithmetic Operator *************


    // joining using + operator
    // can also be written like this:
    // val str4 = str1.plus(str2).plus(str3)
    val strP4 = str1 + str2 + str3
    val strP5 = str1 +" "+ str2 +" "+ str3

    // displaying concatenated string
    println(strP4)
    println(strP5)

    //***************************** Concatenation using StringBuilder *************************
    // Obtaining StringBhuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(str1).append(str2).append(str3)

    // StringBuilder to String
    val strSB4 = sb.toString()

    //displaying final string
    println(strSB4)

    var sbp= StringBuilder()
    val x = sbp.append("$str1 ").append(str2+ " ").append(str3)

    println(x)


}