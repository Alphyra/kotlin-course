package org.example.ru.stimmax.kotlincourse.lessons.lesson17

class PlayStation (
    val games: List<String>,
    private val owner: String,
    val supportPhone: String,
    val payed: Boolean,
    val price: Double,
    private var pinCode: String
    ) {
    val color: String = "red"
    val model: String = "R2d2"
    private var balance: Double = 0.00
    var isOn: Boolean = false
    private var osIsLoaded = false
    val gamePadExist: Boolean = true

    private fun turnOn () {
        isOn = true
        startOs()
    }

    fun turnOff() {
        stopOs()
        isOn = false
    }

    private fun startOs() {
        osIsLoaded = true
    }

    private fun stopOs() {
        osIsLoaded = false
    }

    fun showListOfGames() {
        games.forEach { println(it) }
    }

    fun pay(money: Double) {
        if (money >= price) {
            balance =+ money
            turnOn()
        }
    }

    fun withDrawCash(pinCode: String) {
        if (this.pinCode.equals(pinCode)) {
            OpenBox()
        } else {
            println("Aborted")
        }
    }

    private fun OpenBox() {

    }
}

