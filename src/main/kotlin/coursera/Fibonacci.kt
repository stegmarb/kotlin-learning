package coursera

fun fibonacci(): Sequence<Int> = sequence {
    var terms = Pair(0, 1)
    while (true) {
        yield(terms.first)
        terms = Pair(terms.second, terms.first  + terms.second)
    }
}

fun main(args: Array<String>) {
    val builderAction: StringBuilder.() -> Unit = { append("...") }
    val stringBuilder: StringBuilder = StringBuilder()
    stringBuilder.builderAction()
    fibonacci().take(4).toList().toString() eq "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}
