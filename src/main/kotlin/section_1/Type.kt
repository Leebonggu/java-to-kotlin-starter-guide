package section_1

import com.lannstark.lec03.Person

fun main() {
    val number1 = 3
    val number2 = 5
    val result = 3/5.toLong()

    val number3: Int? = 3
    val number4 = number3?.toLong() ?: 0L

    println(number4)
    printAgeIfPersonNull(null)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        var person  = obj as Person
        println(person.age)
    }
}

fun printAgeIfPersonNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

