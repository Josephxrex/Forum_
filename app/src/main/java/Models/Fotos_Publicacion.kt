package Models

class Fotos_Publicacion {

    val idFotoPublicacion: Int ;
    val idPublicacion: Int;
    val direccionFoto: String;

    constructor(
        idFotoPublicacion: Int,
        idPublicacion: Int,
        direccionFoto: String
    ){
        this.idFotoPublicacion = idFotoPublicacion;
        this.idPublicacion = idPublicacion;
        this.direccionFoto = direccionFoto;
    }

    fun init(){

    }

}