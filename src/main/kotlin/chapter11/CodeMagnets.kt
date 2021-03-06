package chapter11

data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double)


fun main() {
    println(circleOfNumbers(10, 7))
//    val groceries = listOf(Grocery("Tomatoes", "Vegetables", "lb", 3.0),
//        Grocery("Mushrooms", "Vegetables", "lb", 4.0),
//        Grocery("Bread", "Bakery", "Pack", 1.5))
//    println("Expensive ingredients:")
//    search(groceries) {i: Grocery -> i.unitPrice > 3.5}
//    println("All vegetables:")
//    search(groceries) {i: Grocery -> i.category == "Vegetables"}
//    println("All packs:")
//    search(groceries) { it.unit == "Pack"}
}

fun search(groceries: List<Grocery>, lambda: (Grocery) -> Boolean = { true }) {
    for (grocery in groceries) {
        if (lambda(grocery)) {
            println(grocery.name)
        }
    }
}

fun circleOfNumbers(n: Int, firstNumber: Int): Int {
    val degree = 360 / n
    val opposit = 180 / degree
    return if (n <= firstNumber + opposit) (firstNumber + opposit) % n else firstNumber + opposit
}