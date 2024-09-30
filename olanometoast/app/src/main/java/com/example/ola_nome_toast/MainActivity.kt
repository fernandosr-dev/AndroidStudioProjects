package com.example.ola_nome_toast

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ola_nome_toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Inicializando o ViewBinding com 'by lazy'
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // Código aqui:
        // Configurando o botão para exibir o Toast
        binding.buttonOla.setOnClickListener {
            // Capturando o primeiro nome e o sobrenome
            val primeiroNome: String = binding.textNome.text.toString().trim()
            val ultimoNome: String = binding.textSobrenome.text.toString().trim()

            // Verificando se ambos os campos foram preenchidos
            if (primeiroNome.isNotEmpty() && ultimoNome.isNotEmpty()) {
                // Exibindo o Toast com a saudação
                Toast.makeText(
                    applicationContext,
                    "Olá, $primeiroNome $ultimoNome",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                // Exibindo um Toast de erro caso algum nome não tenha sido inserido
                Toast.makeText(
                    applicationContext,
                    "Por favor, insira seu nome e sobrenome",
                    Toast.LENGTH_SHORT

                ).show()
            }
        }

    }
}