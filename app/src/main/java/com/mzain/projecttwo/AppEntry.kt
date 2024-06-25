package com.mzain.projecttwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.mzain.projecttwo.adapters.fragmentadapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class AppEntry : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var adapter: fragmentadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_entry)

        tabLayout=findViewById(R.id.tablayout)
        viewPager2=findViewById(R.id.viewpager2)

        adapter= fragmentadapter(supportFragmentManager,lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("Sign Up"))
        tabLayout.addTab(tabLayout.newTab().setText("Sign In"))

        viewPager2.adapter=adapter
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager2.currentItem = tab.position
                }
            }

            override fun onTabUnselected(p0: TabLayout.Tab?) {

            }

            override fun onTabReselected(p0: TabLayout.Tab?) {

            }

        })

viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        tabLayout.selectTab(tabLayout.getTabAt(position))
    }
})
    }
}