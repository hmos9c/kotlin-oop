package app

import data._7User

fun main() {

    val user1 = _7User("sanas", "rahasia")
    val user2 = _7User("ardi", "rahasia123")

    user1.username = "akmal"
    user1.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}