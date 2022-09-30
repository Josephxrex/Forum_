package Models

open class Usuario{
    //Props
    private var ID:Number = 0
    private var Nombre: String = ""
    private var Apellidos: String = ""
    private var Usuario: String = ""
    private var CP: String = ""
    private var Telefono: String = ""
    private var Correo: String = ""
    private var Contrasenia: String = ""
    private var FotoDePerfil: String = ""

    // Constructs
    // Constructor Crear
    constructor(ID:Number, Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String){
        this.ID=ID
        this.Nombre=Nombre
        this.Apellidos=Apellidos
        this.Usuario=Usuario
        this.CP=CP
        this.Telefono=Telefono
        this.Correo=Correo
        this.Contrasenia=Contrasenia
        this.FotoDePerfil=FotoDePerfil
    }
    // Constructor Actualizar
    constructor(Nombre: String, Apellidos: String, Usuario: String, CP: String, Telefono: String, Correo: String, Contrasenia: String, FotoDePerfil: String){
        this.Nombre=Nombre
        this.Apellidos=Apellidos
        this.Usuario=Usuario
        this.CP=CP
        this.Telefono=Telefono
        this.Correo=Correo
        this.Contrasenia=Contrasenia
        this.FotoDePerfil=FotoDePerfil
    }
    // Constructor Eliminar
    constructor(ID:Number){
        this.ID=ID
    }
}

// Métodos