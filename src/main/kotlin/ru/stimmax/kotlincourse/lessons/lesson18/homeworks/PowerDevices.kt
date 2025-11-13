package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

abstract class PowerDevices (val name : String) : Powerable {
    override fun powerOn() {
        println("$name Включено")
    }
    override fun powerOff() {
        println("$name Выключено")
    }
}