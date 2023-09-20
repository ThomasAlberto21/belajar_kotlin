package functional_programming

// Inner Function (Fungsi yang didefinisikan di dalam fungsi lain.)

fun main() {
    println(sum(10, 10))
}


fun sum(valueA: Int, valueB: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("Value must be bigger than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)

    return valueA + valueB
}