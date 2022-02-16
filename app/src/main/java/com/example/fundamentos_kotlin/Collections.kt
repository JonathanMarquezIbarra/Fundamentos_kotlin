package com.example.fundamentos_kotlin

import com.example.fundamentos_kotlin.classes.Group
import com.example.fundamentos_kotlin.classes.User

fun main(){
    //Este tipo de listas son de "solo lectura", por lo que no pueden ser modificadas
    //en tiempo de ejecución.
    val frutaList = listOf<String>("Manzana","Banana","Uva","Lima")
    //con "((0..frutaList.size-1).random())" se genera un número aleatorio que va desde cero
    //hasta el tamaño de la lista -1
    println(frutaList.get((0..frutaList.size-1).random()))
    //mediante la propiedad "{frutaList.indexOf("Uva")}" devuelve el valor del número de índice
    //asociado al String, en este caso "Uva".
    println("El Index de uva es: ${frutaList.indexOf("Uva")}")

    val yo = User(123456789,"Efraín","Godinez", Group.FAMILY.ordinal)
    val bro = yo.copy(1,"Espiridion")
    val friend = bro.copy(id=2, group = Group.FRIEND.ordinal)
    //en este ejemplo se declara una mutableListOf con los objetos yo y bro
    //y posteriormente se agrega a la lista el objeto friend en tiempo de ejecución
    val usersList = mutableListOf<User>(yo,bro)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //removeAt sirve para remover mediante el uso del índice
    usersList.removeAt(1)
    println(usersList)
    //remove sirve para remover el elemento literalmente
    usersList.remove(bro)
    println(usersList)

    val usersSelectedList = mutableListOf<User>()
    println(usersSelectedList)
    //con usersSelectedList.addAll(usersList) se agrega todo el contenido de usersList
    //dentro del arreglo que originalmente estaba vacío
    //usersSelectedList.addAll(usersList)
    usersSelectedList.add(yo)
    println(usersSelectedList)
    //con set se indica el índice donde va la información, y en el segundo argumento el objeto
    usersSelectedList.set(0,bro)
    println(usersSelectedList)

    val usersMap = mutableMapOf<Int, User>()
    println(usersMap)
    //con .put se añade un elemento al mapa
    usersMap.put(yo.id.toInt(),yo)
    usersMap.put(yo.id.toInt(),yo)
    println(usersMap)
    usersMap.put(friend.id.toInt(),friend)
    println(usersMap)
    usersMap.remove(2)
    println(usersMap)
    println(usersMap.isEmpty())
    println(usersMap.containsKey(0))
    usersMap.put(bro.id.toInt(),bro)
    usersMap.put(friend.id.toInt(),friend)
    println(usersMap)
    println(usersMap.keys)
    println(usersMap.values)

}