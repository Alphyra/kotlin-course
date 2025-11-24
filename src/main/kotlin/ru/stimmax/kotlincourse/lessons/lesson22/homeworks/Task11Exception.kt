package org.example.ru.stimmax.kotlincourse.lessons.lesson22.homeworks

class Task11Exception(message: String) : NullPointerException(message) {
}

fun main(){
    //Homework 11
    try {
        throw Task11Exception("E X C E P T I O N")
    } catch (e: Task11Exception) {
        println(e.message)
    }
}