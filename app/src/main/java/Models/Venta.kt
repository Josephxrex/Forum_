package Models

class Venta {
    var ID :Int? = null
    var nombreTienda:String = ""
    var nombreCliente:String =""
    var fecha:String =""
    var subtotal :Double = 0.0
    var total:Double=0.0

    //Constructor venta crear
    constructor(
        nombreTienda: String,
        nombreCliente: String,
        fecha: String,
        subtotal: Double,
        total: Double
    ) {

        this.nombreTienda = nombreTienda
        this.nombreCliente = nombreCliente
        this.fecha = fecha
        this.subtotal = subtotal
        this.total = total
    }
    //Actualizar
    constructor(
        ID: Int,
        nombreTienda: String,
        nombreCliente: String,
        fecha: String,
        subtotal: Double,
        total: Double
    ) {
        this.ID = ID
        this.nombreTienda = nombreTienda
        this.nombreCliente = nombreCliente
        this.fecha = fecha
        this.subtotal = subtotal
        this.total = total
    }

    //Eliminar
    constructor(ID: Int) {
        this.ID = ID
    }
    //Construtor vacio
    constructor()

}