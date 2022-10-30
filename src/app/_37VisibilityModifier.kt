package app

import data.SuperTeacher

fun main() {
    val teacher = SuperTeacher("Sanas")
    println(teacher.name)
    // teacher.teach() // error
    teacher.test()
}