package org.example.ru.stimmax.kotlincourse.lessons.lesson20

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

fun <T : Comparable<T>> MutableList<T>.sort(direction: Boolean): List<T> {
    val self = toList()
    if (direction) {
        sort()
    } else {
        sortDescending()
    }
    return self
}

//3

fun <R> Map<R, List<R>>?.mapByIndex(index: Int): Map<String, R?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}