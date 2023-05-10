package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun print(){
        val  list:List<String> = listOf<String>("apple","pear","banana","watermelon")
        var lambda ={fruit:String ->fruit.length}
        val res = list.maxBy(lambda)
        print(res)
        println("hhhhhh")
    }
}