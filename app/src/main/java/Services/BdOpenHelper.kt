package repositories

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

val DATABASE_NAME = "jaco.db"
val DATABASE_VERSION = 1

class BdOpenHelper(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(CREATE_EVENTOS_SCRIPT)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        val STRING_TYPE = "text"
        val INT_TYPE = "integer"
        val DOUBLE_TYPE = "double"

        val CREATE_EVENTOS_SCRIPT = (
                "create table cliente (" +
                        " id_cliente " + INT_TYPE + " primary key autoincrement," +
                        " nombre_cliente " + STRING_TYPE + " not null," +
                        " usuario_cliente" + STRING_TYPE + " not null)" +
                        " cp_cliente " + STRING_TYPE + " not null," +
                        " telefono_cliente" + STRING_TYPE + " not null)" +
                        " correo_cliente " + STRING_TYPE + " not null," +
                        " contrasenia_cliente" + STRING_TYPE + " not null)" +
                        " foto_cliente " + STRING_TYPE + " not null," +
                        " genero_cliente" + STRING_TYPE + " not null)" +
                        " fechanac_cliente " + STRING_TYPE + " not null," +
                        " apellido_cliente" + STRING_TYPE + " not null)" +
                        " apellido_cliente" + STRING_TYPE + " not null)"  +

                        "create table venta ("+
                        " id_venta " + INT_TYPE + " primary key autoincrement," +
                        " nombre_Tienda " + STRING_TYPE + " not null," +
                        " nombre_cliente" + STRING_TYPE + " not null)" +
                        " fecha" + STRING_TYPE + " not null)" +
                        " subtotal"+ DOUBLE_TYPE + " not null)" +
                        " total"+ DOUBLE_TYPE + " not null)" +

                        "create table c_tienda (" +
                        " idTienda " + INT_TYPE + " primary key autoincrement," +
                        " nombre_tienda " + STRING_TYPE + " not null," +
                        " usuario_tienda" + STRING_TYPE + " not null,"  +
                        " cp_tienda " + INT_TYPE + " not null,"  +
                        " telefono_tienda " + STRING_TYPE + " not null,"  +
                        " correo_tienda " + STRING_TYPE + " not null,"  +
                        " contrasenia_tienda " + STRING_TYPE + " not null,"  +
                        " fotoPerfil_tienda " + STRING_TYPE + " not null,"  +
                        " idcategoria_tienda " + INT_TYPE + " not null,"  +
                        " seguidores_tienda " + INT_TYPE + " not null,"  +
                        " puntuacion_tienda " + DOUBLE_TYPE + " not null,"  +
                        " envios_tienda" + "boolean" + " not null)" +


                        "create table categoria_tienda (" +
                        " idCategoria " + INT_TYPE + " primary key autoincrement," +
                        " categoria" + STRING_TYPE + " not null)"
                )

    }
}