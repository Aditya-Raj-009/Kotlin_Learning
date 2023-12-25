@file: JvmName("KotlinInteroperability")
package main.kotlin


// we create a java class, and then we use kotlin method in that class.
// And also we use java method in kotlin file (here).

/*
Note: JVM convert kotlin file to kotlin file name with appending 'kt' at the end.
for eg: If a kotlin file name is MyKotlin and after compiling it will convert to
bytecode as MyKotlinKt.class ...this is what the naming convention is followed by kotlin.

so when you call this file (means function of this file) in java class, it will
call as _29_Java_Interoperability...Kt.add().

so if you want to use your custom file name for calling then do this:

@file: JvmName("KotlinInteroperability") add it to top before package.
by this jvm will convert your file to byte code by this name (KotlinInteroperability).

and know java file you can call add method of this file as:
KotlinInteroperability.add(x,y).
 */
 fun main() {

//    calling java method:
    println(_29_JavaInteroperability.multiply(5,6))
}

fun add(a: Int, b:Int):Int{
    return a+b;
}