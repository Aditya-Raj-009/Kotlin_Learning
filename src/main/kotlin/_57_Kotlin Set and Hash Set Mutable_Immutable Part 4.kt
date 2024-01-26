package main.kotlin

fun main() {

//    Immutable Set: Read Only

    println("Immutable:")
    var Im_set = setOf<Int>(2,3,4,5,2) // ordered

    println(Im_set)


//    Mutable Set:

    println("\nMutable:")
    var m_set = mutableSetOf<Int>(3,4,5,2,4,5) // ordered
    m_set.remove(4)
    println(m_set)
    m_set.add(120)
    m_set.add(34)
    println(m_set)

    println()
    var m_hset = HashSet<Int>() // unordered
    m_hset.add(4)
    m_hset.add(6)
    m_hset.add(12)
    println(m_hset)

    println()
    var m_hset2 = hashSetOf<Int>(2,3,4,5) // unordered
    println(m_hset2)


}