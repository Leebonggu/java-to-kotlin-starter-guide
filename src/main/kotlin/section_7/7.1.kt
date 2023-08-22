package section_7

/**
 * 산술 연산자 오버로등
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun rem(other: Point): Point {
        return Point(x % other.x, y % other.y)
    }

    operator fun div(other: Point): Point {
        return Point(x / other.x, y / other.y)
    }

    operator fun times(other: Point): Point {
        return Point(x * other.x, y * other.y)
    }
}

fun printArray() {
    val numbers = ArrayList<Int>()
    numbers += 10
    numbers += 20
    println(numbers)
}

/**
 * 단항연산
 *
 */

/**
 * 비교연산
 */
class PurePoint(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is PurePoint) return false
        return other.x == x && other.y == y
    }
}

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

class Foo {
    val p: Type by Delegate()
}

class Delegate {
    operator getValue()
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    val p3 = Point(30, 40)
    println(p1 + p2 + p3)

    printArray()

    println(p1[0])


}