package app

import data.City
import data.Country

fun main() {
    val city = City("Bogor")
    val country = Country("Bogor")

    println(city.name)
    println(country.name)
}