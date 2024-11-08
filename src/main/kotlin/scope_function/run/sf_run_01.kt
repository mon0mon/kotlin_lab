package scope_function.run

/**
 * @see <a href="https://kotlinlang.org/docs/scope-functions.html#run">Kotlin Official Docs</a>
 */
class MultiportService(var url: String, var port: Int) {
    fun prepareRequest(): String = "Default request"
    fun query(request: String): String = "Result for query '$request'"
}

fun main() {
    val service = MultiportService("https://example.kotlinlang.org", 80)

    val result = service.run {
        port = 8080
        query(prepareRequest() + " to port $port")
    }

    // the same code written with let() function:
    val letResult = service.let {
        it.port = 8080
        it.query(it.prepareRequest() + " to port ${it.port}")
    }
    println(result)
    println(letResult)
    println("service.port : ${service.port}")
}
