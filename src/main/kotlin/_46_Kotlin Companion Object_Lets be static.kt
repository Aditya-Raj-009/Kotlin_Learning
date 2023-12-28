package main.kotlin

/**
 * Companion objects are same as 'object' but declared within a class.
 */

fun main() {

    println(MyClass.count)
    MyClass.typeOfCustomer()

//    or:
    println(MyClass.Customer.count)
    MyClass.Customer.typeOfCustomer()

}

class MyClass
{
    init {
        println("Inside the MyClass")
    }
    // Every member of the companion object behaves like static member of this class.
  companion object Customer // Object name (Customer) is optional.
    {
        init {
            println("I am inside companion object")
        }
        var count:Int = -1

        @JvmStatic // by this Annotation, this method will get convert to java static method and can be called in java code.
        fun typeOfCustomer()
        {
            println("Indian")
        }
    }

    fun demo() // since outside the companion object, we need to make an object of MyClass to call this method.
    {
        println("Part of MyClass")
    }
}
