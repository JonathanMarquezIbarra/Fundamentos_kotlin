package com.example.fundamentos_kotlin

/* --------------------------------------------------------------CREANDO LA PRIMER FUNCIÓN
fun main(){
    //print("Aprendiendo kotlin en mi curso.")
    newTopic("Hola kotlin!!!")

    // Con el signo de interrogación ? se indica que esa variable puede ser iniciada con valor nulo
    var objNull:String?
    objNull = null

    // Si a una variable se le añade la propiedad any, se le indica que puede contener cualquier tipo
    // de variable
    var objNull:any?
    objNull = null
}

fun newTopic(topic:String){
    //La diferencia entre print y println es que println añade un salto de línea al final
    //mientras que con print imprimirá cadena tras cadena
    /*println("")
    print("=========================  ")
    print(topic)
    print("  =========================")
    println("")*/

    //La \n sirve para hacer un salto de línea manual
    // el signo de $ sirve para concatenar una variable dentro de la cadena del print
    print("\n====================== $topic ======================\n")
}*/



fun main(){
    //print("Aprendiendo kotlin en mi curso.")
    newTopic("Hola kotlin!!!")
    newTopic("Variables y Constantes")
}

fun newTopic(topic:String){
    //La diferencia entre print y println es que println añade un salto de línea al final
    //mientras que con print imprimirá cadena tras cadena
    /*println("")
    print("=========================  ")
    print(topic)
    print("  =========================")
    println("")*/

    //La \n sirve para hacer un salto de línea manual
    // el signo de $ sirve para concatenar una variable dentro de la cadena del print
    print("\n====================== $topic ======================\n")
}