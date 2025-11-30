package org.example.ru.stimmax.kotlincourse.lessons.lesson22.homeworks

import java.io.File
import java.io.FileNotFoundException
import java.io.IOException

fun main() {
    //1.NPE
    try {
        val text: String? = null
        println(text as String)
    } catch (e: NullPointerException) {
        println(e.message)
    }

    //2.ArrayIndexOutOfBoundsException
    try{
        val numbers = arrayOf(1, 2, 3)
        println(numbers[5])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e.message)
    }


    //3.ClassCastException
    try {
        val obj: Any = "This is a string"
        val num: Int = obj as Int
    } catch (e: ClassCastException) {
        println(e.message)
    }

    //4.NumberFormatException
    try {
        val number = "abc"
        println(number.toInt())
    } catch (e: NumberFormatException) {
        println(e.message)
    }

    //5.IllegalArgumentException
    fun setAge(age: Int) {
        require(age > 0) { "Возраст должен быть положительным числом" }
    }
    try {
        setAge(-5)
    } catch (e: IllegalStateException) {
        println(e.message)
    }


    //6.IllegalStateException
    fun checkState(state: Boolean) {
        check(state) { "Состояние недопустимо" }
    }
    try {
        checkState(false)
    } catch (e: IllegalStateException) {
        println(e.message)
    }

    //7.FileNotFoundException
    try {
        val file = File("path/to/non/existing/file.txt")
        println(file.readText())
    } catch (e: FileNotFoundException) {
        println(e.message)
    }


    //8.IOException
    val f = File("fff")
    f.createNewFile()
    val i = f.inputStream()
    i.close()
    try {
        i.read()
    } catch (e: IOException) {
        println(e.message)
    }


    //9.OutOfMemoryError
    fun generateLargeList() {
        val largeList = mutableListOf<Int>()
        while (true) {
            largeList.add(1) // Бесконечно добавляем элементы в список
        }
    }
    try {
        generateLargeList()
    } catch (e: OutOfMemoryError) {
        println(e.message)
    }

    //10. StackOverflowError
    fun recursiveFunction() {
        recursiveFunction() // Бесконечный рекурсивный вызов
    }
    try {
        recursiveFunction()
    } catch (e: StackOverflowError) {
        println(e.message)
    }

    //Homework10
    fun catchable(arg: Any?) {
        try {
            arg!!
            arg as List<*>
            arg[2]
            require(arg[2] is String)
            check((arg[2] as String).toInt() == 3)
        } catch (e: Throwable) {
            val result = when (e) {
                is NullPointerException -> "It is NullPointerException"
                is ClassCastException -> "It is ClassCastException"
                is IndexOutOfBoundsException -> "It is IndexOutOfBoundsException"
                is NumberFormatException -> "It is NumberFormatException"
                is IllegalArgumentException -> "It is IllegalArgumentException"
                is IllegalStateException -> "It is IllegalStateException"
                else -> "It is unknown exception"
            }
            println(result)
            throw e
        }
        println("We have a fantastically good argument!")
    }
}