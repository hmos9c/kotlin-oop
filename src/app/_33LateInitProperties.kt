package app

import data._32Television

fun main() {
    val tv = _32Television()
    tv.brand = "Samsung"
    tv.initTelevision("Samsung")
    println(tv.brand)
}