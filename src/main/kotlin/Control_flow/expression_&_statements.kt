package Control_flow

// TODO : Statement adalah perintah yang dijalankan oleh program dan tidak akan menghasilkan nilai sedangkan untuk expression adalah statements yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel

fun main() {
    val officeOpen = 7
    val now = 8
    val office = if (now > officeOpen) "Office already open" else "Office is closed"
    println(office)
}


