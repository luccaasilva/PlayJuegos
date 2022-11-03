package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class generos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generos)

        val recView = findViewById<RecyclerView>(R.id.recyclerView)
        val adaptador = GenerosAdapter(llenarLista())
        recView.adapter = adaptador
        recView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
    fun llenarLista(): ArrayList<Genero> {
        val lista = ArrayList<Genero>()
        lista.add(Genero(R.string.note1))
        lista.add(Genero(R.string.note2))
        lista.add(Genero(R.string.note3))
        lista.add(Genero(R.string.note4))
        lista.add(Genero(R.string.note5))
        lista.add(Genero(R.string.note6))
        lista.add(Genero(R.string.note7))
        lista.add(Genero(R.string.note8))
        lista.add(Genero(R.string.note9))
        lista.add(Genero(R.string.note10))
        lista.add(Genero(R.string.note11))
        lista.add(Genero(R.string.note12))
        return lista
    }
}