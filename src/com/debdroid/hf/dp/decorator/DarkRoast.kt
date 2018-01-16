package com.debdroid.hf.dp.decorator

class DarkRoast : Beverage() {

    init {
        setDescription("DarkRoast Coffee")
        println("DarkRoast!")
    }
    override fun cost() = 0.99
}