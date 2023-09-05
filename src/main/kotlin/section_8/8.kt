package section_8

/**
 * 8. 고차함수: 파라미터와 반환 값으로 람다 사용
 *
 * 코틀린에서는 람다나 함수 참조를 사용해 함수를 값으로 표현 가능
 * 고차함수는 함수를 인자로 받거나, 함수를 반환하는 함수
 * 고차 함수는 람다나 함수 참조를 인자로 넘길 수 있거나 람다나 함수 참조를 반환하는 함수
 *
 * 함수타입
 * 함수 타입을 정의히려면. 함수 파라미터의 타입을 괄호 안에 넣고, 그 뒤에 화살표를 추가한 다음 함수의 반환 타입을 지정하면 됨.
 *
 * (Int, String) -> Unit
 *
 * 함수 타입을 사용해 함수에 대한 참조를 담는 변수나 파라미터나 반환 값을 만들 수 있다.
 * 고차 함수는 다른 함수를 인자로 받거나 함수를 반환한다. 함수의 파라미터 타입이나 반환 타입으로 함수 타입을 사용하면 고차 함수를 선언할 수 있다.
 * 인라인 함수를 컴파일할 때 컴파일러는 그 함수의 본문과 그 함수에게 전달된 람다의 본문을 컴파일한 바이트코드를 모든 함수 호출 지점에 삽입해준다. 이렇게 만들어지는 바이트코드는 람다를 활용한 인라인 함수 코드를 풀어서 집적 쓴 경우와 비교할 때 아무 부가 비용이 들지 않는다.
 * 고차 함수를 사용하면 컴포넌트를 이루는 각 부분의 코드를 더 잘 재사용할 수 있다. 또 고차 함수를 활용해 강력한 제네릭 라이브러리를 만들 수 있다.
 * 인라인 함수에서는 람다 안에 있는 return 문이 바깥쪽 함수를 반환시키는 넌로컬 return을 사용할 수 있다.
 * 무명 함수는 람다 식을 대신할 수 있으며 return 식을 처리하는 규칙이 일반 람다 식과는 다르다. 본문 여러 곳에서 return 해야 하는 코드 블록을 만들어야 한다면 람다 대신 무명 함수를 쓸 수 있다.
 *
 * https://incheol-jung.gitbook.io/docs/study/kotlin-in-action/8
 */

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() }
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0 ) result.append(separator)
        result.append(transform(element))
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 함수 -> 함수
 *
 * 다른 함수를 반환하는 함수를 정의하려면 함수의 반환 타입으로 함수 타입을 지정해야 한다.
 * 함수를 반환하려면 return 식에 람다나 멤버 참조나 함수 타입의 값을 계산하는 식 등을 넣으면 된다.
 */

data class PersonWithPhone(val firstName: String, val lastName: String, val phoneNumber: String?)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (PersonWithPhone) -> Boolean { // 함수를 반환하는 함수를 정의한다.
        val startsWithPrefix = { p: PersonWithPhone ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix // 함수 타입의 변수를 반환한다.
        }
        return { startsWithPrefix(it)
                && it?.phoneNumber != null } // 람다를 반환한다.
    }
}
fun main() {
    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}

    val contacts = listOf(PersonWithPhone("Dmitry", "Jemerov", "123-4567"),
        PersonWithPhone("Svetlana", "Isakova", null))
    val contactListFilters = ContactListFilters()
    with (contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = false
    }
    println(contacts.filter(
        contactListFilters.getPredicate()))
}