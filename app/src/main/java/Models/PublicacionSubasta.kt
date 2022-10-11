package Models

import java.util.*

class PublicacionSubasta: Publicacion {
    //Props
    var idSubasta: Int = 1
    var precioInicial: Number = 0.0
    var precioFinal: Number = 0.0
    var horaInicio:Number = 0
    var horaFin: Number = 0

    // Constructor
    // Constructor Crear
    constructor(idPublicacion: Int, nombre: String, descripcion:String, precio:Double,fotos: List<String>,fecha: String, categoria: String, tipo:String,idSubasta: Int,precioInicial: Number, precioFinal: Number,horaInicio: Number, horaFin: Number)
    :super(idPublicacion,nombre,descripcion,precio, fotos, fecha, categoria, tipo){
        this.idSubasta=idSubasta
        this.precioInicial=precioInicial
        this.precioFinal=precioFinal
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Actualizar
    constructor(nombre: String, descripcion:String, precio:Double,fotos: List<String>,fecha: String, categoria: String, tipo:String,precioInicial: Number, precioFinal: Number, horaInicio: Number, horaFin: Number)
            :super(nombre,descripcion,precio, fotos, fecha, categoria, tipo){
        this.precioInicial=precioInicial
        this.precioFinal=precioFinal
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Eliminar
    constructor(idPublicacion: Int, idSubasta: Int) :super(idPublicacion){
        this.idSubasta=idSubasta
    }

    // Métodos
    private fun establecerPrecio() {

    }
    private fun establecerhoraInicio() {

    }
    private fun establecerhoraFin() {

    }
}

