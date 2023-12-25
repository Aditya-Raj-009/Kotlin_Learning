fun main() {
    val x = 10
    val y = 20

    if (x > y) {
        println("x is greater");
    } else if (y > x) {
        println("y greater")
    } else {
        println("equals")
    }

//    unlike java kotlin don't have ternary operator. But we can do it by using if else and when() as expression in kotlin:

//    using if else:
    val greater = if (x > y) {
        x;
    } else {
        y;
    }
    println("Greater : " + greater)

//  when (): when keyword work same as switch case in java:
//        when() as statement:
    when (x < y) {
        true -> println("x is lesser")
        false -> println("y is lesser");
        else -> println("They both are equal")  // work as default keyword in java.
    }

//    when() as expression:
    val lesser = when (x < y) {
        true -> x
        false -> y
    }
    println("Lesser : " + lesser);
}