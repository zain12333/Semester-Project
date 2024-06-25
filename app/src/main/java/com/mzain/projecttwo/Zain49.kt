package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mzain.projecttwo.fragments.BSVaddNoteFragment

class Zain49 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_zain49)
        val btn = findViewById<Button>(R.id.btnUmar49)
        val card = findViewById<CardView>(R.id.cardAddNotesUmar)

        btn.setOnClickListener {
            startActivity(Intent(this, DeliveryHistory::class.java))
        }
//        card.setOnClickListener {
//            BSVaddNoteFragment().show(supportFragmentManager, BSVaddNoteFragment().tag)
//
//        }
    }
}