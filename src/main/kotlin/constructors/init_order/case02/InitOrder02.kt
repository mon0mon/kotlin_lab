package constructors.init_order.case02

open class Animal(name: String) {
    open val name: String = name

    init {
        println("Animal name is: $name")
    }
}

class Dog(name: String): Animal(name) {
    override val name: String = name
    init {
        println("DOGGY!")
    }
}

fun main() {
    val animal = Animal("moving thing")
    val dog = Dog("Golden Retriever")
}