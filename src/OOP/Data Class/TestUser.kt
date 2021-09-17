package Kotlin.OOP.`Data Class`

fun main() {
    var user1 = User("Asfak Nipun", 26)
    var user2 = User("Asfak Nipun", 26)

    println(user1)

    println(user2.toString())

    println(user1.equals(user2))

    if (user1 == user2){
        println("Equal")
    }else{
        println("Not Equal")
    }

    var newUser = user1.copy(age = 55)
    println(newUser)
}