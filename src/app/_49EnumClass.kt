package app

import data._48Gender

fun main() {
    val man = _48Gender.MALE
    val woman = _48Gender.FEMALE
    val all48Genders: Array<_48Gender> = _48Gender.values()

    val manFromString = _48Gender.valueOf("MALE")
    val womanFromString = _48Gender.valueOf("FEMALE")

    println(man)
    println(woman)
    println(all48Genders.toList())

    man.showDescription()
    woman.showDescription()
}