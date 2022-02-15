package com.example.fundamentos_kotlin.classes

fun main(){

    val phone:Phone = Phone(1472583690)

    phone.call()
    phone.showNumber()

    val smartphone = Smartphone(3456723,true)
    smartphone.call()
    smartphone.showNumber()
}