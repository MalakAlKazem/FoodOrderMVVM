package com.learning.mvvmfoodapp.fragments

import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

import com.learning.mvvmfoodapp.R
import com.learning.mvvmfoodapp.activities.MainActivity
import com.learning.mvvmfoodapp.adapters.FavoriteMealsAdapter
import com.learning.mvvmfoodapp.databinding.FragmentFavoritesBinding
import com.learning.mvvmfoodapp.viewModel.HomeViewModel

/**
 * A simple [Fragment] subclass.
 * Use the [FavoritesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavoritesFragment : Fragment() {
    private lateinit var binding: FragmentFavoritesBinding
    private lateinit var viewModel: HomeViewModel
    private lateinit var favoriteAdapter : FavoriteMealsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = (activity as MainActivity).viewModel


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        prepareRecyclerView()
        observeFavorites()

        val itemTouchHelper = object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.RIGHT or ItemTouchHelper.LEFT
            ){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ) = true
//            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
//                val position = viewHolder.adapterPosition
//                viewModel.deleteMeal(favoriteAdapter.differ.currentList[position])
//                Snackbar.make(requireView() ,"Meal Deleted",Snackbar.LENGTH_LONG).setAction(
//                    "Undo",
//                    View.OnClickListener {
//                        viewModel.insertMeal(favoriteAdapter.differ.currentList[position])
//                    }
//                ).show()
//
//            }
override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
    val position = viewHolder.adapterPosition
    val mealToDelete = favoriteAdapter.differ.currentList[position]

    // Save the meal to be deleted
    viewModel.deleteMeal(mealToDelete)

    Snackbar.make(requireView(), "Meal Deleted", Snackbar.LENGTH_LONG)
        .setAction("Undo") {
            viewModel.insertMeal(mealToDelete)
        }
        .show()
}

        }
        ItemTouchHelper(itemTouchHelper).attachToRecyclerView(binding.rvFavorites)
    }

    private fun prepareRecyclerView() {
        favoriteAdapter = FavoriteMealsAdapter()
        binding.rvFavorites.apply {
            layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL,false)
            adapter = favoriteAdapter
        }
    }

    private fun observeFavorites() {
        viewModel.observeFavoriteMealsLiveData().observe(viewLifecycleOwner, Observer { meals->
            favoriteAdapter.differ.submitList(meals)

        })
    }

}