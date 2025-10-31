package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2

import kotlin.math.sin

class Triangle(val side1: Double, val side2: Double, val a: Double) : Shape() {
    override fun area() {
        println(0.50 * side1 * side2 * sin(a))
    }
}