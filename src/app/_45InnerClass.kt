package app

import data._44Boss

fun main() {
    val boss1 = _44Boss("Sanas")
    val employee1 = boss1.Employee("Akmal")
    val employee2 = boss1.Employee("Ardi")

    val boss2 = _44Boss("Balqis")
    val employee3 = boss2.Employee("Akmal")
    val employee4 = boss2.Employee("Ardi")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}