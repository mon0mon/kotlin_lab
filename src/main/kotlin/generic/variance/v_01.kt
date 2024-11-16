package generic.variance

/**
 * 공변성(Covariance) - out
 * 제네릭 타입이 상위 타입으로 대체 가능하도록 허용.
 * **생산자(Producer)**로만 사용되며, 읽기 전용이 보장됩니다.
 * 제약 조건: out을 선언한 타입 파라미터는 반환 값에서만 사용할 수 있고, 입력 값으로는 사용할 수 없습니다.
 */
class Box<out T>(private val item: T) {
    fun get(): T = item // 반환만 가능
}

/**
 *  반공변성(Contravariance) - in
 * 제네릭 타입이 하위 타입으로 대체 가능하도록 허용.
 * **소비자(Consumer)**로만 사용되며, 쓰기 전용이 보장됩니다.
 * 제약 조건: in을 선언한 타입 파라미터는 입력 값에서만 사용할 수 있고, 반환 값으로는 사용할 수 없습니다.
 */
class Comparator<in T> {
    fun compare(item1: T, item2: T): Boolean {
        return item1?.equals(item2) ?: false
    }
}

class Bucket<T>(private val item: T)

fun main() {
    val intBox: Box<Int> = Box(42)
    val numberBox: Box<Number> = intBox // Int는 Number의 하위 타입
    println(numberBox.get()) // 42

    val numberComparator: Comparator<Number> = Comparator()
    val intComparator: Comparator<Int> = numberComparator // Number는 Int의 상위 타입
    println(intComparator.compare(42, 42)) // true

    val intBucket: Bucket<Int> = Bucket(42)
    //  Type mismatch.
//     val numberBucket: Bucket<Number> = intBucket // 컴파일 에러 (불변성 때문)
}
