package com.example.mapcamp_common1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.FragmentGalleryBinding


class GalleryFragment : Fragment() {

    private var dataList: ArrayList<Int> = arrayListOf(
        R.drawable.img01,
        R.drawable.img02,
        R.drawable.img03,
        R.drawable.img04,
        R.drawable.img05,
        R.drawable.img06,
        R.drawable.img07,
        R.drawable.img08,
        R.drawable.img09,
        R.drawable.img10,
        R.drawable.img11,
        R.drawable.img12,
        R.drawable.img13,
        R.drawable.img14,
        R.drawable.img15,
        R.drawable.img16,
        R.drawable.img17,
        R.drawable.img18,
        R.drawable.img19,
        R.drawable.img20,
    )

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    // 여기를 수정해줘야겠네
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recycleView.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = PhotoAdapter(context, dataList)
            setItemViewCacheSize(20)
        }
    }

}






















