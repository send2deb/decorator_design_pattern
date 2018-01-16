package com.debdroid.hf.dp.decorator.java.io.example

import java.io.FilterInputStream
import java.io.InputStream
import java.io.IOException


class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {

    @Throws(IOException::class)
    override fun read(): Int {
        val c = super.read()
//        println("Read without parameter!")
        return if (c == -1) c else c
//        return if (c == -1) c else c.toChar().toLowerCase().toInt()
    }

    @Throws(IOException::class)
    override fun read(b: ByteArray, offset: Int, len: Int): Int {
        val result = super.read(b, offset, len)
//        println("Read with parameter is called!")
        for (i in offset until offset + result) {
            b[i] = Character.toLowerCase(b[i].toChar()).toByte()
        }
        return result
    }
}