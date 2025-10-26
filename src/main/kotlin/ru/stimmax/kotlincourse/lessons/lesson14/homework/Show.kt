package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

class Show (val group: String, val place: String, val price: Double, val capacity: Int ) {
    private var soldTickets: Int = 0 // есть значение по умолчанию поэтому не выносим в конструктор

    fun showDetails() {
        println("Группа $group выступает в $place цена билета $price")
    }

    fun buyTicket() {
        if (soldTickets<capacity) {
            soldTickets ++
        } else {
            println("Sold out!")
        };
    }
}