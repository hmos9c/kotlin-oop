package app

import data._2Car

fun main() {
    val avanza = _2Car("Toyota")
    avanza.year = 2021

    val almaz = _2Car("Wuling", "Almaz")

    println(avanza.brand)
    println(avanza.year)
    println(almaz.brand)
    println(almaz.year)
}