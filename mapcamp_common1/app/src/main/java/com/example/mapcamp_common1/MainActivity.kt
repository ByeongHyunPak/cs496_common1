package com.example.mapcamp_common1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.mapcamp_common1.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("UseCompatLoadingForDrawables")
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
                    tab.icon = getDrawable(R.drawable.ic_baseline_phone_24)
                }
                1->{
                    tab.text = "갤러리"
                    tab.icon = getDrawable(R.drawable.ic_baseline_insert_photo_24)
                }
                2->{
                    tab.text = "공룡런"
                    tab.icon = getDrawable(R.drawable.ic_baseline_directions_run_24)
                }
            }
        }.attach()




    }
}