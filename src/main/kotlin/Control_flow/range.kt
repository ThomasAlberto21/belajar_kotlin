package Control_flow

fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }

    println(rangeInt.step)

    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    } else {
        println("Value 11 available in Range")
    }
}