package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task3

import org.example.ru.stimmax.kotlincourse.lessons.lesson16.Main

class InkjetPrinter : Printer() {
    override fun print(s: String) {
        println("${Main.Colors.CYAN}$s${Main.Colors.RESET}")
    }
}