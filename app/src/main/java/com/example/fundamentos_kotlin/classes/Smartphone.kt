package com.example.fundamentos_kotlin.classes

class Smartphone(number:Int, val isPrivate:Boolean) :Phone(number) {
    //a continuacion se sobre escribe la función "shownumber" heredada de la clase "Phone"
    override fun showNumber() {
        if(isPrivate == true){
            println("Desconocido")
        } else { super.showNumber() }
    }



}