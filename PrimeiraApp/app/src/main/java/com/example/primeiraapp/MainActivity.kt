package com.example.primeiraapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.primeiraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        // Configurando o botão para realizar a saudação
        binding.buttonOla.setOnClickListener {
            // Capturando o primeiro nome e o sobrenome inseridos
            val primeiroNome: String = binding.editNome.text.toString().trim()
            val ultimoNome: String = binding.editSobrenome.text.toString().trim()

            // Verificando se ambos os campos foram preenchidos
            if (primeiroNome.isNotEmpty() && ultimoNome.isNotEmpty()) {
                // Exibindo a saudação se ambos os nomes foram inseridos
                binding.textResultado.text = "Olá, $primeiroNome $ultimoNome"
            } else {
                // Exibindo a mensagem de erro se algum nome não foi inserido
                binding.textResultado.text = "Por favor, insira ambos os nomes."
            }


        }

    }
}