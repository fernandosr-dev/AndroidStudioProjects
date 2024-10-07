package com.example.listviewex1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.listviewex1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    // ou para apenas declarar a variavel binding: private lateinit var binding: ActivityMainBinding
    // depois incializar:
    // Inicializar o binding
    /*binding = ActivityMainBinding.inflate(layoutInflater)
    val view = binding.root
    setContentView(view)*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inicializar o binding
        setContentView(binding.root)

        //Criar uma lista de nome
        val nomes = arrayListOf<String>("Ana", "Bruno", "Carlos", "Diana", "Eduardo")

        // Obter referência para o ListView
        val listView: ListView = findViewById(R.id.listView)

        // Criar um ArrayAdapter para converter a lista em itens do ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nomes)
        binding.listView.adapter = adapter

        // Definir um clique nos itens da lista
        listView.setOnItemClickListener { _, _, position, _ ->
            val nome = nomes[position]
            Toast.makeText(this, "Olá, $nome", Toast.LENGTH_SHORT).show()
        }
    }
}