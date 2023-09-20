package functional_programming


fun main() {
    val factorial = factorial(5)
    println(factorial)

    val tailCallRecursion = tailCallRecursion(5)
    println(tailCallRecursion)
}

// Recursion (Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.)
fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

// Tail Call Recursion (tail recursion yakni sekumpulan urutan instruksi untuk menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.)
tailrec fun tailCallRecursion(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        tailCallRecursion(n - 1, newResult)
    }
}