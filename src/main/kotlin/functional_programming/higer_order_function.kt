package functional_programming

fun main() {

    // Higher-Order Function
    printResult(10, sum)
    printResult2(10, sum)

}


// TODO : Higher-Order Function, yaitu sebuah fungsi yang menggunakan fungsi lainnya sebagai parameter,
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

// TODO : Inline Function
inline fun printResult2(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}