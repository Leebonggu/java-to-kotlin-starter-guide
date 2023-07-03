package section_1

/**
 * var -> 가변
 * val -> 불변
 *
 * 타입의 경우, 컴파일러가 추론해줌
 * Array안에 값을 추가 가능 (재할당이 안될뿐)
 */
fun main() {
    val num: Int;

    num = 1;

    println(num)

    // Primitive
    // Long으로 합쳐져 있지만, 상황에 따라 Primitive로 적절하게 변환해서 해결해준다.
    var number1 = 10L
    var number3 = 1_000L

    // nullable
    // 기본적으로는 null이 들어가지 못하게 설계
    // 타입? 을 통해 nullable을 명시가능
    var number4: Long? = null
}
