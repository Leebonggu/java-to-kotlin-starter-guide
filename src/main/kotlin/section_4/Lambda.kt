package section_4

import com.lannstark.lec17.Fruit

/**
 * 1. ㅈㅏ바에서 람다를 다루기 위한 노력
 * 2. 코틀린에서 람다
 * 3. 클로저
 * 4. try with resources
 */

/**
 * 1. 자바에서 람다를 다루기 위한 노력
 *
 * - 자바에서 조건이 많아지는 경우?
 *  - 익명클래스, 인터페이스 활용
 *  - 하지만, 익명클래스를 사용하는 것은 복잡하다.
 *  - 다양한 필터가 필요할 수도 있다.
 * - JDK 8 람다활용 추가
 *  - 함수 자체를 넘겨주는 것 처럼 사용가능
 *   - 실제로는 인터페이스를 넘겨줌
 *   - 이 말은, 함수가 일급시민이 아님.
 */

/**
 * 2. 코틀린에서 람다.
 *
 * - 함수는 일급시민이다.
 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 2_000),
        Fruit("사과", 3_000),
        Fruit("바나나", 5_000),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    /**
     * 람다 호출 방법
     */
    isApple.invoke(fruits[0])
    isApple2(fruits[0])


    println(filterFruits(fruits, isApple))
    // == filterFruits(fruits){ it.name === "사과"}
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()

    for(fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}

/**
 * 3. 클로저
 *
 * 람다가 실행되는 지점에 참조하고 있는 변수들을 모두 포획하여 그 정보를 가지고 있음.
 * -> 클로저
 */

/**
 * try with resources -> use
 */