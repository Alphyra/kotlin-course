package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task5

class Logger {
    fun log(message: String) {
        println("INFO: " + message)
    }

    fun log(message: String, level: String){
        println(level + " " + message)
    }

    fun log (listOfMessages: List<String>) {
        listOfMessages.forEach {
            println("INFO: " + it)
        }
    }

    fun log (exception: Exception) {
        println("ERORR: " + exception.message)
    }
}