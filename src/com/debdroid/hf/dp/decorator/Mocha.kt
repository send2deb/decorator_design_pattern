package com.debdroid.hf.dp.decorator

class Mocha(val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription() = "${beverage.getDescription()}, Mocha"

    override fun cost() = beverage.cost() + 0.20
}