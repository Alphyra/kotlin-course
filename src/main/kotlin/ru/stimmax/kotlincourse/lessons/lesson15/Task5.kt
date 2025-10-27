package org.example.ru.stimmax.kotlincourse.lessons.lesson15

class Task5 : Materials() {
    fun insert(listOfMaterials: List<String>) {
        val materialsBeforeInsert = extractMaterials()
        for(i in 0..materialsBeforeInsert.size)
            for (j in 0..listOfMaterials.size) {
                if (i % 2 == 0) {
                    addMaterial(listOfMaterials[j])
                }
            }
    }
}