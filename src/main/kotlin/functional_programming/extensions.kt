package functional_programming

// TODO : Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties. Jika extension functions digunakan untuk menambahkan fungsi baru, extension properties tentunya digunakan untuk menambahkan sebuah properti baru.


fun main() {
    // TODO : Extension Functions
    10.printInt()

    // TODO : Extension Properties
    println(10.slice)
}


// TODO : Extension Functions
fun Int.printInt() {
    println("value $this") // this(receiver type yang bertindak sebagai objeknya)
}

// TODO : Extension Properties
val Int.slice: Int
    get() = this / 2