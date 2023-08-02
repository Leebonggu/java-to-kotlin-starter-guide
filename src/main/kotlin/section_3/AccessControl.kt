package section_3

/**
 * 자바
 * public
 *  모든
 * protected
 *  같은 패키지 또는 하위 클래스
 * default
 *  같은 패캐지에서만
 * private
 *  선언된 클래스
 *
 *  코틀린
 *  public
 *   모든
 *  protected
 *   선언된 클래스 하위에서만 가능. 파일 최상단에는 사용불가
 *  internal
 *   같은 모듈에서만 접근 가능
 *      모듈: 한번에 컴파일 되는 코틀린 코드
 *  private
 *   선언된 클래스
 *
 *  기본접근: public
 *  코틀린은 한 파일 내에서 변수, 함수, 클래스 모두 선언해서 사용가능
 *  아무 표기 없으면 public
 *
 *  클래스에 접근 지시어를 사용하려면 constructor를 함께 사용해야 한다.
 *  class AccessControl private constructor(){}
 *
 *  internal은 바이트 코드 상 Public
 *      대문에 자바 코드에서는 코틀린 뮤들의 internal 코드를 가져올 수 있음
 */
class AccessControl private constructor() {}

class  Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private  set
}