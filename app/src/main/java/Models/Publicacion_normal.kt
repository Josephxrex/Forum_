package Models

class Publicacion_normal {

    val idPublicacion_normal: Int;
    val precio: Double;
    val idPublicacion: Int;

    constructor(
        idPublicacion_normal: Int,
        precio: Double,
        idPublicacion: Int
    ){
        this.idPublicacion_normal = idPublicacion_normal;
        this.precio = precio;
        this.idPublicacion = idPublicacion;
    }

    fun init(){

    }



}