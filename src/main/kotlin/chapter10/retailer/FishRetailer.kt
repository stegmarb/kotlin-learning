package chapter10.retailer

import chapter10.Fish

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell a fish!")
        return Fish("")
    }

}