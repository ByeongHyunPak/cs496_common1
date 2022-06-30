package com.example.mapcamp_common1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mapcamp_common1.fragments.ContactFragment
import com.example.mapcamp_common1.fragments.GalleryFragment
import com.example.mapcamp_common1.fragments.MyFragment

class MyPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val NUM_PAGES = 3

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> { ContactFragment()}
            1 -> { GalleryFragment()}
            2 -> { MyFragment()}
            else -> { Fragment()}
        }
    }
}