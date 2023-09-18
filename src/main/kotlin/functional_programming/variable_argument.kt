package functional_programming

// TODO : Selain named dan default argument, Kotlin juga memiliki vararg (variable argument). Dengan menggunakan kata kunci vararg kita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.

fun main() {
    val numbers = sumNumbers(10, 20, 30, 40, 50)
    println(numbers)
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}