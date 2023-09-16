package Data_class

fun main() {
    // TODO : Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.


    var setA = setOf(1, 2, 3, 4, 2, 5)
    var setB = setOf(1, 2, 3, 4, 5)
    println(setA == setB)
    println(5 in setB) // Menggunakan in untuk mengecek apakah data ada di dalam set

    val setC = setOf(1, 5, 6, 7)
    val union = setB.union(setC) // Menggabungkan setB dan setC
    val intersect = setB.intersect(setC) // Mengambil nilai yang sama antara setB dan setC
    println(union)
    println(intersect)

    //  TODO : Informasi tambahan(Pada Mutable Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List.)

    val mutableSet = mutableSetOf(1, 2, 3, 4, 5)
    mutableSet.add(6)
    mutableSet.remove(5)
    println(mutableSet)
}