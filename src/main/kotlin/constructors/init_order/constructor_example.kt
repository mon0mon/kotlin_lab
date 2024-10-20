package constructors.init_order

open class Animal(name: String) {
    open val name: String = name

    init {
        println("Name of Animal is $name")
    }
}

class Person(override val name: String): Animal(name) {
    init {
        println("Primary constructor init: $name")
    }

    constructor(name: String, age: Int) : this(name) {
        println("Secondary constructor: Name = $name, Age = $age")
    }
}

fun main() {
    val person = Person("John", 25)
}