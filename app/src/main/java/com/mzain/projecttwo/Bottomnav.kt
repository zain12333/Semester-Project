package com.mzain.projecttwo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.mzain.projecttwo.databinding.ActivityBottomnavBinding
import com.mzain.projecttwo.fragments.Categoryfragment
import com.mzain.projecttwo.fragments.Payment2Fragment_34
import com.mzain.projecttwo.fragments.Profilefragment
import com.mzain.projecttwo.fragments.SearchFragment
import com.mzain.projecttwo.fragments.chartfragment
import com.mzain.projecttwo.fragments.homefragment

class Bottomnav : AppCompatActivity() {
    lateinit var binding: ActivityBottomnavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityBottomnavBinding =  ActivityBottomnavBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Fragents
        val homefragment=homefragment();
        val Categoryfragment= Categoryfragment();
        val chartfragment= chartfragment();
        val Searchfragment= SearchFragment();
        val Profilefragment= Profilefragment();

        setCurrentFragment(homefragment);

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(homefragment)
                R.id.Category->setCurrentFragment(Categoryfragment)
                R.id.Search->setCurrentFragment(Searchfragment)
                R.id.chart->setCurrentFragment(chartfragment)
                R.id.Profile->setCurrentFragment(Profilefragment)

            }
            true
        }
    }
    override fun onBackPressed() {

        // Check if the current fragment is the one you want to replace
        // Replace with your custom fragment
        startActivity(Intent(this, Payment2Fragment_34::class.java))
        super.onBackPressed()
    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    }
