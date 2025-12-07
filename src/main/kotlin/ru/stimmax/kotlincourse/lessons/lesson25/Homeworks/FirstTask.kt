package org.example.ru.stimmax.kotlincourse.lessons.lesson25.Homeworks

//1
fun timeTracker(arg: () -> Any): Long {
    val start = System.currentTimeMillis()
    arg()
    return System.currentTimeMillis() - start
}



fun main() {
    //1
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }
    timeTracker { myFunction }

}