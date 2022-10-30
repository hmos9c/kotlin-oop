package app

import exception._69ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw _69ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Sanas")
        // validateAndSayHello("")
        println("Program")
    } catch (error: _69ValidationException) {
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable) {
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}