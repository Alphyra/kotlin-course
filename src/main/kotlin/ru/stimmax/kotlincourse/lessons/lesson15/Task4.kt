package org.example.ru.stimmax.kotlincourse.lessons.lesson15

class Task4 : Materials() {
    val materials = extractMaterials()
    fun addFirst(material: String) {
        addMaterial(material)
        materials.forEach {
            addMaterial(it)
        }
    }
}