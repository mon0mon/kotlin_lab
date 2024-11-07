package higher_order_function.lambda

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    list.forEach {
        result += "$it"
        if (it == value) {
            println("result : $result")
            return
        }
    }
    println("Never gets here")
}