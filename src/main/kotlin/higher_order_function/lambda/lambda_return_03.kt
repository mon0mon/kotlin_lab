package higher_order_function.lambda

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    run loop@{
        list.forEach {
            if (it == value) {
                result += " "
                return@loop
            }
            result += "$it"
        }
    }
    println("result : $result")
}