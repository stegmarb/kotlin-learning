package coursera

interface X {
    var first: Int
    var second: Int
    var third: Int
}

interface Y {
    fun start()
    fun finish()
}

interface Z {
    fun init()
}

fun foo(x: X, y: Y?, z: Z) {
    with (x) {
        first = 1
        second = 2
        third = 3
    }
    y?.let {
        it.start()
        it.finish()
    }
    val result = z.apply {
        init()
    }
}