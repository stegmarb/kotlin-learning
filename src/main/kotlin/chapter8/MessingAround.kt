package chapter8

fun main() {
    val w: Wolf? = Wolf()
    val w2: Wolf? = null
    println(w?.hunger)
    println(w2?.hunger)
    var myWolves: Array<Wolf?> = arrayOf(Wolf(), null, Wolf())
}