package com.example.playjuegos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class preferences : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        val fabButton = findViewById<FloatingActionButton>(R.id.fab)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val rb = findViewById<RatingBar>(R.id.ratingBar)
        val sb = findViewById<SeekBar>(R.id.seekBar)

        rb.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                sb.progress = rating.toInt()
            }

        sb.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                rb.rating = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

        fabButton.setOnClickListener {
            val checked = radioGroup.checkedRadioButtonId
            val juegoSeleccionado = findViewById<RadioButton>(checked)
            if (checked != -1) {
                if (rb.rating.toInt() != 0)
                    Toast.makeText(
                        applicationContext,
                        "${juegoSeleccionado.text} Puntuacion ${rb.rating}",
                        Toast.LENGTH_LONG
                    ).show()
                else
                    Toast.makeText(applicationContext, "Puntua el juego", Toast.LENGTH_LONG).show()
            } else
                Toast.makeText(applicationContext, "Selecciona un Juego", Toast.LENGTH_LONG).show()


        }

    }
}