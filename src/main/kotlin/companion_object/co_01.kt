package companion_object

/**
 * @see <a href="https://kotlinlang.org/docs/object-declarations.html#companion-objects">Kotlin Official Docs</a>
 */
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}
