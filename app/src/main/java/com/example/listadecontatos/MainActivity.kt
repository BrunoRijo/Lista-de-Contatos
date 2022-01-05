package com.example.listadecontatos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.listadecontatos.application.ContatoApplication
import com.example.listadecontatos.model.ContatosVO
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var btn_add : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add = findViewById(R.id.btn_add)

        btn_add.setOnClickListener(){
            startActivity(Intent(this, AdicionarContato::class.java))
        }

    }
}