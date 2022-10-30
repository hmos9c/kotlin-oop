package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Sanas")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Sanas", 1000000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}