package chapter9

import java.util.function.Predicate

fun main() {
    map()
}

fun list() {
    var list = listOf<String?>("1", "2", "3")
    if (list.isNotEmpty()) {
        println(list[0])
    }
    if (list.contains("1")) {
        println(list.indexOf("1"))
    }
    list = list.plus("sfefse")
    for (item in list) {
        println(item)
    }
}

fun array() {
    var array = arrayOf(1, 2, 3)
    var nullArray: Array<String?> = arrayOfNulls(2)
    val suze = array.size
    array.reverse()
    var isIn = array.contains(1)
    array.sum()
    array.average()
    array.min()
    array.max()
    array.sort()
}

fun mutableList() {
    val shoppingList = mutableListOf("Milk", "Bread", "Sausage", null)
    shoppingList.add("Eggs")
    shoppingList.add(1, "Fruit")
    println(shoppingList[1] == "Fruit")
    println(shoppingList.remove("Vegetables"))
    shoppingList.asReversed()
    println("My shopping list is $shoppingList")
    if (shoppingList.contains("Sausage")) {
        shoppingList[shoppingList.indexOf("Sausage")] = "Coffee"
    }
    println("My shopping list has changed to $shoppingList")
}

fun mutableSet() {
    val guestList = mutableSetOf<String?>("Ryan", "Jim", "Pam")
    println(guestList.size)
    guestList.add("Ryan")
    println(guestList.size)
    guestList.add("Michael")
    println(guestList.size)
    guestList.removeIf { t -> (t?.length ?: 0) > 3 }
    println(guestList.size)
}

fun map() {
    val r1 = Recipe("Pizza", false)
    val r2 = Recipe("Chicken", true)
    val r3 = Recipe("Hamburger", false)
    val map = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("My map is $map")
    for ((key, value) in map) {
        println("The $key is ${value.name} and its difficulty is ${value.difficult}")
    }
    val values = map.values.toMutableList()
    println(map.size)
    println(values.remove(Recipe("Pizza", false)))
    println(map.size)
    val keys = map.keys
    map.remove("Recipe1")
    println(map.size)

}