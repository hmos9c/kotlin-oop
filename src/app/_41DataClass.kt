package app

import data._40Product

fun main() {
    val product = _40Product("Indomie", 2500, "Food")
    val product2 = product.copy(name = "Supermie")

    println(product)
    println(product2)
}