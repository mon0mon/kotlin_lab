package constructors.init_order.case06

open class Animal(open val name: String) {
    init {
        println("Animal name is : $name")
    }
}

class Dog(name: String): Animal(name) {
    init {
        println("DOGGY! ${this.name}")
    }
}

fun main() {
    val animal = Animal("moving thing")
    val dog = Dog("Golden Retriever")
}