package oop_kotlin

// TODO : Interface dalam bahasa pemrograman Kotlin adalah konsep yang memungkinkan Anda untuk mendefinisikan kontrak yang harus diikuti oleh kelas-kelas yang mengimplementasikannya, Interface menggambarkan metode atau sifat yang harus dimiliki oleh kelas yang mengimplementasikannya, tetapi tidak memberikan implementasi konkret. Di Kotlin, interface sering digunakan untuk mencapai abstraksi dan polimorfisme, memungkinkan berbagai kelas untuk berinteraksi dengan cara yang seragam meskipun mereka mungkin memiliki implementasi yang berbeda.

interface IFly {
    fun fly()
    val numberOfWings: Int // Menambahkan properti pada interface
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0) {
            println("Terbang dengan sayap")
        } else {
            println("Makhluk ini tidak bisa terbang")
        }
    }
}

// Anonymous Class ( Anonymous class dalam bahasa pemrograman Kotlin mengacu pada pembuatan objek kelas tanpa harus secara eksplisit mendefinisikan kelas tersebut dengan nama. Anonymous class digunakan untuk membuat implementasi sederhana dari sebuah interface atau kelas abstrak tanpa harus membuat kelas turunan baru.)
fun flyWithWings(bird: IFly) {
    bird.fly()
}

fun main() {
    flyWithWings(object : IFly {
        override fun fly() {
            if (numberOfWings > 0) {
                println("Terbang dengan sayap")
            } else {
                println("Makhluk ini tidak bisa terbang")
            }
        }

        override val numberOfWings: Int
            get() = 2
    })
}