package functional_programming

fun main() {

    // Run (Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.)
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println(result)

    // With (Fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.)
    val message = "Hello kotlin"
    val result2 = with(message) {
        println("Value is $this")
        println("with length ${this.length}")
    }

    println(result2)

    // Apply (Fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this). Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.

    val builder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(builder.toString())
}