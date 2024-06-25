package com.mzain.projecttwo

import android.content.DialogInterface
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.mzain.projecttwo.databinding.ActivityCircularImageBinding

class CircularImage : AppCompatActivity() {
    private lateinit var binding: ActivityCircularImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circular_image)

       binding=ActivityCircularImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name="Mr Uzair"
        binding.btn.setOnClickListener {
            val dialog=AlertDialog.Builder(this)
            dialog.setTitle("Delete the Picture")
            dialog.setMessage(R.string.alert_desc)
            //above is a better way
            //or dialog.setMessage("are you sure?")
            dialog.setIcon(R.drawable.delete_icon)
            dialog.setPositiveButton("Yes"){dialogInterface,which ->
                Toast.makeText(this,"Successfully deleted by $name",Toast.LENGTH_LONG).show()

            }
            dialog.setNegativeButton("No"){dialogInterface,which ->
                Toast.makeText(this,"Unsuccessful ",Toast.LENGTH_LONG).show()

            }
            dialog.setNeutralButton("Cancel"){dialogInterface,which ->
                Toast.makeText(this,"Cancelled",Toast.LENGTH_LONG).show()

            }
            val alertDialog:AlertDialog =dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

            val negativeButton = alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE)
            negativeButton.setTextColor(Color.GREEN)

            val positiveButton = alertDialog.getButton(DialogInterface.BUTTON_POSITIVE)
            positiveButton.setTextColor(Color.RED)
            val neutralButton = alertDialog.getButton(DialogInterface.BUTTON_NEUTRAL)
            neutralButton.setTextColor(Color.BLUE)
        }
    }
}