package org.example.ru.stimmax.kotlincourse.lessons.lesson06.homeworks

fun main() {
    defineSeason(12)
    transformDogYearsToHuman(5.0)
    decideHowToGo(5.0)
    calculateBonus(120.0)
    defineFileType("docx")
    convertTemperature(-100,'c')
    chooseClothe(18)
    selectFilmCategoryByAge(17)
}

// Задание 1: "Определение сезона"
fun defineSeason(monthNumber: Int) {
    when (monthNumber) {
        12,1,2 -> println("зима")
        3,4,5 -> println("весна")
        6,7,8 -> println("осень")
        9,10,11 -> println("осень")
        else -> println("Номер месяца должен быть от 0 до 12")
    }
}

// Задание 2: "Расчет возраста питомца"
fun transformDogYearsToHuman (dogYears: Double){
    if (dogYears>0) {
       if (dogYears<=2){
           println(dogYears*10.5)
       } else {
           println(dogYears*4)
       }
    } else (println("Возраст собаки должен быть больше 0"))
}

// Задание 3: "Определение способа перемещения"
fun decideHowToGo(km: Double){
    if (km<5) {
        if (km>=1) { println("На велосипеде")}
        else {println("Пешком")}
    }else {
        println("Автотранспортом")
    }
}

// Задание 4: "Расчет бонусных баллов"
fun calculateBonus(cost: Double){
    if (cost<1000) println(cost/100*2) else println(cost/100*3)
}

// Задание 5: "Определение типа документа"
fun defineFileType(extension: String){
    when(extension){
        "txt", "doc", "docx" -> println("Текстовый документ")
        "xsl", "xls" -> println("Таблица")
        "png", "jpg", "bmp" -> println("Изображение")
        else -> println("Неизвестный тип")
    }
}

// Задание 6: "Конвертация температуры"
fun convertTemperature(temperature:Int, scale: Char){
    when(scale){
        'C','c' -> {
            print((temperature*9/5)+32)
            println("F")
        }
        'F', 'f' -> {
            print((temperature-32)/1.8)
            println("C")
        }
    }
}

// Задание 7: "Подбор одежды по погоде"
fun chooseClothe(temperature: Int){
    if (temperature>-30 && temperature<35) {
        if (temperature<10) {
            println("куртка и шапка")
        } else if (temperature<18){
            println("ветровка")
        } else {println("Футболка и шорты") }
    } else {
        println("Не выходи")
    }
}

// Задание 8: "Выбор фильма по возрасту"
fun selectFilmCategoryByAge(age: Int){
    when (age) {
        in 1..9 -> println("детские")
        in 10..17 -> println("подростковые")
        else -> println("18+")
    }
}
