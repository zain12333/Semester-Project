package com.mzain.projecttwo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.mzain.projecttwo.adapters.FragmentPagesAdapter
import com.mzain.projecttwo.databinding.ActivityRecommendedOptionBinding

class recommendedOption : AppCompatActivity() {
    private lateinit var mBinding: ActivityRecommendedOptionBinding
    private lateinit var adapter: FragmentPagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        mBinding = ActivityRecommendedOptionBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        supportActionBar?.title = "Recommended Options"

        adapter = FragmentPagesAdapter(supportFragmentManager, lifecycle)

        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("nBalance"))
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("Mrf"))

        mBinding.viewPager.adapter = adapter

        mBinding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    mBinding.viewPager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        mBinding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                mBinding.tabLayout.selectTab(mBinding.tabLayout.getTabAt(position))
            }
        })

    }
}