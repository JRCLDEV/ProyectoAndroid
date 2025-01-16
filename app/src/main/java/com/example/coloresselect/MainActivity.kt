package com.example.coloresselect

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var colorCorrecto: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titulo = findViewById<TextView>(R.id.titulo)
        val botonVerde = findViewById<ImageButton>(R.id.boton_verde)
        val botonAmarillo = findViewById<ImageButton>(R.id.boton_amarillo)
        val botonRojo = findViewById<ImageButton>(R.id.boton_rojo)
        val botonAzul = findViewById<ImageButton>(R.id.boton_azul)

        // Lista de colores y selección aleatoria
        val colores = listOf("azul", "verde", "amarillo", "rojo")
        colorCorrecto = colores[Random.nextInt(colores.size)]

        // Actualizar el título con el color seleccionado
        titulo.text = "ELIGE EL COLOR ${colorCorrecto.uppercase()}"

        // Configurar los botones
        botonVerde.setOnClickListener { verificarColor("verde") }
        botonAmarillo.setOnClickListener { verificarColor("amarillo") }
        botonRojo.setOnClickListener { verificarColor("rojo") }
        botonAzul.setOnClickListener { verificarColor("azul") }
    }

    private fun verificarColor(colorSeleccionado: String) {
        val ganaste = colorSeleccionado == colorCorrecto
        mostrarResultado(ganaste)
    }

    private fun mostrarResultado(ganaste: Boolean) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("ganaste", ganaste)
        startActivity(intent)
    }
}

