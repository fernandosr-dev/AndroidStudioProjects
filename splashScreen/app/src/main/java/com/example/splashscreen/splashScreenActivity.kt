package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)
        // Código aqui:

            // Definindo um delay para a Splash Screen (ex: 3 segundos)
            Handler(Looper.getMainLooper()).postDelayed({
                // Após 3 segundos, redireciona para a MainActivity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Finaliza a SplashScreenActivity para que não retorne a ela
            }, 3000) // Tempo em milissegundos (3000 ms = 3 segundos)
        }
    }
}