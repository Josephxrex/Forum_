package Models

class Publicacion {

    val idPublicacion : Int;
    var nombre:String;
    var descripcion:String;
    var fecha:String;
    var idCategoria:Int;
    var idTipo:Int;

    constructor(
        idPublicacion: Int,
        nombre: String,
        descripcion: String,
        fecha: String,
        idCategoria: Int,
        idTipo: Int,

    ){
        this.idPublicacion = idPublicacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.idCategoria = idCategoria;
        this.idTipo = idTipo;

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