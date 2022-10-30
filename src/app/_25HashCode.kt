package app

import data._23Company

fun main() {
    val company1 = _23Company("Sanas")
    val company2 = _23Company("Sanas")

    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}