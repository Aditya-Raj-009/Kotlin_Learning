package main.kotlin

import pow

/** Module Overview:
 *
 * Important functions:
 * filter: Filter our desired elements from a collection.
 * map: Perform operations, modify elements.
 *
 * Predicates: Or a condition that returns True or False:
 * all: Do all elements satisfy the predicate/condition?
 * any: Do any element in list satisfy the predicate?
 * count: Total element that satisfy the predicate.
 * find: Return the First element that satisfy the predicate.
 * last: Return the Last element that satisfy the predicate. Throws exception if not find any element.
 * first : same as find,but throws exception if not find any element.
 *
 * More Functions:
 * flatmap: Filter elements from collection of collection.
 * distinct: Returns unique results.
 *
 */


fun main() {

    val myNumber:List<Int> = listOf<Int>(5,6,4,2,13,19,3,44,7,9,39)

    println("Filter: ")
//    filter:
    val f:(Int)->Boolean = {it<10 } // Or {v -> v<10}
    val mySmallNumber = myNumber.filter(f)

    for(num in mySmallNumber)
    {
        println(num)
    }


    println("\nMap:")
//    map:
    val mySquaredList = myNumber.map{it*it} // Or {n -> n*n}

    for(sqr in mySquaredList)
    {
        println(sqr)
    }


    println("\n Map and Filter together: ")

    val mySmallSquaredNum = myNumber.filter { it<15 }.map{it*it}

    for (ss in mySmallSquaredNum)
    {
        println(ss)
    }

//    apply filter and map on our class person2:
    println("\nmap filter on class person: ")

    var people = listOf<Person2>(
        Person2(23,"Aditya"), Person2(13,"Pranav")
    , Person2(36, "Rahul"), Person2(19,"Prince"), Person2(10,"Sachin")
    )

    var names = people.map { it.name }

    for(name in names)
    {
        println(name)
    }


//    map with filter:
    println()

    var specificPeople = people.filter { it.name.startsWith('P') }
        .map { it.name }

    for (sn in specificPeople)
    {
        println(sn)
    }

}

class Person2(var age: Int, var name:String)
{}