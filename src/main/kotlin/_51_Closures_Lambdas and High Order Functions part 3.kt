package main.kotlin

/**
 * Closures:
 * In java 8, you cannot mutate (change) values of outside variable inside lambdas.
 *But in kotlin you can change the values.
 */


fun main() {
    val prg3:Program3 = Program3()

    var result:Int = 0;

    // changing the value of result inside lambda function:
    prg3.addTwoNumber(5,8){x,y -> result = x+y}

    println(result) // 13

//    also you can use lambdas functions as:
    val sumFun: (Int,Int)->Int = {a,b -> a+b}
    println(sumFun(4,5))
}

class Program3
{
    fun addTwoNumber(a:Int, b:Int, action:(Int, Int)->Unit)
    {
         action(a,b)

    }
}