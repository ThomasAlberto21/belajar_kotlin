package Control_flow

// TODO : When Expression,  yakni mekanisme yang memungkinkan nilai dari sebuah variabel/expression, mampu mengubah alur program.

fun main() {
    val value = 7

    // TODO : else adalah hal wajib jika kita menggunakan when expression untuk mengembalikan nilai.
    val stringOfValue = when (value) {
        6 -> "Value is 6"
        7 -> "Value is 7"
        8 -> "Value is 8"
        else -> "Value cannot be reached"
    }

    println(stringOfValue)

    val value2 = 27
    val ranges = 10..50

    when (value2) {
        in ranges -> println("Value is in the range")
        !in ranges -> println("Value is outside the range")
        else -> println("Value undefined")
    }
}