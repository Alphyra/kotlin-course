package org.example.ru.stimmax.kotlincourse.lessons.lesson27.homeworks

enum class TestResult {
    PASSED,
    BROKEN,
    FAILED,
    ;
}

enum class RentType (val s: String) {
    ONE_ROOM ("Однушка"),
    TWO_ROOM ("Двушка"),
    STUDIO("Студия"),
    ;
}

enum class Planet (val n: String, val distanceToSun: Long,  val weight: Long) {
    PLANET_ONE("Планета Один", 1000000000L, 100000000),
    PLANET_TWO("Планета Два", 2000000000L, 200000000),
    PLANET_THREE("Планета Три", 3000000000L, 300000000),
    ;
}

fun fun2() {
    println(RentType.entries.sortedBy { it.name.length })
}

fun fun3(fnc: ()->Unit): TestResult{
    return try {
        fnc
        TestResult.PASSED
    } catch (e: AssertionError) {
        TestResult.FAILED
    } catch (e: Throwable) {
        TestResult.BROKEN
    }
}

fun fun4(fnc: (Planet) -> Boolean): Planet {
    return Planet.entries.firstOrNull(fnc) ?: throw Exception ("No planet to your condition")
}

fun main () {
    fun2()
}