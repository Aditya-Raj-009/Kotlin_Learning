fun main()
{
//    for loop using 1..5 or until:
    for(i in 1..5)
    {
        println(i)
    }
    println("\nstep keyword:")
//    to increase by more than one we use 'step' keyword:
    for(i in 1..5 step 2)   // i will increase by 2 at every step.
    {
        println(i)
    }

    println("\n downTo keyword:")

    for(i in 5 downTo 1)   // run in decreasing order
    {
        println(i)
    }

    println("\n  decrease by 2:")
    for(i in 5 downTo 1 step 2)   // i will decrease by 2 at every step.
    {
        println(i)
    }


//    String templating:
    val num:Int = 2
    for(i in 1..10)
    {
        println("$num X $i = ${num*i}") // $anything is use for string template in kotlin.
    }

}
