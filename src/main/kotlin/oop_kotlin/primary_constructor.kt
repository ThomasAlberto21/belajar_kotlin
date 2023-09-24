package oop_kotlin

// TODO : Ketika suatu objek dibuat, semua properti pada kelas tersebut harus memiliki nilai. Kita dapat langsung menginisialisasi pada properti tertentu atau menginisialisasinya melalui constructor (konstruktor). Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.


// TODO : Dalam Kotlin. Primary constructor adalah constructor utama atau utama dari sebuah kelas. Dalam kasus ini, constructor ini memiliki empat parameter: name, weight, age, dan isMammal, dan semua parameter tersebut dideklarasikan sebagai properti (properties) dalam kelas Animal5 pada saat yang sama.
class Animal5(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)


// TODO : Dalam bahasa pemrograman Kotlin, blok init adalah bagian dari deklarasi kelas yang digunakan untuk melakukan inisialisasi tambahan pada properti atau objek kelas. Blok init akan dieksekusi setiap kali objek kelas dibuat, sebelum kode di dalam konstruktor primer (primary constructor) dieksekusi.
class Animal6(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal5("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")


    // TODO : Init Block
    val dicodingCat2 = Animal6("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat2.name}, Berat: ${dicodingCat2.weight}, Umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMammal}")
}
