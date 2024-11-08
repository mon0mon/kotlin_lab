package scope_function.apply

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#apply">Kotlin Official Docs</a>
 */
data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)
}
