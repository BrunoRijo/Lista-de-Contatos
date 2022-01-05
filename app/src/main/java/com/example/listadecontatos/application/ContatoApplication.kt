package com.example.listadecontatos.application

import android.app.Application
import com.example.listadecontatos.helpers.DB_Helper

class ContatoApplication: Application() {

    lateinit var helperDB: DB_Helper
        private set

    companion object{
        lateinit var instance: ContatoApplication
    }

    override fun onCreate() {
        super.onCreate()
        instance =  this
        helperDB = DB_Helper(this)
    }
}