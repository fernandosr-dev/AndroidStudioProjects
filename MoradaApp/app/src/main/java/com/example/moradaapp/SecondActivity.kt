package com.example.moradaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moradaapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

            val i = intent
            val nome = i.extras?.getString("name")
            val email = i.extras?.getString("email")
            val genero = i.extras?.getString("genero")
            val morada = i.extras?.getString("morada")
            val telefone = i.extras?.getString("telefone")

            binding.mensagemTextView.text = "O $nome é do genero $genero e mora na $morada e tem o email $email e o telefone $telefone"


        }
    }