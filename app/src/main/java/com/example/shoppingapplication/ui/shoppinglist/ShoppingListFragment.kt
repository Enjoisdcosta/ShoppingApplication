package com.example.shoppingapplication.ui.shoppinglist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import com.example.shoppingapplication.R
import com.example.shoppingapplication.databinding.FragmentShoppingListBinding

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
class ShoppingListFragment : Fragment() {
    lateinit var binding: FragmentShoppingListBinding
    lateinit var viewModel: ShoppingListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shopping_list, container, false)
    }

}