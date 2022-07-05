package com.example.mapcamp_common1.fragments

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mapcamp_common1.databinding.ListItemBinding

class MyRecyclerViewAdapter(private val dataset: CoronaMed) : RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val context = binding.root.context

        fun bind(data: CoronaMedItem) {
            with(binding) {
                tvName.text = data.INST_NM
                tvPhonenum.text = data.TELNO
                itemView.setOnClickListener {
                    val dialIntent = Intent(Intent.ACTION_DIAL)
                    dialIntent.data = Uri.parse("tel:" + data.TELNO)
                    context.startActivity(dialIntent)

                }
                itemView.setOnLongClickListener() {
                    AlertDialog.Builder(context).apply {
                        setTitle("삭제")
                        setMessage("삭제하시겠습니까?")
                        setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which ->
                            Toast.makeText(context, "확인", Toast.LENGTH_SHORT).show()
                            // TODO
                            layoutPosition
                        })
                        setNegativeButton("취소", DialogInterface.OnClickListener { dialog, which ->

                        })
                        show()
                    }
                    true
                }
            }
        }
    }

}