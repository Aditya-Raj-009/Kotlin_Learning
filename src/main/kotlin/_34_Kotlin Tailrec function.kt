package main.kotlin

import java.math.BigInteger

/*
TailRec Functions: It uses recursion in more optimized way then any other
programing language such as Java or C etc.

It prevents Stack overflow exception.

prefix of "tailrec" is used
 */

tailrec fun getFibonacci(n:Int,a:BigInteger,b:BigInteger):BigInteger
{
    if(n==0)
    {
        return b;
    }
    return getFibonacci(n-1,a+b,a)
}
fun main() {

/*    since passed value "10000" is very large ,StackOverFlowError get occur.
 And this happens in java or cpp. But in kotlin we have tailrec by which we can
 escape out from this error.
 */

    println(getFibonacci(10000, BigInteger("1"), BigInteger("0")))

}