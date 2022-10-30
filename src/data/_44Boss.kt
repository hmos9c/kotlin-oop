package data

class _44Boss(val name: String) {

    inner class Employee(val name: String){

        fun hi(){
            println("Hi, my name is $name, my boss name is ${this@_44Boss.name}")
        }

    }
}