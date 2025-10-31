package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task1

import org.example.ru.stimmax.kotlincourse.lessons.lesson16.Main

open class Animal {
    open fun makeSound(color: String) {
        println("${Main.Colors.RESET} + This animal makes no sound. + \u001B[43m")
    }
}