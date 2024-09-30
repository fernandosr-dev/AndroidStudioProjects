package com.example.moradaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moradaapp.databinding.ActivityMainBinding
import com.example.moradaapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

            val i = intent
            val name = i.extras?.getString("name")
            val email = i.extras?.getString("email")
            val genero = i.extras?.getString("genero")
            val morada = i.extras?.getString("morada")
            val telefone = i.extras?.getString("telefone")
            //val i = Intent(this, SecondActivity::class.java)

            binding.textNome.text = "O $name $email $genero $morada $telefone"


            startActivity(i)
        }
    }