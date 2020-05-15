package chapter10.retailer

import chapter10.Cat
import chapter10.Dog
import chapter10.Pet

fun main() {
    val dogRetailer : Retailer<Dog> = DogRetailer()
    val catRetailer : Retailer<Cat> = CatRetailer()
    val petRetailer : Retailer<Pet> = CatRetailer()
    petRetailer.sell()
}