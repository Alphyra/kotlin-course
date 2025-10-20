package org.example.ru.stimmax.kotlincourse.lessons.lesson12.homeworks

fun main() {

    val nums = listOf(1,2,6,10,-1,0,5,22)
    val str = listOf<String?>("ура", "сегодня", "ff", null, "yes", "friday", "ff", null)

    // 1. Проверить, что размер коллекции больше 5 элементов.
    println("--1--")
    if (nums.size>5) {println("true")}
    println()

    //2. Проверить, что коллекция пустая
    println("--2--")
    if (nums.isEmpty()) {
        println("true")
    } else {
        println("false")
    }
    println()


    //3. Проверить, что коллекция не пустая
    println("--3--")
    if (nums.isNotEmpty()) {
        println( "true")
    } else {
        println("false")
    }
    println()

    //4. Взять элемент по индексу или создать значение если индекса не существует????
    println("--4--")
    nums.getOrElse(10) {55}
    println(nums)

    //5. Собрать коллекцию в строку
    println("--5--")
    val s = nums.joinToString("; ")
    println(s)

    //6. Посчитать сумму всех значений
    println("--6-")
    val sum = nums.sum()
    println(sum)
    println()

    //7. Посчитать среднее
    println("--7--")
    val av = nums.average()
    println(av)
    println()

    //8. Взять максимальное число
    println("--8--")
    println(nums.max())
    println()

    //9. Взять минимальное число
    println("--9--")
    println(nums.min())
    println()

    //10. Взять первое число или null
    println("--10--")
    println(nums.firstOrNull())
    println()

    //11. Проверить что коллекция содержит элемент
    println("--11--")
    println(nums.contains(10))
    println()

    //12. Отфильтровать коллекцию по диапазону 18-30
    println("--12--")
    println(nums.filter { it in 18..30 })
    println()

    //13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    println("--13--")
    println(nums.filterNot { it % 2 == 0 && it % 3 == 0})
    println()

    //14. Очистить текстовую коллекцию от null элементов
    println("--14--")
    println(str.filterNotNull())
    println()

    //15. Преобразовать текстовую коллекцию в коллекцию длин слов
    println("--15--")
    println(str.map{it?.length})
    println()

    //16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    println("--16--")
    val t16 = str.associate { it?.reversed() to it?.length }
    println(t16)
    println()

    //17. Отсортировать список в алфавитном порядке
    println("--17--")
    println(str.sortedBy { it })
    println()

    //18. Взять первые 3 элемента списка
    println("--18--")
    println(str.take(3))
    println()

    //19.Распечатать квадраты элементов списка
    println("--19--")
    nums.forEach { println(it * it)}
    println()

    //20. Группировать список по первой букве слов
    println("--20--")
    val strG = str.groupBy { it?.first() }
    println(strG)
    println()

    //21. Очистить список от дублей
    println("--21--")
    println(str.distinct())
    println()

    //22. Отсортировать список по убыванию
    println("--22--")
    println(str.sortedByDescending { it })
    println()

    //23. Взять последние 3 элемента списка
    println("--23--")
    println(str.takeLast(3))
    println()

    //24. Характеристика числовой коллекции
    println("--24--")
    println(fun24(listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)))
    println()

    //25
    println("--25--")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(fun25(grades))
    println()

    //26. Создание каталога по первой букве
    println("--26--")
    println(fun26( listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )))
    println()

    //27.
    println("--27--")
    println(fun27( listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )))
    println()

    //28. Категоризация чисел
    println("--28--")
    println(fun28(listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)))
    println()

    //29. Поиск первого подходящего элемента
    println("--29--")
    println(fun29(listOf(22, 18, 30, 45, 17, null, 60), 18))
    println()
}

//24. Характеристика числовой коллекции
fun fun24(l: List<Int>): String {
    when {
        l.isEmpty() -> return "Пусто"
        l.size < 5 -> return "Короткая"
        l.first() == 0 -> return "Стартовая"
        l.sum() > 1000 -> return "Массивная"
        l.average() == 10.0 -> return "Сбалансированная"
        l.joinToString { it.toString() }.length > 20 -> return "Клейкая" //???
        l.max() < 10 -> return "Отрицательная"
        l.min() > 1000 -> return "Положительная"
        l.contains(3) && l.contains(14) -> return "Пи***тая"
    }
    return "Уникальная"
}

//25. Анализ учебных оценок
fun fun25(l: List<Int>): List<Int> {
    return l.filter { it >=60 }
        .sorted()
        .take(3)
}

//26. Создание каталога по первой букве
fun fun26(l: List<String>): Map<Char, List<String>> {
    return l.map{it.lowercase()}.groupBy { it.first() }
}

//27. Подсчёт средней длины слов в списке
fun fun27(l: List<String>): String {
    val r = l.map{it.length}.average()
    return "result: %.2f".format(r);
}

//28. Категоризация чисел
fun fun28(l: List<Int>): Map<String, List<Int>> {
    return l.distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные"}
}

//29. Поиск первого подходящего элемента
fun fun29(l: List<Int?>, i: Int): Int? {
    return l.filterNotNull()
        .filter { it > i }
        .getOrElse(0) {null}
}

