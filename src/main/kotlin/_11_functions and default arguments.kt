/*
Basic syntax of a function:
fun functionName(parameter1:dataType,parameter2:dataType):ReturnType  // also note that parameters
in functions are of constant (val) type u cannot reassign them.
{
parameter1 = 5; // you cannot do this.
// block of statements.
return result
}
Remember : as in java void use for no return type, In kotlin we use unit

 */

fun add(num1:Int,num2:Int):Int
{
    return num1+num2;
}

fun even_Odd(num:Int):String
{
    return when(num%2==0){
        true-> "even";
        false-> "odd";
    }
}

// in-liner function:

fun sub(num1:Int,num2: Int):Int = num1-num2;

// default argument:
fun printNtimes(count:Int = 2, user:String = "user") // default parameters.
{
    for(i in 1..count)
    {
        println("Hello $user $i")
    }
}

fun main()
{
    println("Sum is ${add(5,6)}")
    println(even_Odd(6))
    println("Difference is ${sub(5,1)}")

    printNtimes() // run by default parameters

    printNtimes(count = 5,"Aditya")
}