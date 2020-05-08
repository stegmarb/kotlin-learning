package chapter7

fun main(args: Array<String>) {
    var dog = Dog("Astor", 30, "Sheer terrier")
    println(dog.breed)
    dog.weightInKg
    println("Something is not okay with ${dog.name}")
    dog.weight = -1
    println("Its weight is ${dog.weight}")
    dog.weight = 43
    println("Its weight is ${dog.weight}")
    dog.bark()
}