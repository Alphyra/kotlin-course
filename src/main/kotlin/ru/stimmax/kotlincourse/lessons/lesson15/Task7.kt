package org.example.ru.stimmax.kotlincourse.lessons.lesson15

class Task7 : Materials() {
    fun insertMap(map: Map<String, String>) {
        val materials = map.keys.reversed() + extractMaterials() + map.values
    }
}