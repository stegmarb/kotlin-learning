package coursera

data class Evaluation(val rightPosition: Int, val wrongPosition: Int) {
    infix fun eq(result: Evaluation): Boolean {
        return this == result;
    }
}

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { pair -> pair.first == pair.second }

    val list = mutableListOf(1,2,3,4)


    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { it == ch }, guess.count { it == ch })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    evaluateGuess("BCDF", "ACEB") eq result
    evaluateGuess("AAAF", "ABCA") eq result
    evaluateGuess("ABCA", "AAAF") eq result
    result.takeIf { it.rightPosition == 5 }?.let { println("Something") }
    run { println("fsefs") }
}