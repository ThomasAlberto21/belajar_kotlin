package oop_kotlin

// TODO Pada Kotlin menggunakan dua atau lebih fungsi dengan nama yang sama disebut dengan overloading. Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda. Berikut merupakan contoh overloading fungsi eat() pada sebuah kelas Animal.

class Animal12(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val dicodingCat = Animal12("Dicoding Miaw")

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)
}