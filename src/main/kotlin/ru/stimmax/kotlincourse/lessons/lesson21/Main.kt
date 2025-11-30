package org.example.ru.stimmax.kotlincourse.lessons.lessons21

//1
fun analyzeDataType(arg: Any) {
    when(arg) {
        is String -> println("Это строка: $arg")
        is Number -> println("Это число: $arg")
        is List<*> -> println("Это список, количество элементов: ${arg.size}")
        is Map<*,*> -> println("Это словарь, количество пар: ${arg.size}")
        else -> println("Неизвестный тип данных")
    }
}

//2
fun safeCastToList(arg: Any): Int{
    return (arg as? List<*>)?.size ?: -1
}

//3
fun getStringLengthOrZero(arg: Any): Int {
    return (arg as? String)?.length ?: 0
}

//4
fun Any.toSquare(): Double{
    val n: Double = (this as? Number)?.toDouble() ?: (this as String).toDouble() // почему не надо as? для String
    return n * n
}

//5
fun sumIntOrDoubleValues(l: List<Any>): Double {
    return l.sumOf { (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0 } // два оператора Элвиса?
}

//6
fun tryCastToListAndPrint(arg: Any) {
    if (arg is List<*>) {
        println(arg as List<String> ?: "Это не строка")
    } else {
        println("Это не список")
    }
}

/*fun tryCastToListAndPrint(arg: Any) {
    val result = (arg as? List<*>)?.map { (it as? String) ?: "Элемент не является строкой" }
        ?: "Не удалось преобразовать аргумент в список"
    println(result)
}*/


fun main() {
    tryCastToListAndPrint(listOf("1","2"))
    tryCastToListAndPrint(listOf(1,2))
    tryCastToListAndPrint(1)
}