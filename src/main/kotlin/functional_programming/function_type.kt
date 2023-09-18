package functional_programming

// TODO : Function Type (Membuat sebuah fungsi menjadi tipe data)

typealias MathOperation = (Int, Int) -> Int

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun main() {
    val add: MathOperation = ::add
    val multiply: MathOperation = ::multiply

    println(add(10, 10))
    println(multiply(10, 10))
}