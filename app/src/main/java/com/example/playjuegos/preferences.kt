package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.get
import com.google.android.material.floatingactionbutton.FloatingActionButton

class preferences : AppCompatActivity() {
    var rb=findViewById<RadioGroup>(R.id.radioGroup)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        val fabButton = findViewById(R.id.fab0) as FloatingActionButton
        fabButton.setOnClickListener {
            Toast.makeText(applicationContext, "No has pulsado ninguna opcion", Toast.LENGTH_LONG)
                .show()
        }
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        radioGroup.setOnClickListener {
//            juegoSelecionado = radioGroup.
        }
    }
}