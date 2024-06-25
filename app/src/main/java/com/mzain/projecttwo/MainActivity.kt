package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.mzain.projecttwo.adapters.onboardingadapter
import com.mzain.projecttwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: onboardingadapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnCreateAccount.setOnClickListener {
           var  intent= Intent(this, AppEntry::class.java)
            startActivity(intent)
        }



        binding.btnGuestlogin.setOnClickListener {
            var  intent= Intent(this, AppEntry::class.java)
            startActivity(intent)
        }
        viewPager2=findViewById(R.id.viewpager2)

        adapter= onboardingadapter(supportFragmentManager,lifecycle)
        viewPager2.adapter=adapter

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

            }
        })

    }
}