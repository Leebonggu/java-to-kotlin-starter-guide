package inAction

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}

fun<T>joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

val set = hashSetOf(1, 7, 23)
val list = arrayListOf(1, 7, 23)
val map = hashMapOf(1 to "one", 7 to "seven", 23 to "twenty-three")

