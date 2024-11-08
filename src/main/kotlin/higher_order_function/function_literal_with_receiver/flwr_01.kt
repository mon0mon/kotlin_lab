package higher_order_function.function_literal_with_receiver

fun main() {
    val sum: Int.(Int) -> Int = { other -> this.plus(other) }
    val i1 = 3
    val i2 = 5
    val result = sum(i1, i2)
    val result2 = i1.sum(i2)
    println(result)
    println(result2)
}
