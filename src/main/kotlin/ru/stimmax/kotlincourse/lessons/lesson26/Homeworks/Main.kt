package org.example.ru.stimmax.kotlincourse.lessons.lesson26.Homeworks

import java.io.File

// 1

fun fun1(path: String) {
    val file = File(path)
    with(file) {
        parentFile?.mkdirs()
        createNewFile()
        writeText("Hello, Kotlin!")
        check (exists()) {
            println("Файл не найден")
        }
    }
}

// 2
fun fun2(path: String) {
    File(path).apply{
        mkdirs()
        if (isDirectory) {
            println(absolutePath)
        }
    }
}

// 3
fun fun3(path: String) {
    val f = File(path).apply {
        mkdirs()
        resolve("myDir")
    }
    with(f) {
        mkdir()
        resolve("subDir1").mkdir()
        resolve("subDir2").mkdir()
        val filesList = list()
        check (filesList?.all { it.contains("subDir1") || it.contains("subDir2")} ?: false){
        "Директорий нет"
        }
    }
}

// 4
fun fun4(path: String) {
    File(path).apply {
        mkdirs()
        resolve("1").also {
            it.mkdir()
        }
        parentFile.deleteRecursively() // Удаляет и пустые папки
    }
    check(!File("workspace/task4").exists())
}

// 5
fun fun5(path: String) {
    val m = mapOf("1" to "a", "2" to "b")
    File(path).apply {
        parentFile?.mkdirs()
        createNewFile()
        writeText(m.toString())
        readLines().map{
            it.split("=")
                .getOrNull(1)
        }
    }
}



fun main() {
    //1
    //fun1("workspace/task1/example.txt")

    //2
    //fun2("workspace/task2/testDir")

    //3
    //fun3("workspace/task3/structure")

    //4
    //fun4("workspace/task4/temp")

    //5
    //fun5("workspace/task5/config/config.txt")

    //6
}