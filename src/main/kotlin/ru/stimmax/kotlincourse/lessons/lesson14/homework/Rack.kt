package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

class Rack (val maxShelfAmount: Int) {
    private val shelfs: MutableList<Shelf> = mutableListOf()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelfs.contains(shelf) || shelfs.size>=maxShelfAmount) {
            return false
        } else {
            shelfs.add(shelf)
            return true
        }
    }

    fun removeShelf(index: Int): List<String>? {
        val removedShelf = shelfs.removeAt(index)
        return removedShelf.getItems()
    }

    fun addItem(itemName: String): Boolean {
        for (shelf in shelfs) {
            if (shelf.addItem(itemName)) {
                return true
            }
        }
        return false
    }

    fun removeItem(itemName: String): Boolean {
        for (shelf in shelfs) {
            if (shelf.containsItem(itemName)) {
                shelf.removeItem(itemName)
                return true
            }
        }
        return false
    }

    fun containsItem(itemName: String): Boolean {
        return shelfs.any { it.containsItem(itemName) }
    }

    fun getShelves() = shelfs.toList()

    fun printContents() {
        for (i in shelfs.indices) {
            val capacity = shelfs[i].capacity
            val freeSpace = capacity - shelfs[i].getItems()
                .map { it.length }
                .sum()
            println("На полке с индексом $i и вместимостью $capacity " +
                    "свободно $freeSpace " +
                    "и заполнена ${shelfs[i].getItems().joinToString()}")
        }
    }

    fun advancedRemoveShelf(i: Int): List<String> {
        val itemsToDo = shelfs[i].getItems();
        var itemsLeft: MutableList<String> = mutableListOf()
        val otherShelves = shelfs - shelfs[i]
        for (item in itemsToDo) {
            for (shelf in shelfs) {
                if (otherShelves.none { it.addItem(item) }) {
                    itemsLeft.add(item)
                }
            }
        }
        shelfs.removeAt(i)
        return itemsLeft.toList()
    }
}