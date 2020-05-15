package chapter10

class Vet<in T: Pet> {
    fun treat(t: T) {
        println("Treat pet $t")
    }
}