package com.example.fundamentos_kotlin.classes

//una data class indica que esuna clase que manejará datos, y gracias a eso
//habilita ciertos atributos especiales de este tipo de clases
data class User(val id:Long, var name:String, var lastName:String, var group:Int){

}