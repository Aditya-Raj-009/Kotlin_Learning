package main.kotlin

/** Null Safety:
 * ? : Nullable receiver
 * ?. : Safe Call Operator
 * !! : Not-null Assertion
 * ?: : Elvis
 * ?.let{..} : Safe Call with let
 */

fun main() {

//    1. Nullable Receiver (?) :
//    By default, kotlin avoid the null value:
//    val name:String = null // throw exception
// To make it nullable, we use nullable receiver operator (?):
    val name: String? = null

//    2. Safe call ( ?. ):
//    Returns the length if 'name' is not null else return NULL
//    Use it if you don't mind getting Null value.

    println("The length of name is ${name?.length}")


//    3. Safe Call with let ( ?.let{} ):
//    It executes the block ONLY IF name is NOT NULL

    name?.let {
        println("The length of the name is ${it.length}")
    }


//    4. Elvis-operator ( ?: ):
//    When we have nullable reference 'name' , we can say "is not null", use it,
//    Otherwise use same non-null value

    val len = if(name!=null)
                        name.length
                    else
                        -1;
//    above can replace by Elvis-operator ( ?: ):

    val length = name?.length?: -1
    println("The length of the name is ${length}")



//    5. Non-null assertion ( !! ):
//    Use it when you are sure the value is NOT NULL
//    Throws NullPointerException if the value is found to be NULL.

    println("The length of name is ${name!!.length}")
}