import javax.swing.text.StyledEditorKit.BoldAction

fun main()
{
// Range:
    /*
    * 1..5 : means 1,2,3,4,5
    * 1 until 5 : means 1,2,3,4
     */
    val num : Int = 10
//    to check whether num is lie between some range or not, we use range:
    val isInRange : Boolean = num in 1..5; // it will check between 1 to 5 where 5 is included.
    println(isInRange)

    val isThere : Boolean = num in 1 until 5; // here 5 is excluded
    println(isThere)

//  when (): when keyword work same as switch case in java:
//        when() as statement:

    val animal:String = "Horse"

    when(animal)
    {
        "Goat" -> println("Animal is goat")
        "Donkey" -> println("Animal is donkey")
        "Horse"-> println("Animal is horse")
        "Bear"-> println("Animal is bear")
        else -> println("Animal not found") // work as default keyword in java.
    }

//    when() as expression:
    val whichNum = when (num)
    {
        1 -> "One"
        2-> "Two"
        in 1..10-> "present in range 1 to 10"
        11 -> "11"
        else -> "Number not found" // work as default keyword in java.

    }
    println("Given number is "+whichNum)
}