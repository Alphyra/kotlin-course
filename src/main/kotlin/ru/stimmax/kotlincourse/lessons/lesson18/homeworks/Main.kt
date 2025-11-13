package org.example.ru.stimmax.kotlincourse.lessons.lesson18.homeworks

fun main() {
    val myFridge = FridgeOne()
    myFridge.maxTemperature = 10
    myFridge.open()
    myFridge.powerOn()

    val myWashMachine = WashMachineOne()
    myWashMachine.open()
    myWashMachine.powerOn()

    val myVacuumCleaner = VacuumCleanerOne()
    myVacuumCleaner.powerOn()
    myVacuumCleaner.clean()


}