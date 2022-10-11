package com.amcr.appforum

import Models.Usuario

open class Tienda : Usuario {
    //Propiedades clase Tienda
    var idTienda: Number = 0
    var Categoria: String = ""
    lateinit var Etiquetas:List<String>
    var Seguidores: Number = 0
    var Puntuacion: Double = 0.0
    var Envios: Boolean = false

    //Constructores
    // Constructor Eliminar
    constructor(Id:Number): super(Id) {
        this.idTienda=Id
    }

    // Constructor Actualizar
    constructor(Nombre: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String,categoria: String, etiquetas:List<String>, seguidores: Number, puntuacion: Double, envios: Boolean)
            :super(Nombre, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.Categoria=categoria
        this.Etiquetas=etiquetas
        this.Seguidores=seguidores
        this.Puntuacion=puntuacion
        this.Envios=envios
    }

    // Constructor Crear
    constructor(ID:Number,Nombre: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String, categoria: String, etiquetas:List<String>, seguidores: Number, puntuacion: Double, envios: Boolean)
            :super(ID,Nombre, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.idTienda=ID
        this.Categoria=categoria
        this.Etiquetas=etiquetas
        this.Seguidores=seguidores
        this.Puntuacion=puntuacion
        this.Envios=envios
    }
}