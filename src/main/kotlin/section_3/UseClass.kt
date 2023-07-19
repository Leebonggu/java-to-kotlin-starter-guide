package section_3

/**
 * 프로퍼티 = 필드 + getter + setter
 *
 * getter, setter 없이 . 을 통해 사용
 * 자바클래스여도 코틀린에서 만든 클래스처럼 사용 가능
 *
 * 주 생성자, 부생성자보다는 default 파라미터
 */

fun main() {
    val person = Person("Bong", );
    println(person.age)
    println(person.name)
}
// 주생성자
public class Person(name: String, age: Int) {
    val name: String = name;
    var age: Int = age;

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없다!")
        }
        println("초기화")
    }

    // 부생성자
    constructor(name: String): this(name, 1) {
        println("부생성자")
    }

    fun isAdult2(): Boolean {
        return this.age >= 20;
    }

    val isAdult: Boolean
        get() {
            return this.age >= 20
        }
}

class Person2(val name: String, var age: Int) {}
class Person3(val name: String, var age: Int)