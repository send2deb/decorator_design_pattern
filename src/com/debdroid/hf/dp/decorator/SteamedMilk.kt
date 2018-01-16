package com.debdroid.hf.dp.decorator

class SteamedMilk(val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription() = "${beverage.getDescription()}, Steamed Milk"

    override fun cost() = beverage.cost() + 0.10
}