package oop_kotlin

import kotlin.reflect.KProperty

// TODO : Untuk membuat sebuah kelas yang memang bertugas untuk mengatur atau mengelola fungsi getter dan setter untuk sebuah properti kelas. Teknik tersebut pada Kotlin dinamakan Delegate.
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

// TODO : Kemudian untuk mendelegasikan sebuah properti kelas, kita gunakan keyword by dalam menginisialisasi properti tersebut kemudian diikuti dengan namanya.
class Animal3 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}


fun main() {
    val animal = Animal3()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}