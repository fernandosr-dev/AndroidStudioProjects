package com.example.temperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.temperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Inicializando o ViewBinding com by lazy
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        // Configurando o clique do botão para realizar a conversão
        binding.btnConverter.setOnClickListener {
            // Capturando o valor inserido no EditText
            val valorCelsius: Double? = binding.etCelsius.text.toString().toDoubleOrNull()
            // Verificando se o valor inserido é válido
            if (valorCelsius != null) {
                // Convertendo Celsius para Fahrenheit
                val valorFahrenheit: Double = (valorCelsius * 1.8) + 32

                // Exibindo o resultado na TextView
                binding.tvResultado.text = String.format("%.2f °F", valorFahrenheit)
            } else {
                // Exibindo uma mensagem de erro se o valor for inválido
                binding.tvResultado.text = "Por favor, insira um valor válido."
            }

        }

    }
}