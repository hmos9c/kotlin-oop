package app

import data._12Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee: _12Employee = _12Employee("Sanas")
    employee.sayHello("Akmal")

    employee = Manager("Sanas")
    employee.sayHello("Akmal")

    employee = VicePresident("Sanas")
    employee.sayHello("Akmal")
}