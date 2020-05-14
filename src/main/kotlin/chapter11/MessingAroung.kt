package chapter11

import chapter8.Wolf

fun main() {
    val addFive: (Int) -> Int = { it + 5 }
    println("Pass 6 to addFive: $addFive(6)")
    val lambda: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val result = lambda.invoke(5, 7)
    println("Pass 5 and 7 to lambda function: $result")
    val unit: () -> Unit = { println("Pow") }
    println(converter(20.0) { it * 1.8 + 32 })
    val convertResult = convertFive { it * 1.8 + 32 }
    val conversion = getConversionLambda("CentigradeToFahrenheit")(18.toDouble())
    println(conversion)
    println(conversion == converter(18.toDouble(), getConversionLambda("CentigradeToFahrenheit")))

    val kgsToPounds = { kg: Double -> kg * 2.204623 }
    val poundsToUsTons = { kg: Double -> kg / 2000 }

    val kgsToUsTons = combine(kgsToPounds, poundsToUsTons)
    println(kgsToUsTons(1000.0))


    val wolf: Wolf? = null
    wolf?.let { println(it.hunger) }
}

typealias DoubleConversion = (Double) -> Double

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { lambda2(lambda1(it))}
}

fun converter(x: Double, converter: DoubleConversion): Double {
    return converter(x)
}

fun convertFive(converter: (Int) -> Double): Double {
    val result = converter(5)
    println("Value 5 is converted to $result")
    return result;
}

fun getConversionLambda(str: String): (Double) -> Double {
    when (str) {
        "CentigradeToFahrenheit" -> {
            return { it * 1.8 + 32 }
        }
        "KgsToPounds" -> {
            return { it * 2.204623 }
        }
        "PoundsToUsTons" -> {
            return { it / 2000.0 }
        }
        else -> {
            return { it }
        }
    }
}