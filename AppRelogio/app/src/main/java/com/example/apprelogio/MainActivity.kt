package com.example.apprelogio

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apprelogio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAvancar.setOnClickListener {
            startFullscreenActivity()
        }
    }

    private fun startFullscreenActivity() {
        val intent = Intent(this, FullscreenActivity::class.java)
        startActivity(intent)

        // Adicionar animação de transição, se desejado
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}

