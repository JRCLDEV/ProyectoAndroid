package com.example.coloresselect

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonVerde = findViewById<ImageButton>(R.id.boton_verde)
        val botonAmarillo = findViewById<ImageButton>(R.id.boton_amarillo)
        val botonRojo = findViewById<ImageButton>(R.id.boton_rojo)
        val botonAzul = findViewById<ImageButton>(R.id.boton_azul)

        botonVerde.setOnClickListener { mostrarResultado(false) }
        botonAmarillo.setOnClickListener { mostrarResultado(false) }
        botonRojo.setOnClickListener { mostrarResultado(false) }
        botonAzul.setOnClickListener { mostrarResultado(true) }
    }

    private fun mostrarResultado(ganaste: Boolean) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("ganaste", ganaste)
        startActivity(intent)
    }
}
