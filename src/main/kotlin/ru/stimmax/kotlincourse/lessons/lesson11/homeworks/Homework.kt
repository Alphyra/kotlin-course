package org.example.ru.stimmax.kotlincourse.lessons.lesson11.homeworks

fun main(){
    println(isEven(6))
}

//1. Не принимает аргументов и не возвращает значения.
fun one() {}

//2. Принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int): Int = a + b

//3. Принимает строку и ничего не возвращает.
fun fun3(s: String) {}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun fun4(l: List<Int>): Double {
    var sum: Double = 0.0
    for(ele in l) {
        sum = sum + ele
    }
    return sum/l.size
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun fun5 (s: String?): Int? {
    return s?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
fun fun6(): Double? {
    return null
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun fun7(l: List<Int>?) {}

//8. Принимает целое число и возвращает nullable строку.
public fun fun8(i: Int): String?{
    return null
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun fun9(): List<String?> {
    return listOf()
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun fun10 (s: String?, i: Int?): Boolean?{
    return null
}

//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(i: Int): Int{
    return i * 2
}

//12. Создайте функцию isEven,
// которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(i: Int): Boolean{
    return (i % 2 == 0)
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if(n<1) return
    for (i in 1 until n){
        println(i)
    }
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(l: List<Int>): Int? {
    for(ele in l){
        if (ele<0) return ele
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(l: List<String?>){
    for (ele in l) {
        if (ele.isNullOrEmpty()) return
        println(ele)
    }
}