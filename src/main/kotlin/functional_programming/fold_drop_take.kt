package functional_programming


fun main() {

    // Fold (kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold().)
    val numbersFold = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val fold = numbersFold.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    // Drop (Fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan. )

    val numberDrop = listOf(1, 2, 3, 4, 5, 6)
    val drop = numberDrop.drop(3)

    println(drop)

    // Take (fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection. )
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)
}

