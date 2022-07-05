package com.example.mapcamp_common1.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mapcamp_common1.ImageClickListener
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.GalleryItemBinding

class PhotoAdapter(private val mContext: Context, private val dataList: ArrayList<Int>) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private lateinit var binding: GalleryItemBinding

    inner class ViewHolder(private val binding:GalleryItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dataList: ArrayList<Int>) {
            with(binding) {
                galleryItem.setImageResource(dataList[layoutPosition])
                galleryItem.setOnClickListener(ImageClickListener(mContext, dataList, layoutPosition))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}








