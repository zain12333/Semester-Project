package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class Otp : AppCompatActivity() {
    private lateinit var btnsub: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_otp)

        btnsub = findViewById(R.id.btn_sub)

        btnsub.setOnClickListener {


            val dialog = BottomSheetDialog(this)


            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog_from_fragment, null)


            val btn_homepage = view.findViewById<Button>(R.id.btn_hompage)


            btn_homepage.setOnClickListener {
                // Start the new activity
                startActivity(Intent(this, Bottomnav::class.java))

                // Dismiss the bottom sheet dialog if needed
                dialog.dismiss()
            }

            dialog.setContentView(view)

            dialog.setCancelable(true)

            dialog.show()

        }


    }
    }
