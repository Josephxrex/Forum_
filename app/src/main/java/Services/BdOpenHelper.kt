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
        val DATE_TYPE = "date"
        val DOUBLE_TYPE ="double"

        val CREATE_EVENTOS_SCRIPT = (
                "create table c_ventas (" +
                "id_Ventas " + INT_TYPE + " primary key autoincrement," +
                "nombre_Tienda " + STRING_TYPE + " not null," +
                "nombre_Cliente" + STRING_TYPE + " not null," +
                "fecha"+ DATE_TYPE + "not null," +
                 "subtotal" + DOUBLE_TYPE + "not null," +
                 "total" + DOUBLE_TYPE + "not null)"
                )
    }
}