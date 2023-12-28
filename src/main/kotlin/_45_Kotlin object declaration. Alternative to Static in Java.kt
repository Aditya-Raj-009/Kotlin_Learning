package main.kotlin

/**
 * What is singleton?
 * Singleton: when we have just one instance of a class in the whole application.
 *
 * Meaning: If class student is declared Singleton then we cannot create objects
 * for this class.
 * There exists only one object for this class by default.
 * And we cannot create objects like student1,student2 etc
 *
 * In java, we define Singleton, by using keyword "static" variables and methods.
 *
 * In kotlin we cannot declare 'static' variable and methods.
 * so we have alternative to that:
 * we declare "object"
 * This creates a singleton object when program runs.
 *
 * These objects:
 * can have properties, methods,and initializers (init block).
 * cannot have constructors.
 * support inheritance.
 *
 */

object Customer{
    var id:Int = -1;    // Behaving as Static variable

//    we can also use init block:
    init {
        println("Hello! I am a Customer class")
    }
    fun registerCustomer() // Behaving as static method.
    {
        println("Hello! I am a new customer")
    }


}

fun main() {

    // calling without creating instance:
    println(Customer.id)
    Customer.registerCustomer()

//    After inherit super class:

    Child.myMethod()
}

// Also object can inherit super class:

open class MySuperClass
{


    open fun myMethod()
    {
        println("MySuperCLass")
    }
}

object Child: MySuperClass()
{
    init {
        println("Hello! I am a Child class")
    }
    override fun myMethod() { // currently, behaving like static method.
        println("Child")
    }
}