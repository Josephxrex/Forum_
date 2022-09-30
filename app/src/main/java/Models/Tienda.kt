package com.amcr.appforum

import Models.Usuario

class Tienda : Usuario {

    //Propiedades clase Tienda
    var idTienda:Number = 0
    var Categoria: String = ""
    var Etiquetas = arrayOf<String>()
    var Seguidores: Int = 0
    var Puntuacion: Double = 0.0
    var Envios: Boolean = false

    //Constructores
    // Constructor Eliminar
    constructor(ID:Number) :super(ID){
    }

    // Constructor Actualizar
    constructor(Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String,categoria:String, etiquetas:Array<String>, seguidores:Int, puntuacion:Double, envios:Boolean)
            :super(Nombre, Apellidos, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.Categoria=categoria
        this.Etiquetas=etiquetas
        this.Seguidores=seguidores
        this.Puntuacion=puntuacion
        this.Envios=envios
    }

    // Constructor Crear
    constructor(ID:Number,Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String, idTienda:Number,categoria:String, etiquetas:Array<String>, seguidores:Int, puntuacion:Double, envios:Boolean)
            :super(ID,Nombre, Apellidos, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.idTienda=ID
        this.Categoria=categoria
        this.Etiquetas=etiquetas
        this.Seguidores=seguidores
        this.Puntuacion=puntuacion
        this.Envios=envios
    }
}