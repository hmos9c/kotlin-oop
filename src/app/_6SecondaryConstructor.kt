package app

import data._3Address

fun main() {
    val address1 = _3Address("Jalan A", "Jakarta")
    val address2 = _3Address("Jalan A", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}