package com.example.fundamentos_kotlin

import kotlin.math.abs

fun main(){
    sayHello()
}
// Si una función es private, solo se accederá a ella dentro del mismo archivo
// en sayHello():Unit, el unit es como el void de kotlin, y en conjunto con los dos puntos
// indica que es el tipo de valor retornado por la función
private fun sayHello():Unit {
    println("Hola Kotlin!!!")
    //println(sum(8,29))
    val a=32
    val b=69
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${res(a,b)}")

    val c=-543
    //La función enableABS le aplica el valor absoluto a un valor entero que se mande
    //a la función, en este caso la constante c
    println(c.enableABS(false))

    //A continuación se muestra un ejemplo de una sobrecarga de funciones, que consiste en que
    //al asignarles un valor inicial a las variables dentro de la declaración de la función
    //se puede omitir el mandarle esos argumentos a la hora de mandar llamar la función
    producto("Café")
    producto("Refresco",5)
    producto("Sopas",3,"21/Feb/2022")
    //Se pueden mandar argumentos a variables específicas sin importar el orden de los parámetros
    //a esto se le llama "argumentos nombrados"
    producto("Helado", hasta = "17/Feb/2022")
}

fun sum(a:Int,b:Int):Int{
    return a+b
}

//Esta es otra notación válida para una operación con funciones
fun res(a:Int,b:Int)=a-b

//Infix ayuda a que se pueda utilizar la función como si se tratara de un operador aritmético
// principalmente ayuda para una mejor legibilidad de código y asemejarlo mas
// al lenguaje natural
infix fun Int.enableABS(enable:Boolean) = if (enable) abs(this) else this

fun producto(nombre:String,costo:Int=0,hasta:String="Agotar existencia"){
    println("El producto $nombre cuesta $$costo.00 hasta $hasta")
}