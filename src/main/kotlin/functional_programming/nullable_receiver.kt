package functional_programming


fun main() {
    val value: Int? = 10
    println(value.slice)
}

// TODO : SLice adalah ekstensi property yang mengambil nilai dari variabel Int? dan mengembalikan nilai setengah dari nilai tersebut jika nilai tersebut tidak null, atau mengembalikan 0 jika nilai tersebut null.
val Int?.slice: Int
    get() = this?.div(2) ?: 0

