package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html">Kotlin Official Docs</a>
 */
fun main() {
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)
}
