package com.example.playjuegos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import java.util.prefs.Preferences

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_juegos)

        val jugador = findViewById(R.id.bt2) as Button
        jugador.setOnClickListener { lanzarNewPlayer() }

        val preferences = findViewById<Button>(R.id.bt3)
        preferences.setOnClickListener { lanzarPreferences() }




    }

    private fun lanzarNewPlayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }


    private fun lanzarPreferences() {
        val i = Intent(this, preferences::class.java)
        startActivity(i)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.search) {
            startActivity(Intent(this, generos::class.java))
        }
        return super.onOptionsItemSelected(item)
    }



}