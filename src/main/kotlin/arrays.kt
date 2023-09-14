fun main() {
    // TODO : Array(tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam sebuah variabel)
    /*
    intArrayOf() : IntArray (Hanya bisa menyimpan data dengan tipe data int)
    booleanArrayOf() : BooleanArray (Hanya bisa menyimpan data dengan tipe data boolean)
    charArrayOf() : CharArray (Hanya bisa menyimpan data dengan tipe data char)
    longArrayOf() : LongArray (Hanya bisa menyimpan data dengan tipe data long)
    shortArrayOf() : ShortArray (Hanya bisa menyimpan data dengan tipe data short)
    byteArrayOf() : ByteArray (Hanya bisa menyimpan data dengan tipe data byte)
    */

    val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])

    // Mengubah data array dengan index kedua
    val intArray2 = intArrayOf(1, 3, 5, 7)
    intArray2[2] = 11

    print(intArray2[2])
}