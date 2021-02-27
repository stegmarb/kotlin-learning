package chapter7

data class Recipe (val title: String = "",
                   val mainIngredient: String = "",
                   val isVegetarian: Boolean = false,
                   val difficulty: String = "Easy") {
}

class Mushrooms (val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        findRecipe()
    }
}

fun findRecipe(title: String = "",
               mainIngredient: String = "",
               isVegetarian: Boolean = false,
               difficulty: String = "") : Array<Recipe> {
    return arrayOf(Recipe(title, mainIngredient, isVegetarian, difficulty))
}

fun addNumbers(num1: Int, num2: Int) : Int {
    return num1 + num2
}

fun addNumbers(num1: Double, num2: Double) : Double {
    return num1 + num2
}