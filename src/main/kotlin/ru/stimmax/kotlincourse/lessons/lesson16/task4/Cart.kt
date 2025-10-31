package org.example.ru.stimmax.kotlincourse.lessons.lesson16.task4

class Cart() {
    val products: Map<Int, Int> = mapOf(0 to 0)
    fun addToCart(itemId: Int) {
        products.plus(itemId to 1)
    }

    fun addToCart(itemId: Int, amount: Int) {
        products.plus(itemId to amount)
    }

    fun addToCart(items: Map<Int, Int>) {
        products.plus(items)
    }
}