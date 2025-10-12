package org.example.ru.stimmax.kotlincourse.lessons.lesson09.homeworks

fun main(){
    //Arrays
    //1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val a = arrayOf("1", "2", "3", "4", "5") //метод

    //2. Создайте пустой массив строк размером 10 элементов.
    var i = 0
    val t = Array (10) { i++}
    val stringArray = Array(10) {""}  //Класс

    //3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val doubleArray: Array<Double> = Array (5) {0.0}
    for (i in doubleArray.indices) {
        doubleArray[i] = i * 2.0
    }

    //4. Создайте массив из 5 элементов типа Int.
    // Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val a4: Array<Int> = Array(5) {0}
    for (i in a4.indices) {
        a4[i] = i * 3
    }

    //5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val a5: Array<String?> = arrayOf(null, "qwe", "asd")

    //6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val aFrom = arrayOf(1, 10, 20, 30)
    val aTo: Array<Int> = Array(aFrom.size) {0}
    for (i in aFrom.indices){
        aTo[i] = aFrom[i]
    }

    //7. Создайте два массива целых чисел одинаковой длины.
    // Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    println("Массивы, задача 7:")
    val aOne = arrayOf(1, 10, 20, 30)
    val aTwo = arrayOf(10, 3, 47, 6)
    val aRes: Array<Int> = Array(4){0}
    for (i in aOne.indices) {
        aRes[i] = aTwo[i] - aOne[i]
        println(aRes[i])
    }

    //8. Создайте массив целых чисел.
    // Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    println("Массивы, задача 8:")
    val a8 = arrayOf(1, 2, 6)
    var index = a8.lastIndex
    while (index>=0) {
        if (a8[index] == 5) {
            println(index)
            break
        }
        index--;
        if(index == 0) println("-1")
    }

    //9.Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
    // Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    println("Массивы, задача 9:")
    val a9 = arrayOf(1, 3, 4, 10, 0)
    for (ele in a9) {
        if (ele == 0) {
            println("$ele - это ноль")
        } else {
            if (ele % 2 == 0) {
                println("$ele - чётное число")
            } else {
                println("$ele - нечётное число")
            }
        }
    }

    //10. Создай функцию, которая принимает массив строк и строку для поиска.
    // Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
    // Распечатай найденный элемент.
    println("Массивы, задача 10:")
    val a10 = arrayOf("я", "учу", "Kotlin", "хотя", "я", "Kot")
    funForArray10(a10, "Kot")

    //Lists
    //1. Создайте пустой неизменяемый список целых чисел.
    val l1: List<Int> = emptyList()


    //2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val l2 = listOf<String>("Hello", "World", "Kotlin")

    //3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val l3 = mutableListOf(1, 2, 3, 4, 5)

    //4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    l3.add(6)
    l3.add(7)
    l3.add(8)
    //l3.addAll(6, 7,8)

    //5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val l5 = mutableListOf<String>("Hello", "World", "Kotlin")
    l5.remove("World")

    //6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Списки, задача 6:")
    val l6 = listOf<Int>(1, 10, 100)
    for (ele in l6){
        println(ele)
    }

    //7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val l7 = listOf<String>("aaa", "aa", "a", "11")
    val res7 = l7[1]

    //8. Имея изменяемый список чисел,
    // измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    println("Списки, задача 8:")
    val l8 = mutableListOf<String>("aaa", "aaa", "a", "sss")
    l8[2] = "aaa"
    println(l8)

    //9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
    // Реши задачу с помощью циклов.
    println("Списки, задача 9:")
    val l9 = mutableListOf<String>()
    for (ele in l7) {
        l9.add(ele)
    }
    for (ele in l8) {
        l9.add(ele)
    }
    println(l9)

    //10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    println("Списки, задача 10:")
    val l10 = listOf<Int>(5, 1, 10, 20)
    var max: Int
    var min: Int
    max = l10[0]
    min = l10[0]
    for (ele in l10) {
        if (max < ele) max = ele
        if (min > ele) min = ele
    }
    println("$max - маскимум, $min - минимум")

    //11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    println("Списки, задача 11:")
    val l11 = listOf<Int>(10, 5, 1, 20, 20, 0, 30)
    val lRes = mutableListOf<Int>()
    for (ele in l11) {
        if (ele != 0 && ele % 2 == 0) lRes.add(ele)
    }
    println(lRes)

    //Sets
    //1. Создайте пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()

    //2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf(1, 2, 3)

    //3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    //4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    set3.add("Swift")
    set3.add("Go")

    //5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5 = mutableSetOf<Int>(2, 1, 50)
    set5.remove(2)

    //6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Множества, задача 6:")
    for(ele in set5) {
        println(ele)
    }

    //7. Создай функцию, которая принимает множество строк (set) и строку и проверяет,
    // есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    println("Множества, задача 7:")
    println(funForSet7(setOf("я", "учу", "Kotlin", "хотя", "я не", "Kot"),"Kot"))
    println(funForSet7(setOf("я", "учу", "Kotlin", "хотя", "я не", "Kot"),"Кот"))

    //8. Создайте множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
    println("Множества, задача 8:")
    val set8 = setOf("я", "учу", "Kotlin")
    val l = mutableListOf<String>()
    for (ele in set8) {
        l.add(ele)
    }
    println(set8)
    println(l)

}

fun funForArray10(a: Array<String>, s: String) {
    for (ele in a){
        if (ele.contains(s)) println(ele)
    }
}

fun funForSet7(set: Set<String>, s: String): Boolean {
    var res = false
    for (ele in set) {
        if (ele == s) {
            res = true
            break
        }
    }
    return res
}