package com.example.moradaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moradaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.enviarButton.setOnClickListener {
            val name = binding.nomeEditText.text.toString()
            val email = binding.emailEditText.text.toString()
            val genero = binding.generoEditText.text.toString()
            val morada = binding.moradaEditText.text.toString()
            val telefone = binding.telefoneEditText.text.toString()

                val i = Intent(this, SecondActivity::class.java)

                i.putExtra("name", name)
                i.putExtra("email", email)
                i.putExtra("genero", genero)
                i.putExtra("morada", morada)
                i.putExtra("telefone", telefone)


                startActivity(i)
            }
        }
}
