package app

import data._62Game
import data._65Login
import data._64MinMax

fun minmax(value1: Int, value2: Int): _64MinMax {
    return when {
        value1 > value2 -> _64MinMax(value2, value2)
        else -> _64MinMax(value1, value2)
    }
}

fun login(login: _65Login, callback: (_65Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    val game = _62Game("Game Kotlin", 1000000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)

//    val result = minmax(10, 100)
//    val min = result.min
//    val max = result.max
    val (min, max) = minmax(10, 100)
    println(min)
    println(max)

    val login = _65Login("sanas", "rahasia")
//    login(login){ login ->
//        login.username == "sanas" && login.password == "rahasia"
//    }
    login(login) { (username, password) ->
        username == "sanas" && password == "rahasia"
    }
}