package com.mzain.projecttwo

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.mzain.projecttwo.databinding.ActivityNavigationDrawerBinding

class NavigationDrawer : AppCompatActivity() {
    private lateinit var binding: ActivityNavigationDrawerBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_navigation_drawer)
        binding = ActivityNavigationDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupviews()
    }
    fun setupviews() {
        setUpDrawerLayout()
    }
    fun setUpDrawerLayout(){
        setSupportActionBar(binding.appbar)
        actionBarDrawerToggle= ActionBarDrawerToggle(this,binding.maindrawer,R.string.app_name,R.string.app_name)
        actionBarDrawerToggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
    }
