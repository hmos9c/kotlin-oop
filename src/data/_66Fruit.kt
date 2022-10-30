package data

data class _66Fruit(val quantity: Int){
    operator fun plus(fruit: _66Fruit): _66Fruit {
        return _66Fruit(this.quantity + fruit.quantity)
    }

    operator fun minus(fruit: _66Fruit): _66Fruit {
        return _66Fruit(this.quantity - fruit.quantity)
    }
}