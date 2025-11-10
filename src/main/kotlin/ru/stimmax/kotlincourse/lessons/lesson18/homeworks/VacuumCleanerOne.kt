package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

class VacuumCleanerOne : VacuumCleaner() {
    override fun move(direction: String, distance: Int) {
        println("Направление: $direction и расстояние $distance")
    }

    override fun clean() {
        println("Идёт уборка пылесосом")
    }

    override fun getChargeLevel(): Double {
        TODO("Not yet implemented")
    }

    override fun recharge() {
        TODO("Not yet implemented")
    }
}