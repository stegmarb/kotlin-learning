package chapter7

class Dog @JvmOverloads constructor(val name: String, weightParam: Int, breedParam: String) {
    var breed: String = breedParam.toUpperCase()
    var tamper: String = "Tamper"
    var weight: Int = weightParam
        set(value) {
            if (value >= 0)
                field = value
        }
    val weightInKg
        get() = weight / 2.2

    fun bark(): Unit {
        println(if (weight < 20) "Yip" else "Waf")
    }
}
