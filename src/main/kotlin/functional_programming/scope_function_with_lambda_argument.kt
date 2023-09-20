package functional_programming

fun main() {

    // let (Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek. Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.)
    val message: String? = "Hello World"
    message?.let {
        println(it)
        val length = it.length * 2
        val text = "Text length $length"
        println(text)
    } ?: run {
        val text = "Message is null"
        println(text)
    }

    // Also (Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek. Namun untuk konteks objeknya tersedia sebagai argumen (it). Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya. )

    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}