package org.example.ru.stimmax.kotlincourse.lessons.lesson07.homeworks

fun main() {
    // Прямой Диапазон
    //Напишите функцию, которая печатает числа от 1 до 10.
    for (i:Int in 1..10){
        println(i)
    }

    //Прямой Диапазон
    //Напишите функцию, которая выводит на экран квадраты чисел от 1 до 5.
    for (i: Int in 1..5){
        println(i*i)
    }

    //Обратный Диапазон
    //Создайте функцию, которая выводит все числа от 10 до 1 в обратном порядке.
    for (i:Int in 10 downTo 1){
        println(i)
    }

    //Обратный Диапазон
    //Напишите программу, которая отображает убывающую последовательность четных чисел от 20 до 2.
    for (i:Int in 20 downTo 2){
        if (i % 2 == 0) println(i)
    }

    //Цикл с Шагом
    //Реализуйте функцию, выводящую каждое третье число в диапазоне от 1 до 30.
    for (i:Int in 3..30 step 3) {
        println(i)
    }

    //Цикл с Шагом
    //Напишите цикл, который печатает числа от 100 до 50 с шагом 5.
    for (i: Int in 100 downTo 5 step 5) {
        println(i)
    }

    //Использование until
    //Создайте целочисленную переменную длины списка 'length'.
    //Создайте цикл, который выводит индексы элементов списка. Индексы начинаются с нуля.
    val length = 15
    for (i: Int in 0 until length){
        println(i)
    }

    //Цикл While
    //Напишите функцию, которая суммирует числа от 1 до 10, используя цикл while.
    var counter1 = 1
    var sum = 0
    while (counter1 <=10) {
        sum+=counter1
        counter1++
    }
    println(sum)

    //Цикл While
    //Создайте цикл, который считает количество цифр в числе, начиная с 100 и уменьшая его на 1 после каждой итерации.
    var counter2 = 100
    while (counter2!=0) {
        println(counter2.toString().length)
        counter2--
    }

    //Цикл do while
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    var counter3 = 5
    do {
        println(counter3)
    } while (counter3-- > 1)

    //Цикл do while
    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter4 = 5
    do {
       println(counter4)
    } while (counter4++<10)

    //Использование break
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i: Int in 1..10){
        if (i == 6) break
        println(i)
    }

    //Использование break
    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var counter5 = 1
    while (true) {
        if (counter5 == 10) break
        println(counter5)
        counter5++
    }

    //Использование continue
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i: Int in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    //Использование continue
    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counter = 0
    while (counter++<10) {
        if (counter % 3 == 0) continue
        println(counter)
    }
}