package Kotlin_fundamental

fun main() {
    // TODO : String (Tipe data yang digunakan untuk menyimpan beberapa karakter)
    val textString: String = "Kotlin"
    val firstChar = textString[0]

    println("First character of $textString is $firstChar")

    // TODO : Escaped string ( String yang memiliki karakter khusus yang diawali dengan backslash (\) )
    /*
        \t: menambah tab ke dalam teks.
        \n: membuat baris baru di dalam teks.
        \’: menambah karakter single quote kedalam teks.
        \”: menambah karakter double quote kedalam teks.
        \\: menambah karakter backslash kedalam teks.
    */
    val statement: String = "Kotlin is \"Awesome!\""
    println(statement)

    // TODO : Raw string (String yang memiliki banyak baris dan memungkinkan kita untuk menulis string tanpa melakukan escaping)
    val line: String = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line)
}