package main.Practice

fun main() {
    var k:Int = 56
    var r:String? = "Hello"

    var countVowel:Int? =  r?.CountVowel()

    println("Number of vowel in ${r} is ${countVowel}")
}
 fun String.CountVowel():Int{

    val v:Array<Char> = arrayOf('a','A','e','E','i','I','o','O','u','U')
    var vowel:Int = 0

    for (i in this.toCharArray()){
        if(i in v){
            vowel++
        }
    }
    return vowel
}