package lazy

/**
 * @see <a href="https://stackoverflow.com/questions/57178287/what-difference-by-lazy-between-lazy-in-kotlin">Stackoverflow</a>
 */
val host = lazy {
    println("host computed!")
    "Hello"
}

val host2 by lazy {
    println("host2 computed!")
    "Hello"
}

fun main() {
    println(host)
    println(host.value)
    println(host)
    println("-------")
    println(host2)
}
