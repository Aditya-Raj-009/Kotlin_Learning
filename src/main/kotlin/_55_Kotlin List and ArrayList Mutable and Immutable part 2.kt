package main.kotlin

fun main() {

    println("Immutable: ")
//    Immutable List: Fixed Size, Read Only (only can print):
    var iM_list = listOf<String>("Yogi","Monmohan","Vajpayee")

//    list[2] = "abc"; // can't do this , becoz this is immutable list.

//    Read Only:
    for(ele in iM_list.indices)
    {
//        println(iM_list.get(ele))
//        or:
        println(iM_list[ele])
    }


    println("\nMutable: ")
//    Mutable List: Read and Write both:

//    var m_list = mutableListOf<String>("Aditya","Prince","Abhishek")
//     or you can also add element like this:
//
//    m_list.add("Ajay")
//    m_list.add("Johan")


//    var m_list = arrayListOf<String>("Aditya","Prince","Abhishek")
//    or you can also add element like this:
//
//    m_list.add("Ajay")
//    m_list.add("Johan")

    var m_list = ArrayList<String>()
//    or you can also add element like this:

    m_list.add("Ajay")
    m_list.add("Johan")
    m_list.add("Abhishek")
    m_list.add("Aditya")

    for (i in m_list.indices)
    {
//        println(m_list[i])
//        or:
        println(m_list.get(i))
    }

//    removing and replacing element:
    m_list.removeAt(2)

    m_list.add(2,"Modi")
//    or:
    m_list[2] = "PM Modi"

    println(m_list)

}