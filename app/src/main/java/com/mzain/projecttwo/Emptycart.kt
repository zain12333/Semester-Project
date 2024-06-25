package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mzain.projecttwo.databinding.ActivityEmptycartBinding

class Emptycart : AppCompatActivity() {
    private lateinit var binding: ActivityEmptycartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEmptycartBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.yourFavourite.setOnClickListener {
            val intent = Intent(this, YourCart::class.java)
            startActivity(intent)
        }

    }
}