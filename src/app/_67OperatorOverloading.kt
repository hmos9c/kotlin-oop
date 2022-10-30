package app

import data._66Fruit

fun main() {
    val fruit1 = _66Fruit(100)
    val fruit2 = _66Fruit(100)
    val fruit3 = fruit1 + fruit2
    println(fruit3)

    println(fruit3 - _66Fruit(10))
}