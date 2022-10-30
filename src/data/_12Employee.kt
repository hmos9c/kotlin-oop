package data

open class _12Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }
}

open class Manager(name: String) : _12Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, My Name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name){
    // ERROR
//    override fun sayHello(name: String) {
//        println("Hello $name, My Name is Super Manager ${this.name}")
//    }
}

class VicePresident(name: String) : _12Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My Name is Vice President ${this.name}")
    }
}