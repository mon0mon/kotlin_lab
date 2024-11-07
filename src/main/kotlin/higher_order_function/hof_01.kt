package higher_order_function

fun main() {
    val list = listOf(1, 2, 3, 4)
    val filteredList = list.filter { it % 2 == 0 }

    println(filteredList)
    // [2, 4]
}