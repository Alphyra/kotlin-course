package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

import java.nio.file.Watchable

class WashMachineOne: WashMachine() {
    override fun powerOn() {
        println("Стиралка включена")
    }

    override fun powerOff() {
        println("Стиралка выключена")
    }

    override fun open() {
        println("Стиралка открыта")
    }

    override fun close() {
        println("Стиралка закрыта")
    }

    override fun connectToWaterSupply() {
        println("Стиралка подключена к воде")
    }

    override fun getWater(amount: Int) {
        println("Залить в стиралку $amount воды")
    }
}