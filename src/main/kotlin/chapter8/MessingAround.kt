package chapter8

fun main() {
    val w: Wolf? = Wolf()
    val w2: Wolf? = null
    println(w?.hunger)
    println(w2?.hunger)
    var myWolves: Array<Wolf?> = arrayOf(Wolf(), null, Wolf())
    w2?.let {
        println(it.hunger)
    }
    var array: Array<String?> = arrayOf("One", "Two", null)
    for (item in array) {
        item?.let {
            println(it)
        }
    }
    if (w != null) println("Not null") else println("Null")
    w?.hunger ?: 12
    w2?.hunger ?: 12
}