package com.example.intentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGreeting.setOnClickListener {
            // Guardamos el nombre del input text
            val name = binding.etName.text.toString()

            if (name.isNotEmpty()) {
                // Se crea un objeto de tipo Intent que recibe el contexto (this) y la clase donde va.
                val intent = Intent(this, ResultActivity::class.java)

                // Enviamos al ResultActivity el contenido del input text
                // Recibe 2 params: una clave y el valor que pasamos
                intent.putExtra("EXTRA_NAME", name)

                // Se lanza el intent
                startActivity(intent)
            }

        }
    }
}