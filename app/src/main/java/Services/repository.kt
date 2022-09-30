package repositories

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns
import java.lang.Exception

class repository (context: Context) {
    private val openHelper:BdOpenHelper = BdOpenHelper(context)
    private val database: SQLiteDatabase

    init {
        database = openHelper.writableDatabase
    }

    fun getAll(table:String): Cursor {
        return database.rawQuery("select * from $table", null)
    }
    fun getById(table:String, columnName: String, itemId: Int) : Cursor {
        return database.rawQuery("select * from $table where $columnName = $itemId", null)
    }

    fun insert(table:String,values: ContentValues) {
        database.insert(table, null, values)
    }

    fun update(table:String,values: ContentValues,columnName: String, itemId: Int ) {
        val a = arrayOf("" + itemId)
        database.update(table, values, "$columnName=?", a)
    }

    fun delete(table:String,columnName: String, itemId: Int):Boolean
    {
        return try {
            val whereArgs = arrayOf(""+itemId)

            database.delete(table, "$columnName=?", whereArgs)
            true
        } catch (ex: Exception){
            false
        } finally {
            database.close()
        }
    }

    fun getByColumnName(table:String,  columnName: String, columnValue: String) : Cursor {
        val a = arrayOf("" + columnValue)
        return database.rawQuery("select * from $table where $columnName = $columnValue", null)
    }




}