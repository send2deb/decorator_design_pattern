package com.debdroid.hf.dp.decorator

class Espresso : Beverage() {

    init {
        setDescription("Espresso")
        println("Espresso!")
    }
    override fun cost() = 1.99
}