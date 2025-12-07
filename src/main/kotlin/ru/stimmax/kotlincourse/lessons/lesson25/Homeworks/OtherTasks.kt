package org.example.ru.stimmax.kotlincourse.lessons.lesson25.Homeworks



fun main() {
    //2
    val employee = Employee("Ivan", 23, "QA").apply {
        email = "test@te.st"
        department = "Dep A"
    }

    //3
    fun logPerson(person: Person){
        with(person) {
            println("""
            name: $name
            age: $age
            email: $email
        """.trimIndent()
            )

        }
    }

    logPerson(Person("NameA", 20).apply {
        email = "test@te.st"
    })

    //4
    val p = Person("Vasya", 30).apply {
        email = "test@te.st"
    }
    val emp4 = with(p) {
        Employee(name, age, "QA").apply {
            email = email
            department = "Dep B"
        }
    }

    //5
    val emp5 = p.run {
        Employee(name, age, "QA").apply {
            email = email
            department = "Dep B"
        }
    }

    //6
    fun Person?.toEmployee(possition: String, dep: String): Employee? {
        return this?.let {
            Employee(it.name, it.age, possition).apply {
                email = it.email
                department = dep
            }
        } ?: null
    }


}