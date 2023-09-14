fun main() {
    // Safe call operator (Operator yang digunakan untuk mengakses nilai dari sebuah variabel yang mungkin null)
    val text: String? = null
    println(text?.length)

    // Elvis operator (Operator yang digunakan untuk mengakses nilai dari sebuah variabel yang mungkin null dan memberikan nilai default jika null)
    val text2: String? = null
    val textLength = text2?.length ?: 7
    println(textLength)
}