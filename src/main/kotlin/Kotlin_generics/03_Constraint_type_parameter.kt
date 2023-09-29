package Kotlin_generics

class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}


fun main(){
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    // val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds
}