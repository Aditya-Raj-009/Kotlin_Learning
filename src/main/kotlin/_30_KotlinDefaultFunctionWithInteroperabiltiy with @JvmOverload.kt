@file: JvmName("KotlinInteroperability2")

package main.kotlin

fun main() {

    println(findVolume(4,3))

/*    now since java doesn't support default function, so how will we be able
    to call a default function of kotlin in java?

    Ans: by using @JvmOverloads for interoperability above the method.
 */
}

@JvmOverloads
fun findVolume(length:Int,breadth:Int,height:Int = 2):Int
{
    return length * breadth * height;
}