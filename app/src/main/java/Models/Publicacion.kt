package Models

import java.util.*

open class Publicacion {

    private var idPublicacion : Int = 0;
    private var nombre:String = "";
    private var descripcion:String = "";
    private var precio:Double = 0.0;
    private var fotos:List<String> = Arrays.asList("");
    private var fecha:String = "";
    private var categoria:String = "";
    private var tipo:String = "";

    // constructor crear
    constructor(
        idPublicacion: Int,
        nombre: String,
        descripcion: String,
        precio: Double,
        fotos: List<String>,
        fecha: String,
        categoria: String,
        tipo: String,
    ){
        this.idPublicacion = idPublicacion
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotos = fotos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.tipo = tipo;

    }

    // constructor actualizar
    constructor(
        nombre: String,
        descripcion: String,
        precio: Double,
        fotos: List<String>,
        fecha: String,
        categoria: String,
        tipo: String,
    ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotos = fotos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.tipo = tipo;
    }
// Constructor eliminar
    constructor(
        idPublicacion: Int
    ){
        this.idPublicacion = idPublicacion
    }

    fun init(){

    }

    fun crearPublicacion(nombre:String,
                         descripcion:String,
                         precio:Double,
                         fotos:List<String>,
                         fecha:String,
                         categoria:String,
                         tipo:String
    ){

    }

    fun editarPublicacion(idPublicacion:Int){

    }

    fun eliminarPublicacion(idPublicacion:Int){

    }


}