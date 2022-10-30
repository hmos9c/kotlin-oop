package app

import data._52Application
import data._50Utilities

fun main() {
    _50Utilities.name = "Dirubah"
    println(_50Utilities.toUpper("Sanas"))
    a()
    b()

    println(_52Application.Companion.toUpper("Sanas"))
    println(_52Application.toUpper("Sanas"))
}

fun a(){
    println(_50Utilities.name)
}

fun b(){
    println(_50Utilities.name)
}