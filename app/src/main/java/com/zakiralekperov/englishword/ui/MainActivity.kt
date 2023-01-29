package com.zakiralekperov.englishword.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.englishword.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener{
            startEducationActivity()
        }
    }

    private fun startEducationActivity(){
        val intent = Intent(this, EducationActivity::class.java)
        startActivity(intent)
    }
}