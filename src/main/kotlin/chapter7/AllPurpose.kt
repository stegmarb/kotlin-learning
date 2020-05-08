package chapter7

fun main() {
    val recipe1 = Recipe("Masala", "soy", isVegetarian = false)
    val recipe2 = Recipe("Masala", "sweetcorn", isVegetarian = false)
    val recipe3 = recipe1.copy(title = "Something")
    println("${recipe1.hashCode()}")
    println("${recipe2.hashCode()}")
    println("${recipe3.hashCode()}")
    println("$recipe3")
    val (title, mainIngredient, isVegetartian, difficulty) = recipe1
    println("The recipe name is $title and vegetarian is $isVegetartian, difficulty is $difficulty, and the Chapter7.Chapter7.Chapter7.main ingredient is $mainIngredient")

    println(addNumbers(3, 4))
    println(addNumbers(3.5, 4.5))
}