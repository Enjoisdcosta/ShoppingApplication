package com.example.shoppingapplication.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentCartBinding
import com.example.shoppingapplication.databinding.FragmentShoppingListBinding
import com.example.shoppingapplication.ui.shoppinglist.ShoppingListViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
class CartFragment : Fragment() {
    lateinit var binding: FragmentCartBinding
    lateinit var viewModel: CartViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

}