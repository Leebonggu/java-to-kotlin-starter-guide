class MutableState<T>(initialValue: T) {
    var value: T = initialValue
        private set

    fun updateValue(newValue: T) {
        value = newValue
    }
}

fun <T> useState(initialValue: T): Pair<MutableState<T>, (T) -> Unit> {
    val state = MutableState(initialValue)

    val setState: (T) -> Unit = { value ->
        state.updateValue(value)
    }

    return Pair(state, setState)
}

fun main() {
    val (count, setCount) = useState(0)
    println(count.value) // 출력: 0

    setCount(5)
    println(count.value) // 출력: 5
}