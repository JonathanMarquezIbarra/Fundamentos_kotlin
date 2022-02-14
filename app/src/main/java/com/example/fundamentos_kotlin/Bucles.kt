package com.example.fundamentos_kotlin

//Ejemplo de declarar una constante global que se crea en tiempo de compilación
//(las constantes val se crean en tiempo de ejecución normalmente)
const val nombreDeLaConstante:String = "En tiempo de compilación"

fun main() {
    //Se le manda un arreglo de variables a la función showPersons
    //y la función está lista para recibir de parámetro un arreglo gracias
    //a la palabra reservada vararg
    showPersons("Angel","Mary","Fany","Juan","Candelaria")
}

fun showPersons(vararg persons:String){
    //en el for se indica que por cada persona dentro de la variable personas,
    //la cual contiene un arreglo de valores, imprima cada uno de los valores
    //que fueron obtenidos mediante el arreglo que ha sido enviado en el main
    for(person in persons){
        println(person)
    }

    /*
     * //en el caso del while, se crea una variable, en este caso "index" que
    //inicia con un valor de cero. En el while se indica que mientras el
    //valor de index sea menor a "persons.size", imprima el arreglo "persons" con el
    //subíndice dado por "index",y al terminar aumente en una unidad
    //la variable "index"
    println("Iteración mediante while")
    var index:Int=0
    while(index < persons.size){
        println(persons[index])
        index++
    }*/

    //en "0..persons.size" indica un rango, en este caso, desde cero hasta el tamaño
    //que tenga el arreglo "persons", se indica "-1" por que el índice del arreglo
    //empieza a contar desde la posición cero hasta el tamaño del arreglo -1
    var index=0

    index = (0..persons.size-1).random()

    when (persons[index]){
        "Angel" -> println("Un buen amigo")
        //se encierraentre llaves el código que es más de una línea
        //o sea, un bloque de código.
        "Mary" -> println("solía ir conmigo e la escuela")

    }

}