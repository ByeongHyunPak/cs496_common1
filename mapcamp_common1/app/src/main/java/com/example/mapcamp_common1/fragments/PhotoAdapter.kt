package com.example.mapcamp_common1.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.FragmentContactBinding
import com.example.mapcamp_common1.databinding.GalleryItemBinding
import com.example.mapcamp_common1.databinding.ListItemBinding

class PhotoAdapter(private val dataList: List<DataModel>) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {



    class ViewHolder(private val binding: GalleryItemBinding) : RecyclerView.ViewHolder(binding.root) {
//
//        var image : ImageView
//        var title : TextView
//
//        init {
//            image = itemView.findViewById(R.id.image)
//            title = itemView.findViewById(R.id.title)
//        }

        fun bind(data: DataModel) {
            with(binding) {
                title.text = data.title
                image.setImageResource(data.image)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = GalleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}









