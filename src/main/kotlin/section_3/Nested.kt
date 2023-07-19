package section_3

import com.lannstark.lec13.JavaHouse.LivingRoom

/**
 * 중첩클래스
 *
 * 1. 종류
 * 2. 중첩클래스/내부클래스
 */

/**
 * 자바
 * Static -> o
 * Static -> x
 *  내부 -> 외부 클래스 접근 가능
 *      static이 붙는다면, 외부 클래스 참조 불가
 *          1. 메모리 누수 가능성
 *          2. 직렬화 문제
 *          3. 그러므로 static을 사용해라
 *  지역
 *  익명
 */

/**
 * 코틀린 권장
 *      기본적으로 바깥과 연결이 없는 중첩클래스가 만들어짐
 *      참조하고 싶으면, 명시적으로 표현
 */
class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )

}

class JavaHouse2(
    private val address: String,

) {
    private val livingRoom = this.LivingRoom2(10.1)
    inner class LivingRoom2(
        private val area: Double
    ) {
        val address: String
            get() = this@JavaHouse2.address
    }

}