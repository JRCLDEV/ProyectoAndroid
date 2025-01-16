package com.example.coloresselect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val resultadoImagen = findViewById<ImageView>(R.id.resultado_imagen)
        val resultadoTexto = findViewById<TextView>(R.id.resultado_texto)
        val botonAtras = findViewById<Button>(R.id.boton_atras)

        val ganaste = intent.getBooleanExtra("ganaste", false)

        if (ganaste) {
            resultadoImagen.setImageResource(R.drawable.ganate)
            resultadoTexto.text = "¡GANASTE!"
        } else {
            resultadoImagen.setImageResource(R.drawable.perdiste)
            resultadoTexto.text = "PERDISTE. ¡Inténtalo de nuevo!"
        }

        // Configurar el botón "Atrás"
        botonAtras.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
