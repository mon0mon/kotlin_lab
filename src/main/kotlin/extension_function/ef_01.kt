package extension_function

fun Int.isEven() =
    this % 2 == 0

fun main() {
    val i1 = 2
    val i2 = 3

    println(i1.isEven())
    //  Unresolved reference: isEven
    //  Function Literal with Receiver와 다름
//    println(isEven(i2))
}