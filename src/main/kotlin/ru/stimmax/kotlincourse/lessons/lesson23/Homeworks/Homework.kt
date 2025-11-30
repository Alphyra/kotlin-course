package org.example.ru.stimmax.kotlincourse.lessons.lesson23.Homeworks

import kotlin.collections.toSet

//1
    fun f10(l: List<Int>): Double {
        require(l.isNotEmpty()) {"Список не может быть пустым"}
        return l.filter { it % 2 == 0 }.average()
    }

    val f11 = fun(l: List<Int>): Double {
        require(l.isNotEmpty()) {"Список не может быть пустым"}
        return l.filter { it % 2 == 0 }.average()
    }

    val f12:(List<Int>) -> Double = {
        require(it.isNotEmpty()) {"Список не может быть пустым"}
        it.filter { it % 2 == 0 }.average()
    }

    val f13 = {l:List<Int> ->
        require(l.isNotEmpty()) {"Список не может быть пустым"}
        l.filter { it % 2 == 0 }.average()
    }

//2

fun f20(n: Long): Int {
    require(n > 0) { "Число должно быть больше нуля" }
    return "$n".sumOf { it.digitToInt() }
}

val f21 = fun(n: Long): Int {
    require(n > 0) { "Число должно быть больше нуля" }
    return "$n".sumOf { it.digitToInt() }
}

val f22: (Long) -> Int = {
    require(it > 0) { "Число должно быть больше нуля" }
    "$it".sumOf { it.digitToInt() }
}

val f23 = {n: Long ->
    require(n > 0) { "Число должно быть больше нуля" }
    "$n".sumOf { it.digitToInt() }}

//3

fun List<Int>.fun30(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

val fun31 = fun List<Int>.(): Set<Int> {
    return toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

val fun32: List<Int>.() -> Set<Int> = {
    toSet().associate { element ->
        element to this.count { it == element }
    }.filter { it.value > 1 }
        .keys
}

 fun main() {
     //println(f13(listOf()))
     println(f13(listOf(1,5,7)))
     println(f13(listOf(2,6,1)))

     println(f23(123456789))

     println(fun32(listOf(1,1,2,3,4,4,5)))
 }
