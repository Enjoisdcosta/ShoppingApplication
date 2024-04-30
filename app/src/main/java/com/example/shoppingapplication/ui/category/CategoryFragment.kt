package com.example.shoppingapplication.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentCategoryBinding
import com.example.shoppingapplication.databinding.FragmentShoppingListBinding
import com.example.shoppingapplication.ui.shoppinglist.ShoppingListViewModel


class CategoryFragment : Fragment() {
    lateinit var binding: FragmentCategoryBinding
    lateinit var viewModel: CategoryViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false)
    }


}