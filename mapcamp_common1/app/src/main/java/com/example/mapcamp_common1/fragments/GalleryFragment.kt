package com.example.mapcamp_common1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.FragmentGalleryBinding


class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    private var dataList = mutableListOf<DataModel>()

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

//        recyclerView = findViewById(R.id.recyclerView)
//        recyclerView.layoutManager = GridLayoutManager(this, 2)
//        photoAdapter = PhotoAdapter(this)
//        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", R.drawable.img01))
        dataList.add(DataModel("Title", R.drawable.img02))
        dataList.add(DataModel("Title", R.drawable.img03))
        dataList.add(DataModel("Title", R.drawable.img04))
        dataList.add(DataModel("Title", R.drawable.img05))

        dataList.add(DataModel("Title", R.drawable.img06))
        dataList.add(DataModel("Title", R.drawable.img07))
        dataList.add(DataModel("Title", R.drawable.img08))
        dataList.add(DataModel("Title", R.drawable.img09))
        dataList.add(DataModel("Title", R.drawable.img10))

        dataList.add(DataModel("Title", R.drawable.img11))
        dataList.add(DataModel("Title", R.drawable.img12))
        dataList.add(DataModel("Title", R.drawable.img13))
        dataList.add(DataModel("Title", R.drawable.img14))
        dataList.add(DataModel("Title", R.drawable.img15))

        dataList.add(DataModel("Title", R.drawable.img16))
        dataList.add(DataModel("Title", R.drawable.img17))
        dataList.add(DataModel("Title", R.drawable.img18))
        dataList.add(DataModel("Title", R.drawable.img19))
        dataList.add(DataModel("Title", R.drawable.img20))

        binding.recycleView.apply {
            layoutManager = GridLayoutManager(context,2)
            adapter = PhotoAdapter(dataList)
        }



    }

}






















