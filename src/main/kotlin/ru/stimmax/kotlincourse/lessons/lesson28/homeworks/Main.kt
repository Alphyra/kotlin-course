package org.example.ru.stimmax.kotlincourse.lessons.lesson28.homeworks

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.OffsetDateTime
import java.time.Period
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import kotlin.time.Instant

fun main() {
    //1
//    val instante = Instant.now().also {
//        println(it)
//    }

    //2
    val birthday = LocalDate.of(1987,4,8)

    //3
    val t3 = Period.between(birthday, LocalDate.now())
    println(t3.years)

    //4
    fun printFormatted(arg: Temporal) {
        when (arg) {
            is LocalDate -> "dd-MM-YYYY"
            is LocalTime -> "HH:mm:ss"
            is LocalDateTime -> "dd-MM-YYYY HH:mm:ss"
            is ZonedDateTime -> "dd-MM-YYYY HH:mm:ss z"
            is OffsetDateTime -> "dd-MM-YYYY HH:mm:ss ZZZ"
            else -> throw IllegalArgumentException("Неизвестный тип данных")
        }.let {
            DateTimeFormatter.ofPattern(it).format(arg)
        }.also { println(it) }
    }

    //5
    val date = LocalDate.of(2025, 4, 5)
    val time = LocalTime.of(15, 45, 12)
    printFormatted(date)
    printFormatted(date)
    printFormatted(time)
    printFormatted(LocalDateTime.of(date, time))
    printFormatted(ZonedDateTime.of(date, time, ZoneId.of("Europe/Amsterdam")))
    printFormatted(OffsetDateTime.of(LocalDateTime.of(date, time), ZoneOffset.of("+03")))

    //6
    fun LocalDate.identifyGeneration() {
        when (this) {
            in LocalDate.of(1946,1,1)..LocalDate.of(1964,12,31)  -> println("Это бумер!")
            in LocalDate.of(1997,1,1)..LocalDate.of(2012,12,31)  -> println("Это зумер!")
            else -> println("Это обычный человек")
        }
    }

    //7
    val t71 = LocalDate.of(2023, 2, 25)
    val t72 = LocalDate.of(2024, 2, 25)
    val formatter = DateTimeFormatter.ofPattern("MM-dd")

    //8
    println(t71.plusDays(10).format(formatter))

    //9
    println(t72.plusDays(10).format(formatter))
}