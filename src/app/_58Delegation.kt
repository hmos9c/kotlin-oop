package app

import data.MyBase
import data.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("Sanas")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Ardi")
    baseDelegate.sayGoodbye("Akmal")
}