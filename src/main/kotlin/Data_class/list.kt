package Data_class

fun main() {

    // TODO : List tidak dapat dimanipulasi karena bersifat immutable dan jika ingin memanipulasi list, gunakan mutableListOf
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val charList = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G')
    val anyList = listOf('A', "Kotlin", 3, true, 0.5, 1L)

    println(numberList[2]) // Mengakses list dengan indeks
    println(charList)
    println(anyList)

    // Mutable List
    val mutableList = mutableListOf(1, "A", 3, 4, true, 6, null, 8, 9)
    mutableList.add(10) // Menambahkan data ke list
    mutableList.add(1, "love")
    mutableList[3] = 7 // Mengubah data pada list
    mutableList.removeAt(7) // Menghapus data pada list

    println(mutableList)
}