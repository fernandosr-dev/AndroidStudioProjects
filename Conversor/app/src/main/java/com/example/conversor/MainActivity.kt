package com.example.conversor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.conversor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val taxaConversao = 1.18

        binding.btnConverter.setOnClickListener {
            val valorEuros: Double? = binding.etValorEuros.text.toString().toDoubleOrNull()

            if (valorEuros != null) {
                val valorDolares = valorEuros * taxaConversao
                val valorFormatado = String.format("%.2f", valorDolares)
                binding.tvResultado.text = "$valorFormatado $"
            } else {
                binding.tvResultado.text = "Por favor, insira um valor válido em euros."

            }

            }



    }
}