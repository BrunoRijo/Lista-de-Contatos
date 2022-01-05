package com.example.listadecontatos.helpers

import android.annotation.SuppressLint
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.database.getIntOrNull
import com.example.listadecontatos.model.ContatosVO
import com.example.listadecontatos.singleton.ContatoSingleton

class DB_Helper(
    context: Context?,
) : SQLiteOpenHelper(context, NAME_DB, null, DB_VERSION) {

    companion object {
        private val NAME_DB = "contato.db"
        private val DB_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //
    }

}