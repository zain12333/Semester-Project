package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mzain.projecttwo.databinding.ActivitySearchBatBinding

class SearchBat : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySearchBatBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.bats.setOnClickListener {
            val intent = Intent(this, SearchBat2::class.java)
            startActivity(intent)
        }

    }
}