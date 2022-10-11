package Models

class Categoria_publicacion {

    val idCategoriaPublicacion: Int;
    val nombreCategoria: String;

    constructor(
        idCategoriaPublicacion: Int,
        nombreCategoria: String
    ){
        this.idCategoriaPublicacion = idCategoriaPublicacion;
        this.nombreCategoria = nombreCategoria;
    }

    fun init(){

    }
}