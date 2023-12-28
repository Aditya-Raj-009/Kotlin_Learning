package main.kotlin

/**
 * "Any" class is a super class of all the class in kotlin.
 * "Any" class contains functions such as:
 * equals():Boolean
 * hasCode():Int
 * toString():String
 *
 * Data classes simple provide these mentioned methods(above given method)
 * implementations.So we can make effective use of these methods inside the
 * Data classes.
 *
 * When we use the Data classes, kotlin simply provide the copy() method
 * for us.
 *
 *
 */

fun main() {

    var user1 : User = User("Sam",10)
    var user2 : User = User("Sam",10)
    user1.displayUser()
    user2.displayUser()

/*    since both objects contains same value, so after comparing it should be
   equal right?

   Ans: No, it will not equal since both  are different object so two different objects
   get created in heap memory.
 */
    if(user1 == user2)
    {
        println("Equal")
    }
    else{
        println("Not equal") // output when "data" keyword is not added.
    }

//    but after adding the "data" keyword at prefix of class ,the above condition
//    will get true and print "Equal"

//    after adding 'data' keyword at prefix of class:

    println(user1) // output: User(name=Sam, id=10)
    println(user2) // output: User(name=Sam, id=10)

//    copy():

    var newUser:User = user1.copy()

    println(newUser)

    var newUser2 : User = user1.copy(name = "Rahul") // if you want to give different name by keeping id same and vice-versa.

    println(newUser2)

    newUser.displayUser()
    newUser2.displayUser()

    /**
     * output:
     *
     * Equal
     * User(name=Sam, id=10)
     * User(name=Sam, id=10)
     * User(name=Sam, id=10)
     * User(name=Rahul, id=10)
     * User(name=Sam, id=10)
     * User(name=Sam, id=10)
     *
     */
}

  data class User(var name:String, var id:Int) // data classes must contains parameter with var or val.
  {
      fun displayUser():Unit
      {
          println("User name is $name and id is $id")
      }
  }