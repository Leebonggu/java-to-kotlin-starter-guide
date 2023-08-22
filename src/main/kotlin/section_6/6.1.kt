package section_6

/**
 * 코틀린 타입 시스템
 *
 * 코틀린의 핵심 타입스시템 -> 코드의 가독성을 향상
 * - 널이 될 수 있는 타입
 * - 읽기 전용 컬렉션
 * - 자바 타입 시스템에서 불필요한 부분 제거 (배열지원)
 */

/**
 * Nullability
 *
 * Null 여부를 컴파일 시점에 체크
 * - 컴파일러가 null 여부를 체크하므로, 런타임에서 발생하는 예외를 줄일 수 있다.
 * - null 여부를 체크하지 않아도 된다.
 * - nullable을 명시함으로 안전한 코딩을 할 수 있음
 */

fun main(){
    // setLen(null) -> Null can not be a value of a non-null type String
    printAllCaps("abc")
    printAllCaps(null)

    println(person.countryName2())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)

    printShippingLabel(person)
    printShippingLabel(Person("Dmitry", null))
}
fun setLen(s: String) = println(s.length)
fun safetySetLen(s: String?) = println(s?.length)

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.uppercase()
    println(allCaps)
}

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

/**
 * safety call chaining
 */

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    val country = this.company?.address?.country
    return if (country != null) country else "Unknown"
}

fun Person.countryName2(): String {
    val country = this.company?.address?.country
    return country ?: "Unknown"
}

val person = Person("Bong", null)

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

/**
 * 안전한 캐스트 -> as?
 *
 * 어떤 값을 지정한 타입으로 캐스트
 * 대상 타입으로 변환할 수 없으면 null
 *
 * 엘비스 연산자와 함께 사용하는 것이 일반적 패턴
 */

class Person2(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person2 ?: return false
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}

/**
 * 코틀린 널 처리 지원보다, 직접 컴파일러에게 널이 아니라는 사실을 알릴수도 있음
 */

/**
 * 단언 -> !!
 */

/**
 * late-initialized
 * 에러 메세지가 다름
 * lateinit property myService has not been initialized
 */

class MyService {
    fun performAction(): String = "foo"
}

//class MyTest {
//    private lateinit var myService: MyService
//    @Before fun setUp() {
//        myService = MyService()
//    }
//
//    @Test fun testAction() {
//        Assert.assertEquals("foo", myService.performAction())
//    }
//}

/**
 * 널이 될 수 있는 타입 확장
 * - 널이 될 수 있는 타입에 대해 확장 함수를 정의할 수 있다.
 * - 확장함수에서만 가능
 *
 * 널러블 체크를 만들지 않고, 추상화해서 사용
 */

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

/**
 * 타입파라미터 Nullable
 *
 * 코틀린에서 함수, 클래스의 모든 타입 파라미터는 기본적으로 널이 될 수 있다.
 * 널이 될 수 없는 타입으로 제한하려면, 타입 파라미터 이름 뒤에 ?를 붙인다.
 */