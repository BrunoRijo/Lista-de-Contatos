package com.example.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.listadecontatos.application.ContatoApplication
import com.example.listadecontatos.model.ContatosVO
import com.example.listadecontatos.singleton.ContatoSingleton

class AdicionarContato : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_contato)

    }
}