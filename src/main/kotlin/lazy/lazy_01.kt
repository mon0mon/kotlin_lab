package lazy

/**
 * @see<a href="https://8iggy.tistory.com/257">Link</a>
 */
fun main() {
    val lazyFoo = lazy {
        100
    }
    val foo by lazyFoo
    println(foo) // use foo variable (initialize lazyFoo)
    if (lazyFoo.isInitialized()) {
        println(foo)
    }
}
