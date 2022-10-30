package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Sanas")
    manager.sayHello("Akmal")

    val vicePresident = VicePresident("Akmal")
    vicePresident.sayHello("Ardi")
}