package data_class

/**
 * @see<a href="https://kotlinlang.org/docs/data-classes.html#properties-declared-in-the-class-body">Kotlin Docs</a>
 */

/**
 * Properties inside the primary constructor will use for compiler generated functions
 * like toString(), equals(), hashCode(), copy()
 * To exclude from generated function, declare inside the class
 */
data class Person(
    //  include generated function
    val name: String
) {
    //  exclude from generated function
    var age: Int = 0
}
fun main() {
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20

    println("person1 == person2: ${person1 == person2}")
    // person1 == person2: true

    println("person1 with age ${person1.age}: ${person1}")
    // person1 with age 10: Person(name=John)

    println("person2 with age ${person2.age}: ${person2}")
    // person2 with age 20: Person(name=John)

    val copyPerson1 = person1.copy()
    // also exclude from copy() function
    // which result age become assign default value 0
    println("copyPerson1: $copyPerson1, age: ${copyPerson1.age}")
}
