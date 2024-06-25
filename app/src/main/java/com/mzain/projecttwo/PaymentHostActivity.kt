package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mzain.projecttwo.databinding.ActivityPaymentHostBinding
import com.mzain.projecttwo.fragments.Payment2Fragment_34

class PaymentHostActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPaymentHostBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPaymentHostBinding.inflate(layoutInflater)
        setContentView(binding.root)



        MoveFragments.replaceFragmentOnPaymentHostActivity(supportFragmentManager, Payment2Fragment_34())
    }

    //
    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.findFragmentById(R.id.frameLayoutPaymentHostActivity)
        // Check if the current fragment is the one you want to replace
        if (currentFragment is Payment2Fragment_34) {
            // Replace with your custom fragment
            startActivity(Intent(this, home::class.java))
        } else {
            // Proceed with default back navigation
            super.onBackPressed()
        }

    }
}