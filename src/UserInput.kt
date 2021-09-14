package Kotlin

import java.util.*

fun main() {

    //Display String entered by user
    print("Write anything here: ")

    val enteredString = readLine()
    println("You have entered this: $enteredString")

    print("Please enter your name:")

    println("your name: ${readLine()}")

    //Taking input and converting it into a different type
    print("Write any number: ")

    val number = Integer.valueOf(readLine())
    println("The entered number is: $number")

    //Taking the input other than String using Scanner class
    //creating Scanner object
    val read = Scanner(System.`in`)

    //Taking integer input
    print("Enter an integer number: ")
    var num1 = read.nextInt()

    //Taking float input
    print("Enter a float number: ")
    var num2 = read.nextFloat()

    //Displaying input numbers
    println("First Input Number: $num1")
    println("Second Input Number: $num2")
}