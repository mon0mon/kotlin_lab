package higher_order_function.function_literal_with_receiver

/**
 * @see <a href="https://thdev.tech/kotlin/2020/09/29/kotlin_effective_04/">Link</a>
 */

/**
 * 1. String?.notNull은 String? 타입의 확장함수로 지정 (Extension Function)
 * 2. named argument body의 경우 String.() -> Unit으로 String 타입을 수신 객체로 삼음 (Lambda Literal With Receiver)
 *      2.1 notNull에서 body를 실행하기 위해서는, 현재 확장함수에서 this 키워드를 사용해서 body의 수신객체로 설정
 *      2.2 body의 수신객체로 전달 받은 이후에, println 에서 $this로 수신객체를 호출하여 출력 (aaa, bbb)
 * 3. Lambda Literal With Receiver의 경우 아래 두가지 경우로도 사용 가능
 *      3.1 <receiver object>.<lambda> (ex notNull1)
 *      3.2 lambda(receiver object> (ex notNull2)
 */
fun String?.notNull1(body: String.() -> Unit) {
    this?.body()
}

fun String?.notNull2(body: String.() -> Unit) {
    if (body != null)
        body(this!!)
}

fun test() {
    "aaa".notNull1 {
        println("this message $this")
    }
    "bbb".notNull2 {
        println("this message $this")
    }
}

fun main() {
    test()
}