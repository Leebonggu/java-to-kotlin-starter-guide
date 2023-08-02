package section_5

/**
 * 컬렉션 함수형 API
 */

fun main() {
    val list = listOf(1, 2, 3, 4)
    val list2= list.map { it * 2 }
    println(list2)

    val people = listOf(Person5_2("Bong", 29), Person5_2("Bong2", 30) , Person5_2("Bong3", 31), Person5_2("Bong4", 21), Person5_2("Bong4", 31))
    people.filter { it -> it.age >= 30}.forEach { println(it.name) }

    val peopleName = people.map(Person5_2::name)
    println(peopleName)

    val canBeInClub27 = { p: Person5_2 -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))
    println(people.count(canBeInClub27))

    /**
     * GroupBy
     */
    val group = people.groupBy { it.age }

    println(group[31]?.map{ it.age })

    /**
     * flatMap, flatten
     */
    class Book(val title: String, val authors: List<String>)


    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")), Book("Mort", listOf("Terry Pratchett")), Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    books.flatMap { it.authors }.toSet().forEach { println(it) }

    // List<List<>>형태일 떄
    val nestedList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5),
        listOf(6, 7, 8, 9)
    )
    nestedList.flatten()

}
data class Person5_2(val name: String, val age: Int)

