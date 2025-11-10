package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

abstract class ProgrammableDevices : Powerable, PowerDevices() {
     fun programAction(str: String) {
         println ("Программируем " + String)
    }
}