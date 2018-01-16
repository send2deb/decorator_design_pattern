package com.debdroid.hf.dp.decorator

class Whip(val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription() = "${beverage.getDescription()}, Whip"

    override fun cost() = beverage.cost() + 0.10
}