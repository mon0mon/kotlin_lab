package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#this">Kotlin Official Docs</a>
 */

fun main() {
    val adam = Person("Adam").apply {
        //  can omit this for receiver object
        //  but it's highly recommended for using for readability
        //  to distinguish with external variables or functions
        age = 20                       // same as this.age = 20
        city = "London"
    }
    println(adam)
}
