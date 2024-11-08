package scope_function

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#context-object-this-or-it">Kotlin Official Docs</a>
 */
fun main() {
    val str = "Hello"
    // this
    str.run {
        println("The string's length: $length")
        //println("The string's length: ${this.length}") // does the same
    }

    // it
    str.let {
        println("The string's length is ${it.length}")
    }
}
