package com.debdroid.hf.dp.decorator

abstract class Beverage {
    private var description: String = "Unknown description"

    open fun getDescription() = description

    abstract fun cost() : Double

    fun setDescription(description: String) {
        this.description = description
    }
}