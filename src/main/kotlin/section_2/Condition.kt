package section_2

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("0--100 사이에 있어야지 커야지 새꺄")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score:Int): String {
    return if (score >= 90) {
         "A"
    } else if (score >= 80) {
        "B"
    } else {
        "C"
    }
}
/**
 * Switch -> When
 * 조건부 = 어떤 expression이라도 들어갈 수 있음
 * 파이프가 우아하네
 */

fun getGradeWithSwitch(score: Int):String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int)  {
      when(number) {
          1, 0, -1 -> println("HH")
          else -> println("HH")
      }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("0")
        number % 2 == 0 -> println("even")
        else -> println("odds")
    }
}