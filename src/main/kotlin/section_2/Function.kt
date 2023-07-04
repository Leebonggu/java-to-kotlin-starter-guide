package section_2

/**
 * 함수
 *
 * 클래스 내부, 최상단 모두 선언 가능
 * 자바에서는 named parameter 사용불가
 */
fun main() {
    repeat("Hello")
    printAll("a", "b", "c")

    val array = arrayOf("1", "2","3")

    printAll(*array) // *spread 연산자
}

fun max(a: Int, b: Int): Int {
    return if (a > b) { a }  else  { b }
}

fun max2(a: Int, b: Int): Int = if (a > b) { a }  else  { b }
fun max3(a: Int, b: Int): Int = if (a > b) a else  b

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if(useNewLine) {
            println("New line")
        } else {
            print("not New Line")
        }
    }
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

