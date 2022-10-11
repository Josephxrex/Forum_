package Models

class Fotos_Publicacion {

    val idFotoPublicacion: Int ;
    val url: String;
    val nombre_foto: String;
    val idPublicacion: Int;

    constructor(
        idFotoPublicacion: Int,
        url: String,
        nombre_foto:String,
        idPublicacion: Int,
    ){
        this.idFotoPublicacion = idFotoPublicacion;
        this.url = url;
        this.nombre_foto = nombre_foto;
        this.idPublicacion = idPublicacion;

    }

    fun init(){

    }

}