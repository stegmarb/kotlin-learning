package chapter10

fun main() {
    val catVet = Vet<Cat>()
    catVet.treat(Cat("Siamiau"))

    val dogVet = Vet<Dog>()
    var contest = Contest(dogVet)

    val petVet = Vet<Pet>()
    var catContest = Contest<Cat>(petVet)
//    val retailer: Retailer<Pet> = CatRetailer()
}