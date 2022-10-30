package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student: Student? = Student("Sanas", 22)
    student.sayHello("Akmal")
    println(student?.upperName)
}