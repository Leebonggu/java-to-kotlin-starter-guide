package section_1

import com.lannstark.lec04.JavaMoney

/**
 * 단항, 산술
 * 비교, 동등 -> 객체 비교시 compareTo를 자동으로 실행
 * -> 동등성: 값이 같은가? ==
 * -> 동일성: 값도, 메모리 주소도 같은가? ===
 * 논리 및 코틀린 전용
 * -> in / !in / a..b / a[i]
 * 연산자 오버로딩
 */
fun main() {
    val money1 = JavaMoney(3000L)
    val money2 = JavaMoney(2000L)
    val money3 = money2

    println(money1 === money3)
    println(money2 === money3)
    println(money2 == money3)
}