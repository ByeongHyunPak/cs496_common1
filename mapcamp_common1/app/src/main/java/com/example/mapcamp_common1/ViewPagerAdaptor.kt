package com.example.mapcamp_common1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mapcamp_common1.databinding.SlideItemBinding

class ViewPagerAdaptor(private val dataList: ArrayList<Int>)
    : RecyclerView.Adapter<ViewPagerAdaptor.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = SlideItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    class ViewHolder(private val binding: SlideItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Int) {
            with (binding) {
                slideItem.setImageResource(data)
            }
        }
    }

}