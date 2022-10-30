package data

interface _57Base {
    fun sayHello(name: String)
    fun sayGoodbye(name: String)
}

class MyBase : _57Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }

    override fun sayGoodbye(name: String) {
        println("Good bye $name")
    }
}

class MyBaseDelegate(val base: _57Base) : _57Base by base