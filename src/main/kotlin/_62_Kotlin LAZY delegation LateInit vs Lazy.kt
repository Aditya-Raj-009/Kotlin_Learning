package main.kotlin

/** Lazy Keyword:
 * If there is a initialized variable in your program, and you are hardly using it Or you are
 * not using it, then also that variables takes the memory.
 * So to get the rid of this, we use 'Lazy' keyword.
 * syntax:
 * val myVar:DataType by lazy { value }.
 * Now unless you use this variable, this variable will not be initialized.
 *
 * And If you use it once, it save the value in the catch memory and will not be initialized
 * again and again whenever you use it, rather it will be loaded from catch memory.
 *
 * It is thread safe.
 *
 * lazy keyword can be used with both val and var.
 * And can also be used with nullable or non-nullable variable.
 */

//val pI: Float = 3.14f // waste of memory when you hardly use it Or not even use it.
//    so:
val PI:Float by lazy {3.14f } // value will not be initialized to the variable unless you use it.
fun main() {

    val area = PI*4*4


}