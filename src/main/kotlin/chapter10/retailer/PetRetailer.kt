package chapter10.retailer

import chapter10.Dog
import chapter10.Pet

class PetRetailer: Retailer<Pet> {
    override fun sell(): Pet {
        return Dog("")
    }
}