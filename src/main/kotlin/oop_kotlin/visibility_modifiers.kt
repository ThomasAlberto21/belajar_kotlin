package oop_kotlin

// Private (Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya. Untuk menggunakan modifier private kita perlu menambahkan keyword private. Satu satunya cara untuk mengakses properti private dari sebuah kelas adalah dengan menambahkan fungsi getter dan setter secara manual. Fungsi getter dan setter sebenarnya dihasilkan secara otomatis oleh Kotlin ketika properti tersebut memiliki hak akses public tetapi tidak untuk private. )
class Animal8(
    private var name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean = true
) {

    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

// Protected (Hak akses protected mirip seperti private, namun pembatasannya lebih luas dalam sebuah hirarki kelas. Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya.)
open class Animal9(val name: String, protected val weight: Double)
class Cat(pName: String, pWeight: Double) : Animal9(pName, pWeight)

// Internal (Internal merupakan hak akses baru yang diperkenalkan pada Kotlin. Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul.)

internal class Animal10(val name: String)


// TODO : Main Function
fun main() {

    // Private
    val dicodingCat = Animal8("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

    // Protected
    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
}