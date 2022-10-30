package app

import data._1Person

fun main() {
    val sanas = _1Person()
    sanas.firstName = "Sanas"

    val ardi = _1Person()
    ardi.firstName = "Ardi"

    val akmal = _1Person()
    akmal.firstName = "Akmal"

    println(sanas.firstName)
    println(ardi.firstName)
    println(akmal.firstName)
}