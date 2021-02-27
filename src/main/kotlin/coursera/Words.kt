package coursera

class Words {
    private val list = mutableListOf<String>()

    internal operator fun String.unaryPlus() {
        record()
    }

    internal fun String.record() {
        list.add(this)
    }



    override fun toString() = list.toString()
}

fun main(args: Array<String>) {
    val words = Words()
    with(words) {
        // The following two lines should compile:
        "one".record()
        + "two"
    }
    words.toString() eq "[one, two]"
}