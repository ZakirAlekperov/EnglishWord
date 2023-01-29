package com.zakiralekperov.englishword.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.englishword.databinding.ActivityEducationBinding

class EducationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEducationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btcMain.setOnClickListener{
            startMainActivity()
        }
    }

    private fun startMainActivity(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}