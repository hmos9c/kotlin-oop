package app

import data._46Action

fun fireAction(action: _46Action) {
    action.action()
}

class SampleAction : _46Action {
    override fun action() {
        println("This is sample action")
    }
}

fun main() {
    fireAction(SampleAction())
    fireAction(object : _46Action {
        override fun action() = println("Action one")
    })
    fireAction(object : _46Action {
        override fun action() = println("Action two")
    })
}