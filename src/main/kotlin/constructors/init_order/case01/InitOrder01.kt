package constructors.init_order.case01

open class Animal(open val name: String) {
    init {
        println("Animal name is : $name")
    }

    fun printName() {
        println("name : $name")
    }
}

class Dog(name: String) : Animal(name) {
    override val name: String = name

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