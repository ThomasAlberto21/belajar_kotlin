package Kotlin_fundamental

fun main() {
    // Char (Tipe data yang hanya dapat digunakan untuk menyimpan 1 karakter saja)
    val character: Char = 'A'
    // (Error) val character2: Char = 'ABC'

    // Operasi increment dan decrement
    // TODO : Kenapa kita bisa menggunakan operasi increment dan decrement pada tipe Char? Karena pada dasarnya setiap Characters merupakan representasi dari Unicode. Contoh Unicode A adalah 0041. Ketika kita melakukan increment maka hasilnya adalah 0042 yang mana merupakan Unicode dari B.

    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}