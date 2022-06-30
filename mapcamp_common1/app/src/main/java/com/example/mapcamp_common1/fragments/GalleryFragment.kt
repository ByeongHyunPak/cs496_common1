package com.example.mapcamp_common1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mapcamp_common1.R
import com.example.mapcamp_common1.databinding.FragmentContactBinding
import com.example.mapcamp_common1.databinding.FragmentGalleryBinding
import com.example.mapcamp_common1.databinding.FragmentMyBinding

class GalleryFragment : Fragment() {

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

    }

}