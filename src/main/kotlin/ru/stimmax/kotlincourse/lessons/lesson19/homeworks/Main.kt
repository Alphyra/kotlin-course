package org.example.ru.stimmax.kotlincourse.lessons.lesson19.homeworks

//1 Напиши функцию getMiddleElement с дженериком, которая будет принимать список и возвращать средний элемент,
// если он существует, иначе возвращать null. Например, у списка из четырёх элементов - среднего элемента нет.
fun <T> getMiddleElement(list: List<T>): T? {
    val s = list.size
    if ( s % 2 == 0) {
        return null
    } else {
        return list[s / 2]
    }
}

//2 Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового элемента
// и получения всех элементов в виде неизменяемого списка.

class ListHolder<T>(val list: MutableList<T>){
    fun addToList(ele: T) {
        list.add(ele)
    }
    fun getlist(): List<T> {
        return list.toList()
    }
}

//3 Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
//элементов одного типа в элементы другого типа
//списка элементов одного типа в список элементов другого типа

interface Mapper<T,B> {
    fun transform(v: T): B
    fun transformList(l: List<T>): List<B>
}

//4 Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>.
// Метод преобразования должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
// Метод преобразования списков с аналогичной механикой

class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun transform(v: String): List<String> {
        return v.split(" ")
    }

    override fun transformList(l: List<String>): List<List<String>> {
        return l.map { it.split(" ") } // ?
    }
}

//5 Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь,
// в котором ключ и значения поменялись местами.

fun <T,N> transposition(m : Map<T,N>): Map<N, T> {
    return m.map {it}.associate { it.value to it.key }
}

// 6 Напиши интерфейс Validator с дженериком с функцией валидации,
// которая будет принимать элемент с типом дженерика и возвращать булево значение.
interface Validator<T> {
    fun validate(t: T): Boolean
}

//7 Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
// Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
class StringValidator : Validator<String?> {
    override fun validate(t: String?): Boolean {
        return t.isNullOrEmpty()   //?
    }
}

//8 Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
// Реализуй проверку, что число чётное.

class OddValidator : Validator<Int> {
    override fun validate(t: Int): Boolean {
        return t % 2 == 0
    }
}

//9 Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator
// типизированный по типу List с nullable типом дженерика класса
//Реализуй проверку:
//Ни один элемент списка не является null
//Ни один элемент приведённый к типу Double не равен 0.0
class ListValidator<T:Number> : Validator<List<T?>>{
    override fun validate(t: List<T?>): Boolean {
        return t.all { it != null && it.toDouble() != 0.0}
    }
}

fun main() {
    //1
    getMiddleElement(listOf(1, 2, 3))

    //4
    val p = PhrasesToListOfStrings()
    println(p.transform("string"))
    println(p.transformList(listOf("two", "strings")))

}