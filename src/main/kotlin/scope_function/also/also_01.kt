package scope_function.also

fun main() {
    var x = 1
    var y = 2
    x = y.also { y = x }
    println(x)
    println(y)
}
