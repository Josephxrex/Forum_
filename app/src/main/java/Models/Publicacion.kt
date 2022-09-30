package Models

class Publicacion {

    val idPublicacion : Int;
    var nombre:String;
    var descripcion:String;
    var precio:Double;
    var fotos:List<String>;
    var fecha:String;
    var categoria:String;
    var tipo:String;

    constructor(
        nombre: String,
        descripcion: String,
        precio: Double,
        fotos: List<String>,
        fecha: String,
        categoria: String,
        tipo: String,
        idPublicacion: Int
    ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fotos = fotos;
        this.fecha = fecha;
        this.categoria = categoria;
        this.tipo = tipo;
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