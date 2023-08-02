package section_3

/**
 * object
 *
 * static -> companion object
 *      인스턴스화 할 때 새로운 값이 복제되는게 아니라, 인스턴스끼리 값을 정적으로 공유
 *      클래스와 동행하는 유일한 오브젝트
 *      const val -> 진짜상수. 기본타입/문자에만 붙일 수 있음
 *
 *      하나의 객체처럼 다뤄짐
 * 싱글톤
 * 익명 클래스
 *      1회성으로 사용하는 클래스
 */

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class MrPerson private constructor(
    var name: String,
    var age: Int
) {
    companion object Factory {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): MrPerson {
            return MrPerson(name, MIN_AGE)
        }
    }
}

// 싱글톤
object Singleton {
    var a: Int = 0
}

