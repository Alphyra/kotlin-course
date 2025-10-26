package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

class Emotion (val type: String, val intensity: Int) {
    fun express() {
        when (intensity) {
            in 1..3 -> print("Лёгкое ")
            in 4..6 -> print("Среднее ")
            in 7..10 -> print("Тяжёлое ")
        }
        when (type) {
            "грусть" -> println("подавленное состояние")
            "радость" -> println("позитивное состояние")
            "страх" -> println("тревожное состояние")
        }
    }
}
