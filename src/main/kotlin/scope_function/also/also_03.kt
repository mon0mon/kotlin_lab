package scope_function.also

data class Person(var name: String, var age: Int)

fun main() {
    var x = 10 // 원시형 변수 (Int)
    val person = Person("Alice", 25) // 참조형 변수 (Person)

    // apply 사용: x는 원시형 변수이기 때문에 내부에서 값을 변경해도 원래 x와 분리된 값으로 취급됩니다.
    val newX = x.apply {
        println("Original x in apply: $this") // 10 출력
        x = 20 // x의 값을 변경
        println("Changed x in apply: $this") // 여전히 10 출력 (this는 복사된 값이므로)
    }

    println("Final x: $x") // x는 20으로 변경되었음
    println("Returned newX from apply: $newX") // apply는 여전히 10을 반환

    // apply 사용: person은 참조형 변수이기 때문에 apply 내부에서 값이 수정되며, 동일한 객체가 유지됩니다.
    val updatedPerson = person.apply {
        println("Original person in apply: $this") // Person(name=Alice, age=25) 출력
        name = "Bob" // name 속성 변경
        age = 30 // age 속성 변경
        println("Changed person in apply: $this") // Person(name=Bob, age=30) 출력
    }

    println("Final person: $person") // Person(name=Bob, age=30) 출력
    println("Returned updatedPerson from apply: $updatedPerson") // Person(name=Bob, age=30) 출력
}
