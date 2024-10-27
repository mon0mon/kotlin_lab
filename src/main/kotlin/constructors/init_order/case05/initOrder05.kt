package constructors.init_order.case05

open class Animal(name: String) {
    val name: String

    init {
        this.name = name
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