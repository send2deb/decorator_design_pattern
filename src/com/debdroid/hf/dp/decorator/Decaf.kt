package com.debdroid.hf.dp.decorator

class Decaf : Beverage() {

    init {
        setDescription("Decaf Coffee")
        println("Decaf!")
    }
    override fun cost() = 0.99
}