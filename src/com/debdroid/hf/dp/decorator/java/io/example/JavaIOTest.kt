package com.debdroid.hf.dp.decorator.java.io.example

import java.io.*

@Throws(IOException::class)
fun main(args: Array<String>) {
    var c: Int

    try {
        val inputstream : InputStream = LowerCaseInputStream(BufferedInputStream(FileInputStream("test.txt")))

        val inputString = inputstream.bufferedReader().use { it.readText() }
        println(inputString)
    } catch (e: IOException) {
        e.printStackTrace()
    }
}