package Data_class

class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    val user = User("Thomas", 19)
    val dataUser = DataUser("Thomas", 19)
    val dataUser2 = DataUser("Thomas", 19)
    val dataUser3 = DataUser("Thomas", 19)

    println("User: $user")
    println("DataUser: ${dataUser.equals(dataUser2)}")
}