package main.Practice



fun search(arr:Array<Int>,key:Int):Int = arr.indexOf(key);

fun add(vararg v:Int):Int // can accept multiple value.
{
return v.sum();
}

fun product(vararg v:Double):Double
{
    var p:Double = 1.0;
    for( i in 0 until v.size)
    {
        p*=v.get(i)
    }
    return p;
}


fun main(args:Array<String>) {

    var arr:Array<Int> = arrayOf(1,3,4,5,6,8);
    var arr2 = arrayOf<Int>(8,9,1,4,6,3);

    val key:Int = 8;
    println("Index of element $key in ${arr.contentToString()} is ${search(arr,key = key)}");

    println("Sum of 5,6,7,3,and 9 is ${add(5,6,7,3,9)}")

    val arrs: (Array<Int>, Int) -> Int = ::search;
    println("Index of element $key in ${arr2.contentToString()} is ${arrs(arr2, key)}");

    println("Product of 5,6,7,3,and 9 is ${product(5.0,6.7,7.5,3.38,9.7)}")

}