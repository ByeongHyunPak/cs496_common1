package com.example.mapcamp_common1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.mapcamp_common1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply {
            adapter = MyPagerAdapter(context as FragmentActivity)
        }

        // 탭 내용물
        TabLayoutMediator(binding.tabs, binding.viewpager) { tab, position ->
            when(position){
                0->{
                    tab.text = "연락처"
                }
                1->{
                    tab.text = "갤러리"
                }
                2->{
                    tab.text = "뭐하지"
                }
            }


        }.attach()
    }
}