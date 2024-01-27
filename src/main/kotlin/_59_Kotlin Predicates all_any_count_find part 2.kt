package main.kotlin

/**
 * Predicates: Or a condition that returns True or False:
 * all
 * any
 * count
 * find
 * last
 * first
 */

fun main() {
    val myNum = listOf<Int>(5,3,2,32,10,19,11,29,35,7,6)


    val isAll:Boolean = myNum.all { it>10 } // Are all elements greater than 10?
    println(isAll)

    val isAny: Boolean = myNum.any {it>10} // Does any of these elements satisfy the predicate?
    println(isAny)

    val count:Int = myNum.count{it>10} // no of elements satisfy the predicate.
    println(count)

    var findEle : Int? = myNum.find { it>10 } // Returns first element that satisfy the predicate.

    println(findEle)

    val lastEle: Int = myNum.last { it>10 } // Returns last element that satisfy the predicate. throws exception if not find any element.

    println(lastEle)

    val firstEle: Int = myNum.first { it>10 } // same as find, but it throws exception if not find any element.
    println(firstEle)
}