package oop_kotlin

// TODO : Getter adalah metode atau fungsi yang digunakan untuk mengambil nilai dari sebuah variabel atau properti dalam sebuah objek.
// TODO : Setter adalah metode atau fungsi yang digunakan untuk mengubah atau mengeset nilai dari sebuah variabel atau properti dalam sebuah objek.
// TODO : Properti field digunakan untuk merujuk ke variabel yang akan diakses atau diubah dalam metode setter dan getter.
class Animal2 {
    var name: String = "Riot"
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }
}

fun main() {
    val thomasCat = Animal2()
    println("Nama: ${thomasCat.name}")
    thomasCat.name = "Ica"
    println("Nama: ${thomasCat.name}")
}