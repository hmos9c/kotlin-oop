package app

import data._1Person

fun main() {
    val sanas = _1Person()
    sanas.firstName = "Sanas"
    sanas.middleName = "Feb"
    sanas.lastName = "riyan"

    sanas.sayHello("Akmal")
    sanas.run()

    val fullName = sanas.getFullName()
    println(fullName)
}