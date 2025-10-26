package org.example.ru.stimmax.kotlincourse.lessons.lesson14.homework

class Shelf (val capacity: Int, val itemList: MutableList<String>){
    fun addItem(itemName: String): Boolean {
        val currentState = itemList.map {
            it.length
        }.sum()
        if (currentState + itemName.length <= capacity) {
            itemList.add(itemName)
            return true
        } else {
            return false
        }
    }

    fun removeItem(itemName: String): Boolean {
        if (itemList.contains(itemName)) {
            itemList.remove(itemName)
            return true
        } else {
            return false
        }
    }

    fun containsItem(itemName: String): Boolean {
        return itemList.contains(itemName)
    }
    //fun containsItem(name: String) = items.contains(name)

    fun getItems(): List<String> {
        return itemList
    }
    //fun getItems() = items.toList()


}