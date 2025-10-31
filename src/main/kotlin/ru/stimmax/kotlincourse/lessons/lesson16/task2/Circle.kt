package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2

class Circle(val radius: Double) : Shape() {
    override fun area() {
        println(3.14 * radius * radius)
    }
}