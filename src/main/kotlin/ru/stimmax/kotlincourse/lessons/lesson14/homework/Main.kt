package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

import kotlin.io.path.Path

fun main() {
    // Party
    val party = Party("on the beach", 100)
    party.details()
    println()

    //Emotion
    val emotion = Emotion("грусть", 1)
    emotion.express()
    println()

    //Moon
    Moon.showPhase()
    println()

    //Product
    val beer = Product("Hoogarden", 120.50, 12)
    println(beer.toString())
    println()

    //Show
    val show = Show("Metalica", "Лужники", 2500.00,5000)
    show.buyTicket()
    show.showDetails()
}