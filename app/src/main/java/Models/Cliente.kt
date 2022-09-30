package Models

import Models.Usuario
import java.net.IDN

class Cliente : Usuario{
    //Propiedades Clase Cliente
    var idCliente:Number = 0
    var Genero: String = ""
    var FechaNac: String = ""

    //Constructores
    // Constructor Eliminar
    constructor(ID:Number) :super(ID){
    }
    // Constructor Actualizar
    constructor(Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String,genero:String, fechanac:String)
            :super(Nombre, Apellidos, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.Genero=genero
        this.FechaNac=fechanac
    }
    // Constructor Crear
    constructor(ID:Number,Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String, idcliente:Number, genero:String, fechanac:String)
            :super(ID,Nombre, Apellidos, Usuario, CP, Telefono, Correo, Contrasenia, FotoDePerfil){
        this.idCliente=ID
        this.Genero=genero
        this.FechaNac=fechanac
    }

    // Métodos
}