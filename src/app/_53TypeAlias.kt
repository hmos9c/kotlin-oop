package app

import data._52Application

typealias App = _52Application
typealias Aplikasi = App
typealias App2 = data2._54Application

typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {
    val app = App("Kotlin App")
    val aplikasi = Aplikasi("Kotlin App")
    val app2 = App2("Kotlin App v2")

    sayHello { "Sanas" }
}