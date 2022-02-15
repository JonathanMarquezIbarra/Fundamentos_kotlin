package com.example.fundamentos_kotlin.classes

fun main(){

    val phone:Phone = Phone(1472583690)

    phone.call()
    phone.showNumber()

    val smartphone = Smartphone(3456723,true)
    smartphone.call()
    smartphone.showNumber()

    //en "Group.FAMILY.ordinal" se hace referencia a la clase Group que es de tipo "enum"
    //y con ordinal se hace referencia al tipo entero
    val yo = User(123456789,"Efraín","Godinez", Group.FAMILY.ordinal)
    // con ".copy" se hace una copia exacta de la instancia "yo", y al mismo tiempo
    //en los paréntesis se le pueden asignar nuevos atributos
    val bro = yo.copy(1,"Espiridion")
    val friend = bro.copy(id=2, group = Group.FRIEND.ordinal)

    println(yo.component4())
    println(bro)
    //Funciones de alcance con with:
    with (smartphone){
        println("Privado? $isPrivate")
        call()
    }

    /*friend.group = Group.WORK.ordinal
    friend.name = "Juan"
    friend.lastName = "Tellez"*/
    //friend.apply es el equivalente que el código anterior, y es una propiedad
    //de una data class
    friend.apply {
        friend.group = Group.WORK.ordinal
        friend.name = "Juan"
        friend.lastName = "Tellez"
    }
    println(friend)

}