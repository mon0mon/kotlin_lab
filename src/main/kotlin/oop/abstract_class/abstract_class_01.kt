package oop.abstract_class

abstract class MyAbstractClass {
    //  Abstract Class can have State
    var isActive: Boolean
        get() {
            return true
        }
        set(value) {}

    abstract fun bar()
    fun foo() {
        //  optional body
        println("printing foo()")
    }
}

class MyInterfaceImpl() : MyAbstractClass() {
    override fun bar() {
        //  Implemented Abstract Function
        println("Implemented Abstract Function MyAbstractClass:bar()")
    }

}

fun main() {
    val impl = MyInterfaceImpl()
    impl.bar()
    impl.foo()
    println(impl.isActive)
}