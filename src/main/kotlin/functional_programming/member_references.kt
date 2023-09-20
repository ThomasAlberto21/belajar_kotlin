package functional_programming


fun main() {

    // Function References
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)

    println(evenNumbers)

    // Property References
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}


var message = "Hello World"
fun isEvenNumber(number: Int) = number % 2 == 0
