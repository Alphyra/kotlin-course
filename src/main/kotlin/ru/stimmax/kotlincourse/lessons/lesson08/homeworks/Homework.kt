package org.example.ru.stimmax.kotlincourse.lessons.lesson08.homeworks

fun main() {

    println("1. Преобразование строк")
    convertString("Это невозможно выполнить за один день")
    convertString("Я не уверен в успехе этого проекта")
    convertString("Произошла катастрофа на сервере")
    convertString("Этот код работает без проблем")
    convertString("Удача")
    println()

    println("2. Извлечение даты из строки лога")
    getDateAndTimeFromLogString( "Пользователь вошел в систему -> 2021-12-01 09:48:23")
    println()

    println("3. Маскирование личных данных")
    mask("4539 1488 0343 6467")
    println()

    println("4. Форматирование адреса электронной почты.")
    formatMail( "username@example.com")
    println()

    println("5. Извлечение имени файла из пути.")
    getFileNameFromPath("C:/Пользователи/Документы/report.txt")
    println()

    println("6. Создание аббревиатуры из фразы.")
    println(makeAbbreviation("Котлин лучший язык программирования"))
    println()

}

// 1. Преобразование строк
fun convertString(arg: String) {
    val res = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа", "интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем", "с парой интересных вызовов на пути")
        !(arg.contains(" ")) -> "Иногда, $arg, но не всегда"
        else -> arg
    }
    println(res)
}

// 2. Извлечение даты из строки лога

fun getDateAndTimeFromLogString(s: String) {
    val indexToStart = s.indexOf(">")
    println(s.substring(indexToStart+2, indexToStart+12))
    println(s.split(" ").last())
}

// 3. Маскирование личных данных

fun mask(s: String) {
    val partToShow = s.split(" ").last()
    println("**** **** **** $partToShow")
}

// 4. Форматирование адреса электронной почты.
fun formatMail(s: String) {
    val formated = s.replace("@", " [at] ")
        .replace("." , " [dot] ")
    println(formated)
}

//5. Извлечение имени файла из пути.
fun getFileNameFromPath(s: String) {
    println(s.split("/").last())
}

//6. Создание аббревиатуры из фразы.
fun makeAbbreviation(s: String): String {
    val words = s.split(" ")
    var abbreviation = ""
    for (word in words){
        abbreviation = abbreviation + word[0]
    }
    return abbreviation.uppercase()
}
