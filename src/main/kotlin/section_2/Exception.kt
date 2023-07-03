package section_2

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

/**
 * 예외처리
 *
 * 1. try...catch...finally -> 값처럼 사용가능하기 때문에 바로 return 가능
 * 2. checked, unchecked -> 구분하지않음. 모두 unchecked로 간주
 * 3. try with resources -> use 사용
 */

fun main() {
    println(parseIntOrNull("A"))
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch(e: NumberFormatException) {
        throw IllegalArgumentException("주어진 $str 숫자가 될 수 없습니다.")
    }
}

fun parseIntOrNull(str: String): Int? {
    return try {
        str.toInt()
    } catch(e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFilePath(path: String) {
    BufferedReader(FileReader(path)).use {reader ->
        println(reader.readLine())
    }
}