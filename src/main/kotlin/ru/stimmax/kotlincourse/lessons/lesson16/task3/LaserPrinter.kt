package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task3

import org.example.ru.stimmax.kotlincourse.lessons.lesson16.Main

class LaserPrinter : Printer() {
    override fun print(s: String) {
        println("${Main.Colors.GREEN}$s${Main.Colors.YELLOW}")
    }
}