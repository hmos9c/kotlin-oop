package data

import kotlin.properties.Delegates

class _59Account(description: String = "") {
    val name: String by lazy {
        println("Name is called")
        "Sanas"
    }

    var description: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}