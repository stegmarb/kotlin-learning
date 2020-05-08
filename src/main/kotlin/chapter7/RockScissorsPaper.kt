package chapter7
fun main() {
    var again = true
    while (again) {
        val options = arrayOf("Rock", "Paper", "Scissors")
        val gameChoice = getGameChoice(options)
        val userInput = getUserChoice(options)
        printResult(gameChoice, userInput)
        println("Do you want to play another turn? (Y or N)")
        val againDecision = readLine()
        if (againDecision != null && againDecision.capitalize() == "N")
            again = false
    }
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false;
    var userChoice = ""
    while (!isValidChoice) {
        print("Please inter one of the following options:")
        for (option in options)
            print(" $option")
        println(".")
        val tempralChoice = readLine();
        if (tempralChoice != null && tempralChoice in options) {
            userChoice = tempralChoice
            isValidChoice = true
        } else {
            println("You must enter a valid choice.")
        }
    }
    return userChoice
}

fun getGameChoice(optionsParam: Array<String>): String = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun printResult(userChoice: String, iaChoice: String) {
    if (userChoice == iaChoice) {
        println("Tie!")
    } else if ((userChoice == "Scissors" && iaChoice == "Paper") ||
        (userChoice == "Paper" && iaChoice == "Rock") ||
        (userChoice == "Rock" && iaChoice == "Scissors")){
        println("You win!")
    } else {
        println("You lose!")
    }

    val addition = if (userChoice == iaChoice) " also" else ""
    println("The computer's choice was$addition $iaChoice.")
}