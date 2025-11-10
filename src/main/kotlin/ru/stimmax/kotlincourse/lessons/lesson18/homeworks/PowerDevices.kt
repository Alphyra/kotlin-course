package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

abstract class PowerDevices : Powerable {
    override fun powerOn() {
        println("Включено")
    }
    override fun powerOff() {
        println("Выключено")
    }
}