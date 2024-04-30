package com.example.shoppingapplication.ui.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentCounterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class CounterFragment : Fragment() {
    // TODO: Rename and change types of parameters

//   private var _binding: FragmentCounterBinding? = null
//    val binding : FragmentCounterBinding = _binding!!
    lateinit var binding: FragmentCounterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCounterBinding.inflate(inflater, container, false)
        return binding.root
    }


}