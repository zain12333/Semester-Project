package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.mzain.projecttwo.databinding.ActivityPaymentMethodBinding

class PaymentMethod : AppCompatActivity() {
    private lateinit var binding: ActivityPaymentMethodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Initialize view binding
        binding = ActivityPaymentMethodBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Set up the click listener for btnorder2
//        binding.btnorder2.setOnClickListener {
//            val intent = Intent(this, Zain49::class.java) // Replace NextActivity with your actual next activity class
//            startActivity(intent)
//        }
    }
}
