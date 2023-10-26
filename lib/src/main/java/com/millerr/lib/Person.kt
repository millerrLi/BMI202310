package com.millerr.lib

fun main(){
    val p = Person()
    p.height = 1.85f
    p.weight = 91f

    println("Your BMI is ${p.getBmi()}")
}

class Person {
    var weight : Float = 0f
    var height : Float = 0f

    fun getBmi(): Float{
        val bmi = weight / (height * height)
        return  bmi
    }
}