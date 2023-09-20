package functional_programming

// TODO : Context Object ( mengacu pada objek yang digunakan untuk mengelola konteks atau lingkungan saat menjalankan operasi tertentu. )

// Lambda receiver (this) adalah sebuah lambda yang didefinisikan di dalam sebuah tipe data dan dapat diakses menggunakan kata kunci this.
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}

// Lambda argument (it) adalah sebuah lambda yang didefinisikan di dalam sebuah fungsi dan dapat diakses menggunakan kata kunci it.
//val text = "Hello"
//text.let {
//    val message = "$it Kotlin"
//    println(message)
//}