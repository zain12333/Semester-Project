package com.mzain.projecttwo.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mzain.projecttwo.fragments.onboarding1
import com.mzain.projecttwo.fragments.onboarding2
import com.mzain.projecttwo.fragments.onboarding3

class onboardingadapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {

        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0)
            onboarding1()
        else if(position == 1)
           onboarding2()
        else
            onboarding3()
    }

}
