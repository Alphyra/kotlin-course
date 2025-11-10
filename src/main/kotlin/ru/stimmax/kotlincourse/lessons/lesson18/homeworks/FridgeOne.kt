package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

class FridgeOne: Fridge() {
    override fun open() {
        println("Fridge is open")
    }

    override fun close() {
        println("Fridge is closed")
    }

    override var maxTemperature: Int = 0
        get() = TODO("Not yet implemented")

    override fun setTemperature(temp: Int) {
        this.maxTemperature = temp
    }

    override fun powerOn() {
        println("Холодильник включён")
    }

    override fun powerOff() {
        println("Холодильник выключен")
    }

}