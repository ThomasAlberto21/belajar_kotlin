package Control_flow

// TODO : Perulangan adalah proses perulangan blok yang sama tanpa henti sampai kondisi yang diberikan tidak terpenuhi atau bernilai false.

fun main() {

    // While
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    // Do While
    var counter2 = 1
    do {
        println("Hello, World!")
        counter2++
    } while (counter2 <= 7)
}