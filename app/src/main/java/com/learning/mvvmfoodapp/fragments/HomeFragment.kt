package com.learning.mvvmfoodapp.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.learning.mvvmfoodapp.activities.CategoryMealsActivity
import com.learning.mvvmfoodapp.activities.MealActivity
import com.learning.mvvmfoodapp.adapters.CategoriesAdapter
import com.learning.mvvmfoodapp.adapters.MostPopularAdapter
import com.learning.mvvmfoodapp.databinding.FragmentHomeBinding
import com.learning.mvvmfoodapp.pogo.MealsByCategory
import com.learning.mvvmfoodapp.pogo.Meal
import com.learning.mvvmfoodapp.viewModel.HomeViewModel

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    private lateinit var homeMvvm : HomeViewModel
    private lateinit var randomMeal : Meal
    private lateinit var popularItemsAdapter: MostPopularAdapter
    private lateinit var categoriesAdapter : CategoriesAdapter

    companion object{
        const val MEAL_ID = "com.learning.mvvmfoodapp.fragments.idMeal"
        const val MEAL_NAME = "com.learning.mvvmfoodapp.fragments.nameMeal"
        const val MEAL_THUMB = "com.learning.mvvmfoodapp.fragments.thumbMeal"
        const val CATEGORY_NAME = "com.learning.mvvmfoodapp.fragments.categoryName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeMvvm = ViewModelProvider(this).get(HomeViewModel::class.java)

        popularItemsAdapter = MostPopularAdapter()
        categoriesAdapter = CategoriesAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        preparePopularItemsRecyclerView()

        homeMvvm.getRandomMeal()
        observerRandomMeal()
        onRandomMealClick()

        homeMvvm.getPopularItems()
        observePopularItemsLiveData()
        onPopularItemClick()

        prepareCategoriesRecyclerView()
        homeMvvm.getCategories()
        observeCategoriesLiveData()
        onCategoryClick()
    }

    private fun onCategoryClick() {
        categoriesAdapter.onItemClick = { category ->
            val intent = Intent(activity,CategoryMealsActivity::class.java)
            intent.putExtra(CATEGORY_NAME, category.strCategory)
            startActivity(intent)
        }
    }

    private fun prepareCategoriesRecyclerView() {
        binding.recViewCategories.apply {
            layoutManager = GridLayoutManager(context, 3,GridLayoutManager.VERTICAL,false)
            adapter = categoriesAdapter
        }
    }

    private fun observeCategoriesLiveData() {
        homeMvvm.observeCategoriesLiveData().observe(viewLifecycleOwner, Observer { categories ->
            categories.forEach { category ->
                categoriesAdapter.setCategoriesList(categories)
            }
        })
    }

    private fun  onPopularItemClick(){
        popularItemsAdapter.onItemClick = {
            meal ->
            val intent = Intent(activity,MealActivity::class.java)
            intent.putExtra(MEAL_ID,meal.idMeal)
            intent.putExtra(MEAL_NAME,meal.strMeal)
            intent.putExtra(MEAL_THUMB,meal.strMealThumb)
            startActivity(intent)
        }
    }
    private fun preparePopularItemsRecyclerView(){
        binding.recViewMealPopular.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL,false)
            adapter = popularItemsAdapter
        }
    }
    private fun observePopularItemsLiveData(){
        homeMvvm.observePopularItemsLiveData().observe(viewLifecycleOwner
        ) { mealList ->
            popularItemsAdapter.setMeals(mealsList = mealList as ArrayList<MealsByCategory>)
        }
    }

    private fun onRandomMealClick(){
        binding.randomMealCard.setOnClickListener{
            val intent = Intent(requireContext(), MealActivity::class.java)
            intent.putExtra(MEAL_ID, randomMeal.idMeal)
            intent.putExtra(MEAL_NAME, randomMeal.strMeal)
            intent.putExtra(MEAL_THUMB, randomMeal.strMealThumb)
            startActivity(intent)
        }
    }
    private fun observerRandomMeal(){
        homeMvvm.observeRandomMealLivedata().observe(viewLifecycleOwner,object :Observer<Meal>{
            override fun onChanged(meal: Meal) {
                Glide.with(this@HomeFragment)
                    .load(meal.strMealThumb)
                    .into(binding.imgRandomMeal)

                this@HomeFragment.randomMeal = meal

            }
        })
    }

}