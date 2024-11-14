package extension_function

class A {
    fun af() = 1
}

class B {
    fun bf() = 2
}

fun f2(lambda: A.(B) -> Int): Int {
    return A().lambda(B())
}

fun main() {
    val result = f2 { b -> this.af() + b.bf() }
    println(result) // 3
}
