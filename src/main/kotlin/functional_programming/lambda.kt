package functional_programming

// TODO : Lambda adalah ekspresi anonim yang digunakan untuk membuat blok kode yang dapat dioperasikan seperti objek dan dapat digunakan sebagai argumen untuk fungsi atau metode lainnya. Lambda memungkinkan Anda untuk mendefinisikan fungsi dalam baris kode yang singkat tanpa harus membuat fungsi terpisah.

val add: (Int, Int) -> Int = { a, b -> a + b }

fun mathOperation(a: Int, b: Int, operator: (Int, Int) -> Int) {
    val result = operator(a, b)
    println(result)
}

fun main() {
    val resultAdd = add(5, 10)
    println(resultAdd)

    mathOperation(10, 10, add)
}