package coursera

data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

//fun equals2(v1: Value?, v2: Value?): Boolean  {
//    var b = false
//    if (v1 != null && v2 != null)
//        b = v1.equals(v2)
//    return v1 === v2 || b
//}

fun equals2(v1: Value?, v2: Value?): Boolean = v1?.equals(v2) ?: false && v1 === v2

fun main(args: Array<String>) {
    equals1(Value("abc"), Value("abc")) eq true
    equals1(Value("abc"), null) eq false
    equals1(null, Value("abc")) eq false
    equals1(null, null) eq true

    equals2(Value("abc"), Value("abc")) eq true
    equals2(Value("abc"), null) eq false
    equals2(null, Value("abc")) eq false
    equals2(null, null) eq true
}

private infix fun Boolean.eq(b: Boolean): Boolean {
    return this == b
}
