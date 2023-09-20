package functional_programming

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
        append("receiver")
    }
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}