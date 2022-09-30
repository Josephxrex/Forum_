package Models

import java.util.*

class PublicacionSubasta: Publicacion {
    //Props
    var precioInicial: Number = 0.0
    var horaInicio:Number = 0
    var horaFin: Number = 0


    // Constructs
    // Constructor Crear
    constructor(idPublicacion: Int, nombre: String, descripcion:String, precio:Double,fotos: List<String>,fecha: String, categoria: String, tipo:String,precioInicial: Number, horaInicio: Number, horaFin: Number)
    :super(idPublicacion,nombre,descripcion,precio, fotos, fecha, categoria, tipo){
        this.precioInicial=precioInicial
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Actualizar
    constructor(nombre: String, descripcion:String, precio:Double,fotos: List<String>,fecha: String, categoria: String, tipo:String,precioInicial: Number, horaInicio: Number, horaFin: Number)
            :super(nombre,descripcion,precio, fotos, fecha, categoria, tipo){
        this.precioInicial=precioInicial
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Eliminar
    constructor(idPublicacion: Int) :super(idPublicacion){
    }

    // Métodos
    private fun establecerPrecio() {

    }
    private fun establecerhoraInicio() {

    }
    private fun establecerhoraFin() {

    }
}

