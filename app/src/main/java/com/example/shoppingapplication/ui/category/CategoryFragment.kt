package com.example.shoppingapplication.ui.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentCategoryBinding
import com.example.shoppingapplication.databinding.FragmentShoppingListBinding
import com.example.shoppingapplication.ui.shoppinglist.ShoppingListViewModel


class CategoryFragment : Fragment() {
    var menu_id:String? = null
    var name:String? = null
    var image:String? = null
    var food:List<CategoryViewModel>?=null
    lateinit var binding: FragmentCategoryBinding
    lateinit var viewModel: CategoryViewModel
    private val viewModel2= CategoryViewModel()
    fun changeCategory(){

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val categoryViewModel = ViewModelProvider(this).get(CategoryViewModel::class.java)
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(inflater,container,false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textFood.setOnClickListener {
          //  findNavController().navigate()

        }
    }

}