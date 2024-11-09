package companion_object

/**
 * @see <a href="https://kotlinlang.org/docs/object-declarations.html#companion-objects">Kotlin Official Docs</a>
 */
class User3(val name: String) {
    companion object {
        private val defaultGreeting = "Hello"
    }

    fun sayHi() {
        println(defaultGreeting)
    }
}

fun main() {
    User3("Nick").sayHi()
    // Hello
}
