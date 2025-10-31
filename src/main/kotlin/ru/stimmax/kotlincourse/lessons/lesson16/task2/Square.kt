package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2

class Square(val side: Double) : Shape() {
    override fun area() {
        println(side * side)
    }
}