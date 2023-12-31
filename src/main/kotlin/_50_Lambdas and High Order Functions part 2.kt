package main.kotlin

import kotlin.math.round

/**
 * As we have seen in previous lecture:
 *
 * Lambdas expression looks like:
 * {x,y -> x+y}; where x and y are parameter and after '->' is method body
 * which simply return x+y.
 *
 * we assign these lambda function to a variable like this:
 * val myLambdaFunc: (Int,Int) -> Int = {x,y -> x+y}
 *
 * Now we have also seen how to pass a lambda function as parameter to a
 * high level function. (High level function is nothing but a function which takes
 * lambda function as a parameter or return a lambda function or both):
 *
 * addTwoNumber(4,5 , myLambdaFunc).
 *  or you can also pass like this:
 *  addTwoNumber(4,5 ,{x:Int,y:Int -> x+y})
 *
 * addTwoNumber:
 *
 *  fun addTwoNumber(a:Int, b:Int, myFunc:(Int,Int)->Int){
 *      var result = myFunc(a,b)
 *      println(result)
 *          }
 *
 */

fun main() {

    val prg2:Program2 = Program2()
//val sumFunc:(Int,Int)->Int = {a:Int,b:Int -> a+b}

//    prg2.addTwoNumber(7,9,sumFunc)
//    or:
//    prg2.addTwoNumber(7,9,{ a, b -> a + b })
//    or:
    prg2.addTwoNumber(7,9) { a, b -> a + b }

}

class Program2{
    fun addTwoNumber(a:Int,b:Int, action:(Int,Int)->Int)
    {
        val result:Int = action(a,b)

        println(result)
    }
}