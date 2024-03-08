package main.kotlin

/**
 * High Level Function:
 * can accept function as parameters
 * can return a function
 * Or can do both
 *
 *Lambdas:
 * It is just a function with no name
 */

fun main() {

    val program:Program = Program()
    println("Simple way:")
    program.addTwoNumber(5,7)

//    using interface function:

    /**
     * In java,to implement an interface inside a function we do like this:
     * addNumber(new add(){
     * // interface method code.
     * });
     *But in kotlin there is no "new" keyword, So in place of this, we have
     * "object" keyword.
     *
     * So in kotlin:
     * To create an object of an anonymous class that inherits from some type (or types)
     * , specify this type after object and a colon (:).
     *
     * This is the object expression and is different from object declaration (which
     * we have used previously ...like : object demo{
     * // functions and member body
     * } this use as a static like in java.)
     */
    println("\nUsing Interface:")
    program.addTwoNumber(3,7,object: MyInterface{
        override fun execute(sum: Int) {
            println("The sum is  $sum")
        }

    })

    println("\nUsing High level function with lambda as parameter: ")
// Using High level function with lambda as parameter:

/*    Lambda Expression:
    val myFunc:(parameter type) -> (return type) = {parameter -> body}



    val myFunc:(Int) -> String = {s:Int-> "Hello" }
     // here 's' is a parameter, and after arrow '->' whatever there till '}' is body of the method.

 */

    val test:String = "Hello"

    val myLambda:(Int) -> Unit = {s:Int-> println(s) }

    program.addTwoNumber(2,9,myLambda)

    // another way to call lambda function (using invoke() function):
    myLambda.invoke(45)
}

class Program{

    fun addTwoNumber(a: Int, b: Int,action:(Int)->Unit) // Using High level function with lambda as parameter.
    {
        val sum: Int = a+b
       action(sum)  // from here sum will go to myLambda as a parameter and print sum.
    }
    fun addTwoNumber(a: Int, b: Int, action: MyInterface) // using Interface
    {
        val sum:Int = a+b;
        action.execute(sum)

    }

    fun addTwoNumber(a: Int, b: Int)  // Simple way..just for better understanding.
    {
        println("The sum of $a and $b is ${a+b}")
    }
}



interface MyInterface
{
    fun execute(sum: Int)
}