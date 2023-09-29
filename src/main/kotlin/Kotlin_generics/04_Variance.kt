package Kotlin_generics

// TODO : Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama dan tipe argumen yang berbeda saling berkaitan satu sama lain. Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak akan mengganggu dalam penggunaannya.

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)


fun main(){
    val carList = listOf(Car(100) , Car(120))
    val vehicleList = carList
}