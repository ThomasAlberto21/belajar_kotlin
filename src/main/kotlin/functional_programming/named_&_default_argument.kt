package functional_programming


fun main() {
    val fullName = getFullName(first = "Thomas" , last = "Alberto")
    println(fullName)
}

fun getFullName(
    first: String = "Kotlin",
    last: String = "Awesome"
): String {
    return "$first $last"
}