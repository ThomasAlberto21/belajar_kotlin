package Data_class

// Cara ketiga (Menghindari boilerplate code)
data class DataUser3(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I'm $age years old")
    }
}

fun main() {
    // TODO : Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel. Ini bisa dengan mudah kita lakukan pada data class. Dengan fungsi componentN() yang ada pada data class, kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya.

    // Cara pertama
    val dataUser = DataUser("Thomas", 19)
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I'm $age years old")

    // Cara kedua
    val dataUser2 = DataUser("Thomas", 19)
    val (name2, age2) = dataUser2

    println("My name is $name2, I'm $age2 years old")

    // Cara ketiga (Menghindari boilerplate code)
    val dataUser3 = DataUser3("Thomas", 19)
    dataUser3.intro()
}