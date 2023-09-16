package Data_class

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "Tokyo" to "Japan"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    // TODO : Kita dapat menampilkan key apa saja yang ada di dalam Map dengan menggunakan fungsi keys() dan values(). Fungsi ini akan mengembalikan nilai  berupa Set.

    val mapKeys = capital.keys
    val mapValues = capital.values
    println(mapKeys)
    println(mapValues)

    // TODO : Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable.

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)

}