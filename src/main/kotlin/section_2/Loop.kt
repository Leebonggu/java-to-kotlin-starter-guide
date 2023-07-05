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

    fun solution(start: Int, end: Int): List<Int> {
        val result = mutableListOf<Int>()

        for (i in start downTo end) {
            result.add(i)
        }

        println(result)
        return result
    }

    fun solution2(myString: String, index_list: IntArray): String {
        var answer: String = ""

        index_list.forEach{ index ->
            run {
                println(myString[index])
                answer = answer.plus(myString[index])
            }
        }

        return answer
    }


    solution(1, 5)
    val list = intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)
    solution2("cvsgiorszzzmrpaqpe", list)
}