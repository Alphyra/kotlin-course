package org.example.ru.stimmax.kotlincourse.lessons.lesson20

import kotlin.math.absoluteValue

class Main {

//    1. Определите функцию-расширение для массива чисел, которая не принимает аргументов и
//    возвращает пару из чисел - первое и последнее. Если массив был пуст то вернуть пару из null значений.значений

    fun Array<Int>.one(): Pair<Int?, Int?> {
        return if (isEmpty()) {
            null to null
        } else {
            first() to last()
        }
    }
}


// 2. Создайте функцию-расширение для изменяемого списка элементов:

fun <T : Comparable<T>> MutableList<T>.sort(asc: Boolean): List<T> {
    val self = toList()
    if (asc) {
        sort()
    } else {
        sortDescending()
    }
    return self
}

//3

fun <T> Map<T, List<T>>.fun3(i: Int): Map<String, T?>? {
    return mapKeys { it.key.toString() }
        ?.mapValues {it.value.getOrNull(i)}
}

//4

fun Number.fun4(other: Number, deviation: Number) : Boolean {
    val res = toDouble() - other.toDouble()
    return res.absoluteValue <= deviation.toDouble()
}

//5

fun String.encrypt(base: Int): String {
    return ""
}

fun String.decrypt(base: Int): String {
    return "    "
}


fun main() {
    println(5.fun4(3, 0.01))
}