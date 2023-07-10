package section_4

import javax.print.attribute.standard.MediaSize.Other

/**
 * 다양한 함수 다루기
 *
 * 확장함수
 * 중위함수
 * 인라인함수
 * 지역함수
 */

fun main() {
    val hello = "hello"
    println( hello.lastChar())
}


/**
 * 확장함수
 *
 * 자바와 100% 호환하고 싶다.
 * 자바위에 자연스럽게 코틀린 코드 추가 가능?
 *
 * 함수는 클래스 밖에 만들 수 있게 하자.
 * 확장하려는 클래스.함수이름(파라미터)
 *
 * 확장함수에서는 원본 클래스의 private, protected 메소드를 가져올 수 없음
 * 중복선언될 경우, 멤버함수가 우선된다.
 * 확장함수는 현재 타입을 기준으로 실행
 *
 * 자바에서는 정적 메소드를 부를 방식으로 변환된다.
 *
 * 확장 프로퍼티와도 열결됨.
 */

fun String.lastChar(): Char {
    return this[this.length - 1]
}

/**
 * 중위함수
 *
 * 함수를 호출하는 새로운 방법
 * ex) downTo, step
 *
 * 변수 함수이름 argument
 */

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

/**
 * 인라인 함수
 *
 * 함수 호출 대신,. 함수의 본문을 그대로 붙여넣기
 * 함수를 파라미터로 전할 때 오버헤드를 줄일 수 있다.
 * 성능측ㅈ어과 함께 신중하게 사용되어야 하낟.
 */

/**
 * 지역함수
 *
 * 함수 안에 함수 선언
 * depth가 깊어지기도, 코드가 깔끔하지도 않음
 */

