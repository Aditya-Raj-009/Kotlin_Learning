
fun main()
{
//    Arrays:
    val arr:Array<String> = arrayOf("One","Two","Three","Four")
    var arr1:Array<Int> = arrayOf(1,2,3,4)
//    you can also do implicit defile like this:
    var arr2 = arrayOf<Int>(3,4,5,6,7);

    for (i in arr)
    {
        println(i) // print only value.
    }
//    to print with index:

   for ((i:Int,e:String) in arr.withIndex()) {
       println("$i - $e")
   }

//    to print by index:
    for(i in 0 until arr.size)
    {
//        println(arr[i])
        // or can access using get() function:
        println(arr.get(i))
    }
//    you can also set the value at specify position:
    println(arr.set(0,"Hello"))

    println(arr.contentToString()); /* or you can also use any java method directly. */
    println(arr.size)

}