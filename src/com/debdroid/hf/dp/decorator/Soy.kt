package com.debdroid.hf.dp.decorator

class Soy(val beverage: Beverage) : CondimentDecorator() {

    override fun getDescription() = "${beverage.getDescription()}, Soy"

    override fun cost() = beverage.cost() + 0.15
}