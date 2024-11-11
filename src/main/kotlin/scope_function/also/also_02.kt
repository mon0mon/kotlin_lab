package scope_function.also

fun main() {
    var x = 1
    var y = 2
    x = y.also { y = x }
        .let {
            if (it == 2) println("also this context hasn't changed") else println("also this context has changed")
            it
        }
    println(x)
    println(y)
}
