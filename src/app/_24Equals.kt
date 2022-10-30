package app

import data._23Company

fun main() {
    val company1 = _23Company("Sanas")
    val company2 = _23Company("Sanas")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}