package com.example.mapcamp_common1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mapcamp_common1.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = intent.getIntegerArrayListExtra("ImageList") as ArrayList<Int>
        val imgIndex = intent.getIntExtra("Index", 0)

        binding.subViewPager.apply {
            adapter = ViewPagerAdaptor(dataList)
            currentItem = imgIndex
        }

    }

}