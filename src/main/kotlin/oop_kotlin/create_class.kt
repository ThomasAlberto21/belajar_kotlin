package oop_kotlin

class Animal(val name: String, val weight: Double, val age: Int, val isMamal: Boolean) {
    fun eat() {
        println("$name is eating")
    }

    fun sleep() {
        println("$name is sleeping")
    }
}

fun main() {
    val thomasCat = Animal("Riot", 5.5, 3, true)
    println("Name: ${thomasCat.name} \nWeight: ${thomasCat.weight} \nAge: ${thomasCat.age} \nIs Mamal: ${thomasCat.isMamal}")
    thomasCat.eat()
    thomasCat.sleep()
}