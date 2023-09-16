package Data_class

fun main() {
    // TODO : Sequences adalah sebuah collection yang bisa kita gunakan untuk melakukan operasi terhadap data secara lazy. Artinya, operasi yang kita lakukan tidak akan langsung dijalankan, melainkan menunggu hingga data dipanggil.

    // TODO : Contoh kode eager evaluation ( eager evaluation mengevaluasi seluruh item yang ada pada collection)
    val listEagerEvaluation = (1..10000000).toList()
    listEagerEvaluation.filter { it % 5 == 0 }.map { it * 2 }.forEach { println("value is $it") }


    // TODO : Contoh kode lazy evaluation ( lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan)
    val listLazyEvaluation = (1..10000000).toList()
    listLazyEvaluation.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println("value is $it") }

    // TODO : Object Sequence ( Sequence adalah sebuah collection yang bisa kita gunakan untuk melakukan operasi terhadap data secara lazy. Artinya, operasi yang kita lakukan tidak akan langsung dijalankan, melainkan menunggu hingga data dipanggil.)

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}