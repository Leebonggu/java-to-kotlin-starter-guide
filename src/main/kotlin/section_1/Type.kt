package section_1

import com.lannstark.lec03.Person

/**
 * 코틀린 타입변환은 명시적으로 변경되어야 한다. (자바는 큰 범위 타입으로 암시적 변환)
 * to기본타입 를 통해 타입을 명시적으로 변경
 */
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
    if (obj is Person) { // instanceof 대신 is
        val person  = obj as Person
        println(person.age) // 위에서 타입 체크가 될 경우, person에 할당하지 않아도 가능: 타입 스마트 캐스트
    }
}

fun printAgeIfPersonNull(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

