package com.example.mapcamp_common1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.FragmentContactBinding
import com.example.mapcamp_common1.databinding.FragmentMyBinding
import com.google.gson.Gson
import java.io.IOException

class ContactFragment : Fragment() {

    private var _binding: FragmentContactBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }


    // 여기를 수정해줘야겠네
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val testdata = getJsonData("data.json")

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = MyRecyclerViewAdapter(testdata!!) // 실제로는 방어적인 코딩을 해야할 수 있는데, 항상 파일이 있다고 가정.
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL)) // 항목마다 줄을 그어줌
        }
    }

    private fun getJsonData(filename: String): CoronaMed? {
        val assetManager = resources.assets
        var result: CoronaMed? = null
        try {
            val inputStream = assetManager.open(filename)
            val reader = inputStream.bufferedReader()
            val gson = Gson()
            result = gson.fromJson(reader, CoronaMed::class.java)
        } catch(e: IOException) {
            e.printStackTrace()
        }
        return result
    }
}