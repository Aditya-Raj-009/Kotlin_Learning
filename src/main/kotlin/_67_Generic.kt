package main.kotlin

fun main() {
    var gen = _67_Generic<Int,String>()

    gen.put(2 ,"King")
    gen.put(5 ,"Demon")
    gen.put(8 ,"Raj")
    gen.put(1 ,"President")

    println(gen.getValue(8))

    for(i in gen.printMap())
    {
        println(i)
    }
}
class _67_Generic<T,S>
{
private var mList: MutableMap<T, S> = mutableMapOf()

    fun put(key:T, value:S):Unit
    {
        mList.put(key , value)
    }

    fun getValue(key:T): S? {
        return mList.get(key)
    }

    fun printMap():MutableMap<T,S> = this.mList
}