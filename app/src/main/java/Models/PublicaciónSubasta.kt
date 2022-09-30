package Models

class PublicaciónSubasta {
    //Props
    var ID: Number = 0
    var precioInicial: Number = 0.0
    var horaInicio:Number = 0
    var horaFin: Number = 0

    // Constructs
    // Constructor Crear
    constructor(ID:Number, precioInicial: Number, horaInicio: Number, horaFin: Number, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String){
        this.ID=ID
        this.precioInicial=precioInicial
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Actualizar
    constructor(precioInicial: Number, horaInicio: Number, horaFin: Number, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String){
        this.precioInicial=precioInicial
        this.horaInicio=horaInicio
        this.horaFin=horaFin
    }
    // Constructor Eliminar
    constructor(ID:Number){
        this.ID=ID
    }

    // Métodos
    private fun establecerPrecio() {

    }
    private fun establecerhoraInicio() {

    }
    private fun establecerhoraFin() {

    }
}

