package chapter10.retailer

import chapter10.Cat

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell a cat!")
        return Cat("")
    }
}