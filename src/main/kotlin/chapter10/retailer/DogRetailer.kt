package chapter10.retailer

import chapter10.Dog

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell a dog!")
        return Dog("")
    }
}