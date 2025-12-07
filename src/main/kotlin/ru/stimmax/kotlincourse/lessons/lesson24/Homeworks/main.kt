package org.example.ru.stimmax.kotlincourse.lessons.lesson24.Homeworks

// 1
fun one(b: Boolean, arg: (String) -> Unit): Int{
    return 1
}

//2
fun Int.two(arg: Int.(String) -> List<String>): List<String>{
    return listOf("str")
}

//3
fun <T, J> T.three(arg: T.() -> J): J {
    return arg()
}

//4

fun four(s: String): () -> String {
    val fnc: () -> String = {s}
    return fnc
}

//5
fun <T> T.five(): (s: String) -> T {
    val fnc: (String) -> T = {this}
    return fnc
}

//6


fun main() {
}