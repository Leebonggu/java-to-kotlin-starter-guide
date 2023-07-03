package section_1

/**
 * Null 체크
 * null이 가능한 타입을 완전히 다르게 취급
 *
 * 1. Safe Call
 *      -> nullable?.method()
 */
fun main() {
    val str: String? = null
    println(str?.length)
    println(str?.length ?: "Hello")
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith('A') ?: throw IllegalArgumentException("null")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith('A')
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith('A') ?: false
}

