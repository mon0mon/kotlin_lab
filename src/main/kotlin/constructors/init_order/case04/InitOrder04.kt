package constructors.init_order.case04

open class Animal(name: String) {
    open val name: String = name

    init {
        println("Animal name is : $name")
    }

    fun printName() {
        println("name : $name")
    }
}

class Dog(override val name: String): Animal(name) {
    init {
        println("DOGGY!")
    }
}

fun main() {
    val animal = Animal("moving thing")
    animal.printName()
    val dog = Dog("Golden Retriever")
    dog.printName()
}