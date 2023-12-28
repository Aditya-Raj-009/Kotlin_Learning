import kotlin.math.pow

fun addition(a:Int, b:Int):Int
{
    return a+b;
}

/*
fun addition(num1:Double, num2:Double):Double
{
return num1+num2;
}
*/

fun pow(n1: Double, n2:Double):Double = n1.pow(n2);

fun main()
{
    println("Addition of 5 and 7 is ${addition(5,7)}")
//    println("Addition of 9.4 and 7.8 is ${addition(9.4,7.8)}")

//    Named argument:
    println("Addition of 5 and 7 is ${addition(a=5,b=7)}");
    println("Addition of 5 and 7 is ${addition(b=7,a=5)}");

    println()
//    in kotlin we can store a function inside a variable like this:
    val fn: (a: Int, b: Int) -> Int = ::addition;    // because of ambiguity we can store only one fun out of two of same name..ie. overloaded function. so we do comment one of them.

    println(fn(4,9)) // so here we call addition function using fn.

    val p: (n1:Double,n:Double)->Double = ::pow;
    println(p(2.5,2.5));
}
