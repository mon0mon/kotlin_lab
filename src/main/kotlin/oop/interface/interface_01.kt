package oop.`interface`

interface MyInterface {
    //  Interface can declare Property
    var isActive: Boolean
    fun bar()
    fun foo() {
        //  optional body
        println("printing foo()")
    }
}

class MyInterfaceImpl() : MyInterface {
    // Interface Property must be Initialized on Implementation Class
    override var isActive: Boolean
        get() {
            return true
        }
        set(value) {}

    override fun bar() {
        //  Implemented Abstract Function
        println("Implemented Abstract Function MyInterface:bar()")
    }

}

fun main() {
    val impl = MyInterfaceImpl()
    impl.bar()
    impl.foo()
    println(impl.isActive)
}