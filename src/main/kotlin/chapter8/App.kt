package chapter8

fun main() {
    var wolf: Wolf? = Wolf()

    if (wolf != null) {
        wolf.bark()
    }

    var x = wolf?.hunger
    println("Wolf hunger is $x")

    wolf = null

    var y = wolf?.hunger ?: -1
    println("Wolf hunger is $y")

    var w : Wolf? = null
    var k = w as? Int
    println("$k")
    var z = w!!.hunger
}

fun Wolf.bark(): Unit {
    println("Bark")
}