package companion_object

/**
 * @see <a href="https://kotlinlang.org/docs/object-declarations.html#companion-objects">Kotlin Official Docs</a>
 */
interface Factory<T> {
    fun create(name: String): T
}

class User6(val name: String) {
    // Defines a companion object that implements the Factory interface
    companion object : Factory<User6> {
        override fun create(name: String): User6 = User6(name)
    }
}

fun main() {
    // Uses the companion object as a Factory
    val userFactory: Factory<User6> = User6
    val newUser = userFactory.create("Example User")
    println(newUser.name)
    // Example User
}
