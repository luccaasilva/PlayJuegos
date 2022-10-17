package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.get
import com.google.android.material.floatingactionbutton.FloatingActionButton

class preferences : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        val fabButton = findViewById(R.id.fab0) as FloatingActionButton
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var checked = radioGroup.checkedRadioButtonId
        var juegoSeleccionado = findViewById<RadioButton>(checked)
        fabButton.setOnClickListener {
            if (juegoSeleccionado.id == -1)
                Toast.makeText(
                    applicationContext,
                    "Selecciona un Juego",
                    Toast.LENGTH_LONG
                ).show()
            else if()
                Toast.makeText(applicationContext, "${juegoSeleccionado.text}", Toast.LENGTH_LONG)
                    .show()
        }

    }
}