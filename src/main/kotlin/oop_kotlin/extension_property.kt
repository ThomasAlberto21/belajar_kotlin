package oop_kotlin

class Animal4(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal4.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"


fun main() {
    val dicodingCat = Animal4("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}")
    println("Berat: ${dicodingCat.weight}")
    println("Umur: ${dicodingCat.age}")
    println("Mamalia: ${dicodingCat.isMammal}")
    println(dicodingCat.getAnimalInfo)
}