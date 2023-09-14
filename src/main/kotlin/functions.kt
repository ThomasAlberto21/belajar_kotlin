fun main() {
    val user = setUser("Thomas Alberto", 19)
    println(user)

    printUser("Thomas Alberto")
}

fun setUser(name: String, age: Int) {
    return println("My name is $name and my age is $age")
}

fun printUser(name: String) {
    return println("My name is $name")
}