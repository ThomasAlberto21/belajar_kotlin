package oop_kotlin

// TODO : Abstract class adalah jenis kelas yang tidak dapat diinstansiasi (tidak dapat membuat objek langsung dari kelas tersebut), dan digunakan sebagai dasar untuk membuat kelas-kelas turunannya (subclass). Abstract class memungkinkan Anda untuk mendefinisikan properti dan metode yang dapat digunakan oleh kelas-kelas turunannya, namun tidak memberikan implementasi lengkap untuk metode-metodenya.

abstract class Animal13(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {

    fun eat() {
        println("$name sedang makan !")
    }

    fun sleep() {
        println("$name sedang tidur !")
    }
}

fun main(){
    val animal = Animal13("dicoding animal", 2.6, 1, true)
}