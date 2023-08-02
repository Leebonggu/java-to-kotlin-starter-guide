package section_5

/**
 * Lazy
 *
 * 시퀀스를 사용하면, 중간과정에 컬렉션이 생성되지 않는다.
 */

fun main() {
    val seq = listOf(1,2,3,4).asSequence().map {println("map $it"); it * it }.filter { println("filter $it"); it % 2 == 0 }.toList()
    println(seq)
    println(seq.toList())
}