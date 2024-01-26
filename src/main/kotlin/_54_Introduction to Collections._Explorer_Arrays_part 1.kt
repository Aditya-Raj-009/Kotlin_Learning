package main.kotlin

import kotlin.time.Duration.Companion.seconds

/**
 * Arrays: Mutable but has Fixed Size.
 *
 * Collections:
 * Immutable Collections: Read Only Operations:
 * Immutable List: listOf
 * Immutable Map: mapOf
 * Immutable Set: setOf
 *
 * Mutable Collections: Read and Write Both:
 * Mutable List: ArrayList,arrayListOf, mutableListOf
 * Mutable Map: HashMap, hasMapOf, mutableMapOf
 * Mutable Set: mutableSetOf, hashSetOf
 */

fun main() {

    /**    define Arrays:
     * Array<Int>(size){initial value}
     */
    var myArr = Array<Int>(5){0}

    myArr[0] = 20
    myArr[1] = 19
    myArr[2] = 11
    myArr[3] = 16
    myArr[4] = 15

    println(myArr.contentToString())
    myArr.forEach {
        println(it)
    }
}