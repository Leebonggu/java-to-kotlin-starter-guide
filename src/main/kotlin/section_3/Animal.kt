package section_3

/**
 * final: override 할 수 없게 한다. default로 보이지 않게 존재
 * open: override를 열어준다
 * abstract: 반드시 override 해야한다
 * override: 상우 ㅣ타입을 오버라이드 하고 있다.
 * 상속, 구현 시 -> : 사용
 * 상위 클래스 상속 구현시 생성자를 호출
 * 추상멤버가 아니면 기본적으로 오버라이드 불가 (open)
 */
abstract class Animal (
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}