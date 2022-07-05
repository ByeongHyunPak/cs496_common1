package com.example.mapcamp_common1

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import androidx.core.app.ActivityOptionsCompat

class ImageClickListener(private val mContext: Context, private val dataList: ArrayList<Int>, private val position: Int)
    : View.OnClickListener {

    override fun onClick(view: View?) {
        val intent = Intent(mContext, ImageActivity::class.java)
        intent.putIntegerArrayListExtra("ImageList", dataList)
        intent.putExtra("Index", position)
        mContext.startActivity(intent)
    }
}