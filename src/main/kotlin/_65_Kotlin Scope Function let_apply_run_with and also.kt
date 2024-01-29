package main.kotlin

/**
 * There are 5 types of scope function:
 * 1) with
 * 2) let
 * 3) run
 * 4) apply
 * 5) also
 *
 * why we need scope function?
 * Answer:
 * // example 1:
 * class Person{
 * var name :String? = null
 * var age: Int? = null
 * }
 * // in main function:
 * // ordinary code:
 * val person = Person()
 * person.name = "Aditya"
 * person.age = 21
 *
 * // code with scope function:
 * val person = Person().apply{
 * name = "Aditya"
 * age = 21
 * }
 * // so basically, scope functions makes your code more concise and readable.
 *
 * when to use which scope function, is solved by solving this question:
 * How to distinguish between these scope functions?
 * Answer:
 *There are 2 main difference between the scope functions:
 * 1) The way to refer to the context object:
 * Either 'this' or 'it'
 * 2) The return value:
 * Either 'context object' or the 'lambda result'
 *
 * with:
 * Return: lambda result (last value that written in lambda)
 * Refer to Context Object: this
 * use: if you want to operate on a non-null object.
 *
 * apply:
 * Return: Context object (this)
 * Refer to Context Object: this
 * use: if you want to initialize or configure an object.
 *
 * also:
 * Return: Context object (this)
 * Refer to Context object: it
 * 'also' function generally use when we want to perform some additional operation
 * on a particular object after we have initialized it.
 * use: If you want to do some additional object configuration or operations.
 *
 * let:
 * Return: lambda result (last value that written in lambda)
 * Refer to Context object: it
 * use: If you want to just execute lambda expression on a nullable object
 * and avoid NullPointerException.
 *
 * run: (combination of 'wit' and 'let' function)
 * Return: lambda result (last value that written in lambda).
 * Refer to Context object: this.
 * use: If you want to operate on a nullable object and avoid nullPointerException.
 *
 */

// example of with():
class People
{
     var name :String? = null
    var age: Int? = null
}

fun main() {


    // with:
    println("with: ")
    val withEx = People()
   var withReturn = with(withEx) {
        name = "Aditya"
        age = 21
//       whatever last value you write will return as a lambda result:
       "ok"  // here before '87' 'ok' was written so if 87 would not be there,
       // it would return 'ok' and variable type would be String.
       87 // but here last value is '87' so variable 'withReturn' will be
//       of type int, and it contains 87 as value.
//       Any if not given anything then it returns nothing and variable type will be
//       unit.
    }

    println(withReturn) // 87
    
//    also you can use 'with' block to access the value:
    with(withEx){
        println(name) // or this.name.
        println(age) // or this.age.
    }


//    apply:
    println("\napply:")
    val apply = People()
        var duplicate_apply = apply.apply {
        name = "Prince"
        age = 21
        println(name)
        println(age)
        // 'apply' returns Context object (this)
    }
// changes reflect in 'apply' variable also:
    println(apply.name) // Prince
    println(duplicate_apply.name) // Prince

    // generally in kotlin we use 'apply' like this : var people = People().apply{}


//    also:
    println("\nalso:")

    val numberList:MutableList<Int> = mutableListOf(1,3,4,5)

//   Let some operations on the numberList you want to perform:
   /*
   println("The list elements are : $numberList")
    numberList.add(78)
    println("The updated list elements are : $numberList")
    numberList.remove(3)
    println("The number list after removing 3 : $numberList")
    */

//    so above all operations can be written in 'also' function:

  val duplicate_numList =  numberList.also {
        println("The list elements are : $it")
        it.add(78)
        println("The updated list elements are : $it")
        it.remove(3)
        println("The number list after removing 3 : $it")

        // 'also' returns context object (this)
    }

    println(duplicate_numList)
//    changes also reflects in original list (numberList):
    println(numberList)

//    another example of also:
    println("\nanother example of also:")

    val apply_also = People().apply {
        name = "Rahul"
        age = 34
    }.also {
        it.name = "Abhinash" // will update in original object as well.
        println("The name is ${it.name}")
    }
    println("The name in original object is ${apply_also.name}")

//    let:
    println("\nlet:")
//    we use 'let' function to avoid nullPointer exception.
    val let_name:String? = "Hello"
//    let you want to perform following operation:
    /*
    println(name!!.reversed())
    println(name!!.capitalize())

     */
//    above statements can throw null pointer exception if name is null,so to avoid this, we use 'let':

   val nameLength = let_name?.let { // execute code of block if name is not null
        println(it.reversed())
        println(it.capitalize())

//        returns lambda result (whatever the value is written inside lambda)
       it.length // here last value is 'it' length' so it returns length of 'name'
//       and if not given any statement, it returns nothing.
    }

    println(nameLength)

    // run:
    println("\nrun:")
    val run_people:People? = People()
    val intro_run = run_people?.run {
        name = "Akash"
        age = 45
       println(name)
        println(age)

    "Hello! my name is $name and my age is $age" // return as the lambda result.
    }

    println(intro_run)
}



