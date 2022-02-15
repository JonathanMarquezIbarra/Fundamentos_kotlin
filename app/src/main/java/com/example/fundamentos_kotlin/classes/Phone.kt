package com.example.fundamentos_kotlin.classes

//Con la palabra reservada "open" se habilita la posibilidad de que se herede de esta clase
//con la palabra "protected" se indica que esa variable solo será accesible desde la misma clase
//y desde las clases que hereden de ella, proporcionandole mayor seguridad.
open class Phone (protected val number:Int){

    fun call(){
        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi número es: $number")
    }
}