package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"
    fun showPhase() {
        if (isVisible) {
            println(phase)
        } else {
            println("Moon is not visible")
        }
    }
}