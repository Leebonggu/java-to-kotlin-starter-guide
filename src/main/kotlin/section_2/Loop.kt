package section_2

/**
 * Loop
 *
 * .. -> 등차수열을 상속받음: IntProgession
 *      -> 1..3 step n: 등차수열을 만드는 것
 *      -> downTo, step -> 함수 (중위호출함수)
 */
fun main() {
    val numbers = listOf(1L, 2L, 3L)

    for(number in numbers) { // iterable이면 뭐든지 올 수 있음
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1 ) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }
}