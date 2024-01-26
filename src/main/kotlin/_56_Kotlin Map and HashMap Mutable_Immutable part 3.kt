package main.kotlin

fun main() {


//    Immutable Map: Fixed Size, Read Only:

    println("Immutable: ")
    var Im_map = mapOf<Int,String>(
        2 to "Aditya",
        43 to "Prince",
        9 to "Rahul"
    ) // initializing: we use 'to' keyword to map key and value.

//    now u cannot modify this, becoz this is immutable map.

    for (key in Im_map.keys)
    {
//        println(Im_map[key])
//        or:
        println("$key --> ${Im_map.get(key)}")
    }


    println("\nMutable: ")
    /*
    Mutable: Read and Write
    In mutable we have HashMap, hashMapOf, mutableMapOf
     */

    var m_hsMap = HashMap<Int,String>()

    m_hsMap.put(88,"Abhishek")
    m_hsMap.put(767,"Abhinav")
    m_hsMap.put(625,"Eric")

//    modification:
    m_hsMap.replace(88,"Rahul")
    m_hsMap.put(767,"Abhinandan") // work same as replace().
    for (hs in m_hsMap.keys)
    {
//        println(m_hsMap[hs])
//        or:
        println("$hs --> ${m_hsMap.get(hs)}")
    }

    println()
    var m_hsMap2 = mutableMapOf<Int,String>(2 to "Adi",454 to "Raju") // returns LinkedHashMap<>().
    m_hsMap2.put(4,"Ukrain")
    var m_hsMap3 = hashMapOf<Int, String>(333 to "Rahul Gandhi",444 to "Russia")
    m_hsMap3.put(454 , "Abhiraj")
    m_hsMap3.put(232, "Kerala")

    for (k in m_hsMap2.keys)
    {
        println("$k --> ${m_hsMap2[k]}")
    }

    println()
    for (k in m_hsMap3.keys)
    {
        println("$k --> ${m_hsMap3[k]}")
    }
}