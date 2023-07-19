package section_3

/**
 * DataClass
 * EnumClass
 * Sealed (Class, Interface)
 *
 * Dto
 *      데이터
 *      생성자, getter
 *      equals, hashCode, toString
 *
 *      자바에서는 추가적인 작업떄문에 불편함이 있음
 * ENUM
 *      클래스 상속 노노
 *      인터펭스 구현 가능
 *      각 코드는 싱글턴
 *
 *      sealed class와 함께 사용할 경우 좋음
 * sealed
 *      상속이 가능하도록 추상클래스를 만들고픔
 *          외부에서 상속받지 않았으면 함
 *              하위클래스 봉인
 *          컴파일 타임 때 하위클래스 타입을 기억
 *              즉, 런타임 때 클래스 타입 추가 불가
 *          하위클래스는 같은 클래스에 있어야함
 */
fun main() {
    val dto = PersonDto("Hell", 200)
    val dto2 = PersonDto("Hell", 200)

    println( dto == dto2)
}

fun handleCountry(country: Country) {
    when(country) {
        Country.AMERICA -> TODO()
        Country.KOREA -> TODO()
        Country.JAPAN -> TODO()
    }
}

data class PersonDto(
    val name: String,
    var age: Int,
)

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US"),
    JAPAN("JP")
}

sealed class Moin(
    val name: String,
    val price: Long,
)