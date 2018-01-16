package com.debdroid.hf.dp.decorator

class HouseBlend : Beverage() {

    init {
        setDescription("HouseBlend Coffee")
        println("HouseBlend!")
    }
    override fun cost() = 0.89
}