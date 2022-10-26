package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class NewPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_player)
        val telefonos = arrayOf("Scarface", "Titanic", "Pretty Woman", "Star Wars", "El rey León", "E.T")

        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, telefonos)

        val lista_telefonos = findViewById<Spinner>(R.id.spinner)
        lista_telefonos.adapter=adaptador
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val telefono = findViewById<EditText>(R.id.edText4)
        lista_telefonos.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        })
    }







}