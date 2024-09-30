package com.example.toast

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Inicializando o binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurando o ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botão para mostrar o Toast
        binding.buttonToast.setOnClickListener {
            Toast.makeText(applicationContext, "Botão clicado", Toast.LENGTH_SHORT).show()
        }
        // Botão para abrir a nova Activity
        binding.buttonNewActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}