package org.example.ru.stimmax.kotlincourse.lessons.lesson15

class Task6 : Materials() {
    fun insertAndSort(s: String) {
        addMaterial(s)
        val materialsBeforeSort = extractMaterials()
        materialsBeforeSort.sorted()
    }
}