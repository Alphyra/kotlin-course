package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

import javax.sound.sampled.FloatControl

class Party (val location: String, val attendees: Int) {
    fun details(){
        println("Party will be here $location for $attendees person(s)")
    }
}