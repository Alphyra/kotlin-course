package org.example.ru.stimmax.kotlincourse.lessons.lesson22.homeworks

class Task12Exception(arg: IndexOutOfBoundsException ): RuntimeException(arg) {
}

fun main() {
    try {
        listOf("")[1]
    } catch (e: IndexOutOfBoundsException) {
        println("Произошёл IndexOutOfBoundsException")
        throw Task12Exception(e)
    }
}