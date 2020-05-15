package chapter10

class Contest<T : Pet> (val vet: Vet<T>){
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score > 0) scores.put(t, score)
    }

    fun returnWinner() : MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, value) in scores) {
            if (value == highScore) winners.add(t)
        }
        return winners
    }
}