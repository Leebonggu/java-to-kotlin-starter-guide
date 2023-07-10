package section_4

/**
 * ㅂㅐ열은 잘 사용하지 않는다.
 * 배열보다는 List -> Why?
 *
 * Collection
 * - 불변인지, 기변인지 선언 필요
 *  - 기본적으로 불변
 * - collection
 * - list, set, map
 * - MutableList, MutableSet, MutableMap
 *
 * - 불변은 컬렉션에 값을 넣거나 뺄 수 없음
 * - 불변 리스트라도, Reference Type의 데이터는 변경가능
 *   - List내부에 class가 있는 경우
 * - 먼저 불변 리스트를 만들고, 필요할 때 가변리스트로 만들기
 */

fun main() {
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }

    val newArray = array.plus(300) // 불변성이 유지되는듯
    for ((idx, value) in newArray.withIndex()) {
        println("${idx} ${value}")
    }

//    lists()
    maps()
}

fun lists() {
    val numbers = listOf(100, 200) //
    val emptyList = listOf<Int>() // empty의 경우 타입을 명시해야 한다.

    println(numbers[0])

    val mutableNumber = mutableListOf(100, 200)
    mutableNumber.add(300)
    println(mutableNumber)
}

fun sets() {
    val mutableSet = mutableSetOf(100, 200, 100)
    println(mutableSet)
}

fun maps() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "Monday"
    oldMap[2] = "Tuesday"

    val useTo = mapOf(1 to 'M', 2 to 'T')

    println(oldMap)
    println(useTo)

    for(key in oldMap.keys) {
        println(key)
    }

    for((k, v) in oldMap.entries) {
        println(v)
        println(k)
    }
}

fun collectionWithNull() {
    // nullable이 있을 경우, 필요에 따라 wrapper를 통해 타입을 좁혀줄 필요가 있음
}