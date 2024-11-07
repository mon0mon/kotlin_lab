package higher_order_function.lambda

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val value = 3
    var result = ""
    list.forEach iter@{
        if (it == value) {
            result += " "
            return@iter
        }
        result += "$it"
    }
    //  forEach문에서 return 할 경우
    //  현재 iteration에 대해서만 종료 (3)
    //  나머지 요소들에 대해서는 반복 진행
    println("result : $result")
}