package chapter10.retailer

interface Retailer<out T> {

    fun sell() : T
}