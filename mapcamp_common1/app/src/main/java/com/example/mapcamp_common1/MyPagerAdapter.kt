package com.example.mapcamp_common1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val NUM_PAGES = 3

    override fun getItemCount(): Int = NUM_PAGES

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { MyFragment.newInstance("Page0", "")}
            1 -> { MyFragment.newInstance("Page1", "")}
            else -> { MyFragment.newInstance("Page2", "")}
        }
    }
}