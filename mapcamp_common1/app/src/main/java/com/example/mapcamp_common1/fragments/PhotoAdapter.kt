package com.example.mapcamp_common1.fragments

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.mapcamp_common1.ImageClickListener

class PhotoAdapter(private val mContext: Context, private val dataList: ArrayList<Int>) : BaseAdapter() {

    override fun getCount() = dataList.size

    override fun getItem(position: Int) = dataList[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
        val imageView: ImageView

        if (convertView != null) imageView = (convertView as ImageView)
        else {
            imageView = ImageView(mContext)
            imageView.scaleType = ImageView.ScaleType.FIT_CENTER
            imageView.adjustViewBounds = true
            imageView.setImageResource(dataList[position])

            val imageClickListener = ImageClickListener(mContext, dataList, position)
            imageView.setOnClickListener(imageClickListener)
        }

        return imageView
    }
}








