package Models

import Models.Usuario
import java.net.IDN

class Cliente : Usuario{
    //Propiedades Clase Cliente
    var idCliente:Number = 0
    var Genero: String = ""
    var FechaNac: String = ""
    var apellidos: String = ""

    //Constructores
    // Constructor Eliminar
    constructor(Id:Number): super(Id) {
        this.idCliente=Id
    }
    // Constructor Actualizar
    constructor(Nombre: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String,genero:String, fechanac:String, apellido: String)
            :super(Nombre, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.Genero=genero
        this.FechaNac=fechanac
        this.apellidos=apellido
    }
    // Constructor Crear
    constructor(ID:Number,Nombre: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String, genero:String, fechanac:String, apellido: String)
            :super(ID,Nombre, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.idCliente=ID
        this.Genero=genero
        this.FechaNac=fechanac
        this.apellidos=apellido
    }

    // Métodos
}