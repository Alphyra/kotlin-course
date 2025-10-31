package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task1

import org.example.ru.stimmax.kotlincourse.lessons.lesson16.Main

class Cat : Animal() {
    override fun makeSound(color: String) {
        println("$color Meow${Main.Colors.RESET}")
    }
}