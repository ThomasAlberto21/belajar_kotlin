package Data_class

fun main() {

    // TODO : Filter digunakan untuk memfilter collection. Filter akan mengembalikan collection baru yang sudah difilter sesuai kondisi yang telah ditentukan.
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numberListFilter = numberList.filter { it % 2 == 0 }
    println(numberListFilter)

    // TODO : FilterNot digunakan untuk memfilter collection. FilterNot mem-filter list berdasar hasil yang tak sesuai dengan kondisi yang diberikan.
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numberList2FilterNot = numberList2.filterNot { it % 2 == 0 }
    println(numberList2FilterNot)

    // TODO : Map digunakan untuk membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val multipliedBy5 = numberList3.map { it * 5 }
    println(multipliedBy5)

    // TODO : Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.

    val numberList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(numberList4.count())

    // TODO : Fungsi find() digunakan untuk mencari item di dalam collection. Fungsi ini akan mengembalikan nilai null jika item yang dicari tidak ditemukan.
    val numberList5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList5.find { it % 2 == 1 }
    val firstOrNullNumber = numberList5.firstOrNull { it % 2 == 3 }
    val lastOrNullNumber = numberList5.lastOrNull { it % 2 == 3 }
    println(firstOddNumber)
    println(firstOrNullNumber)
    println(lastOrNullNumber)

    // TODO : Fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
    val numberList6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList6.first { it > 10 }
    val lessThan10 = numberList6.last { it < 10 }
    print(moreThan10)
    print(lessThan10)

    // TODO : sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending.

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val kotlinChar2 = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar2.sortedDescending()
    println(descendingSort)

}