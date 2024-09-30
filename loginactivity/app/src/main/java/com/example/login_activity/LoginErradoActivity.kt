package com.example.login_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginErradoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_errado)
        // Código aqui:
        // Exibindo o Toast com a mensagem de login incorreto
        Toast.makeText(this, "Login incorreto", Toast.LENGTH_SHORT).show()

        // Configurando o botão para voltar à MainActivity
        val btnVoltar = findViewById<Button>(R.id.btn_voltar)
        btnVoltar.setOnClickListener {
            // Volta para a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finaliza a LoginErradoActivity
        }

    }
}