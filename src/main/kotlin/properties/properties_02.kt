package properties

class Animal(
    name: String,
    age: Int
) {
    var name: String = name
        get() = field
        set(value) {
            field = value.uppercase()
        }

    var age: Int = age
        get() = field
        set(value) {
            if (value > 0) field = value else throw IllegalArgumentException("Age must be positive")
        }

    override fun toString(): String {
        return "Animal(name='$name', age=$age)"
    }
}

fun main() {
    val animal = Animal("Lion", 5)
    println(animal)

    try {
        animal.name = "tiger"
        animal.age = -1
    } catch (e: IllegalArgumentException) {
        println(e.message)
        animal.age = 2
    } finally {
        println(animal)
    }
}
