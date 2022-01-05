package com.example.listadecontatos.singleton

import com.example.listadecontatos.model.ContatosVO

object ContatoSingleton {
    var lista : MutableList<ContatosVO> = mutableListOf()
}