package com.learning.mvvmfoodapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.learning.mvvmfoodapp.R
import com.learning.mvvmfoodapp.adapters.CategoryMealsAdapter
import com.learning.mvvmfoodapp.databinding.ActivityCategoryMealsBinding
import com.learning.mvvmfoodapp.fragments.HomeFragment
import com.learning.mvvmfoodapp.viewModel.CategoryMealsViewModel

class CategoryMealsActivity : AppCompatActivity() {
    lateinit var binding : ActivityCategoryMealsBinding
    lateinit var categoryMealsViewModel : CategoryMealsViewModel
    lateinit var categoryMealsAdapter : CategoryMealsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryMealsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareRecyclerView()

        categoryMealsViewModel = ViewModelProvider(this).get(CategoryMealsViewModel::class.java)

        categoryMealsViewModel.getMeasByCategory(intent.getStringExtra(HomeFragment.CATEGORY_NAME)!!)

        categoryMealsViewModel.observeMealsLiveData().observe(this, {mealsList ->
            binding.tvCategoryCount.text = mealsList.size.toString()
            categoryMealsAdapter.setMealsList(mealsList)
        })
    }

    private fun prepareRecyclerView() {
        categoryMealsAdapter = CategoryMealsAdapter()
        binding.rvMeals.apply {
            layoutManager = GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
            adapter = categoryMealsAdapter
        }
    }
}