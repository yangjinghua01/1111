package com.example.myapplication

fun main() {
    val  list:List<String> = listOf<String>("apple","pear","banana","watermelon")
    list.maxBy { it.length }
}