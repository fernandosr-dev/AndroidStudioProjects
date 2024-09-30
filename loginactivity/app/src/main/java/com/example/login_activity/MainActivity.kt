package com.example.login_activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.login_activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Inicializando o ViewBinding com 'by lazy'
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        // Código aqui:
        // Configurando o botão de login
        binding.buttonLogin.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if (username == "user" && password == "pass") {
                // Login bem-sucedido, vai para LoginOKActivity
                val intent = Intent(this, LoginOKActivity::class.java)
                startActivity(intent)
            } else {
                // Login falhou, vai para LoginErradoActivity
                val intent = Intent(this, LoginErradoActivity::class.java)
                startActivity(intent)
            }


        }


    }
}