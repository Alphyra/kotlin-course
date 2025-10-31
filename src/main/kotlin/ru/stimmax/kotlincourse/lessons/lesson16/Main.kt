package org.example.ru.stimmax.kotlincourse.lessons.lesson16

import org.example.ru.stimmax.kotlincourse.lessons.lesson16.Main.Colors
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task1.Bird
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task1.Cat
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task1.Dog
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2.Circle
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2.Square
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task2.Triangle
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task3.InkjetPrinter
import org.example.ru.stimmax.kotlincourse.lessons.lesson16.task3.LaserPrinter

class Main{
    object Colors {
        const val RESET = "\u001B[0m"
        const val BLACK = "\u001B[30m"
        const val RED = "\u001B[31m"
        const val GREEN = "\u001B[32m"
        const val YELLOW = "\u001B[33m"
        const val BLUE = "\u001B[34m"
        const val PURPLE = "\u001B[35m"
        const val CYAN = "\u001B[36m"
        const val WHITE = "\u001B[37m"
    }
    object Background {
        const val RESET = "\u001B[0m"
        const val BLACK = "\u001B[40m"
        const val RED = "\u001B[41m"
        const val GREEN = "\u001B[42m"
        const val YELLOW = "\u001B[43m"
        const val BLUE = "\u001B[44m"
        const val PURPLE = "\u001B[45m"
        const val CYAN = "\u001B[46m"
        const val WHITE = "\u001B[47m"
    }
}
fun main(){
    println("---------1---------")
    val dog = Dog()
    val cat = Cat()
    val bird = Bird()
    val animals = listOf(dog, cat, bird)
    animals.forEach { it.makeSound(Colors.RED) }
    println()

    println("---------2---------")
    val circle = Circle(2.00);
    val square = Square(3.00);
    val triangle = Triangle(1.00, 1.00, 45.00)
    val shapes = listOf(circle, square, triangle)
    shapes.forEach { it.area() }

    println("---------3---------")
    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()
    laserPrinter.print("Это лазерный принтер")
    inkjetPrinter.print("Это струйный принтер")
    println()

}
