package section_5

/**
 * 수신 객체 지정 람다: with, apply
 *
 * 함수를 객체에 바인딩하는거?
 */
fun main() {
    fun alphabet(): String {
        val result = StringBuilder()
        for (letter in 'A'..'Z') {
            result.append(letter)
        }
        result.append("\nNow I know the alphabet!")
        return result.toString()
    }
//    println(alphabet())

    fun alphabet2() {
        val result = StringBuilder()
        return with(result) {
            for (letter in 'A'..'Z') {
                println(letter)
                this.append(letter)
            }
            append("\nNow I know the alphabet!")
            this.toString()
        }
    }
    println(alphabet2())

    fun alphabet3() {
        val result = StringBuilder()
        return with(result, {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\nNow I know the alphabet!")
            this.toString()
        })
    }
//    println(alphabet3())

    fun alphabet4() = with(StringBuilder() ) {
            for (letter in 'A'..'Z') {
                this.append(letter)
            }
            append("\nNow I know the alphabet!")
            this.toString()
        }
    println(alphabet4())

    fun alphabet5() = buildString {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know the alphabet!")
        this.toString()
    }
    println(alphabet5())
}