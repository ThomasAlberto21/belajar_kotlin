package Data_class

fun main() {
    // TODO : Data class juga memungkinkan kita untuk menyalin sebuah objek dengan sangat mudah hanya dengan memanfaatkan fungsi copy()

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
}