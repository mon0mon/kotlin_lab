package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html">Kotlin Official Docs</a>
 */
data class Person(var name: String, var age: Int = 0, var city: String = "") {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun main() {
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }
}
