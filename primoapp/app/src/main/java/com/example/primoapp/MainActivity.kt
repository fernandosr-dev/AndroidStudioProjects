package com.example.primoapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.primoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        // Código aqui:
        // Configurando o botão para calcular
        binding.buttonCalcular.setOnClickListener {
            val numero = binding.editNumber.text.toString().toIntOrNull()

            // Verifica se o número foi inserido corretamente
            if (numero != null) {
                // Verifica se é par ou ímpar
                val parOuImpar = if (numero % 2 == 0) "Par" else "Ímpar"
                binding.textViewParOuImpar.text = "O número é: $parOuImpar"

                // Verifica se é primo
                val primoOuNao = if (ehPrimo(numero)) "Primo" else "Não é primo"
                binding.textViewPrimo.text = "O número é: $primoOuNao"
            } else {
                // Exibe um Toast caso o número seja inválido
                Toast.makeText(this, "Por favor, insira um número válido", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Função para verificar se o número é primo
    private fun ehPrimo(numero: Int): Boolean {
        if (numero < 2) return false
        for (i in 2 until numero) {
            if (numero % i == 0) return false
        }
        return true
    }


}