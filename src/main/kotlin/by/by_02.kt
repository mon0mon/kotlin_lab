package by

/**
 * @see <a href="https://velog.io/@haero_kim/Kotlin-lateinit-vs-lazy-%EC%A0%95%ED%99%95%ED%9E%88-%EC%95%84%EC%84%B8%EC%9A%94">Link</a>
 */
fun main() {
    lateinit var text: String
    val textLength: Int by lazy {
        text.length
    }

    // 대충 중간에 뭔가 했음
    text = "H43RO_Velog"
    println(textLength)
}
