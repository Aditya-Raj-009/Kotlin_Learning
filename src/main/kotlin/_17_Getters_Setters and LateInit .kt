import java.util.*

fun main()
{
    val ob = Calculator();
   println( ob.add(3,4));
    println(ob.multiply(3,6));


    val p1 = Person2();
    println(p1.myName)
    p1.myName = "Aditya"; // assign value to set keyword.
    println(p1.myName) ; // getting value.
}
// default constructor:
class Calculator
{
    fun add(a:Int, b:Int):Int
    {
        return a+b;
    }
    fun multiply(a:Int , b:Int):Int{
        return a*b;
    }
}

// lateInit:
class Calculator2
{
    /*   In kotlin whenever we create a properties we have to give its initial value.This is overcome chance of errors.
    But sometimes we need to initialize value later.So for this we use LateInit keyword. By this we can Initialize the value later.
    Also ,there are rule that we can only use LateInit with var and lateInit not use for primitive data types.
     */
    lateinit var message:String;


}


// getters and setters:

class Person2 {
    var myName: String = ""
        get() {
            // Custom getter logic
            return field.uppercase(Locale.getDefault())
        }
        set(value) {
            // Custom setter logic
            field = value
        }
}

