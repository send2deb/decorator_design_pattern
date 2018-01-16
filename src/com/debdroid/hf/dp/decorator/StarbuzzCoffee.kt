package com.debdroid.hf.dp.decorator

fun main(args: Array<String>) {
    val beverage1: Beverage = Espresso()

    println("${beverage1.getDescription()} $${beverage1.cost()}")

    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)
    println("${beverage2.getDescription()} $${beverage2.cost()}")

    var beverage3: Beverage = HouseBlend()
    beverage3 = Soy(beverage3)
    beverage3 = Mocha(beverage3)
    beverage3 = Whip(beverage3)
    println("${beverage3.getDescription()} $${beverage3.cost()}")

    var beverage4: Beverage = Decaf()
    beverage4 = SteamedMilk(beverage4)
    beverage4 = Whip(beverage4)
    println("${beverage4.getDescription()} $${beverage4.cost()}")
}