package functional_programming


fun main() {
    // Slice (Fungsi slice digunakan untuk menyaring item dari posisi tertentu)
    val totalSlice = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = totalSlice.slice(3..6)

    println(slice)


    // Distinct ( fungsi yang digunakan untuk menghapus elemen-elemen duplikat dari koleksi. )
    val totalDistinct = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDistinct.distinct()

    println(distinct)

    // Chunked (Fungsi yang digunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.  )

    val word = "QWERTY"
    val chunked = word.chunked(3)

    println(chunked)
}