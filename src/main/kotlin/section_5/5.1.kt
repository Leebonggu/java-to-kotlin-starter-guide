package section_5

/**
 * 람다 + 컬렉션
 */

fun main() {
//    findTheOldest(person)

    val people2 = listOf(Person("Bong", 29), Person("Bong2", 31))
    println(people2.maxByOrNull { p: Person -> p.age }?.age)
    println(people2.maxByOrNull { it.age }?.age)
    println(people2.maxByOrNull(Person::age)?.age)

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error!!!!:")

    val response = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error", "501 Internal Server Error")
    printProblemCounts(response)

    run {
        val t = people2.maxByOrNull { p: Person -> p.age }?.age
        println(t)
        println(42)
    }

    class Ref<T>(var value: T)
    val count = Ref(0)
    println(count.value)
    val inc = { count.value++ }

}
data class Person(val name: String, val age: Int)

/**
 * No 람다
 */
fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null

    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

val person = listOf(Person("Bong", 29), Person("Bong2", 30))

val sum = { x: Int, y: Int -> x + y }

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    message.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}