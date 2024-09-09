package com.learning.mvvmfoodapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learning.mvvmfoodapp.db.MealDatabase
import com.learning.mvvmfoodapp.pogo.Category
import com.learning.mvvmfoodapp.pogo.CategoryList
import com.learning.mvvmfoodapp.pogo.MealsByCategoryList
import com.learning.mvvmfoodapp.pogo.MealsByCategory
import com.learning.mvvmfoodapp.pogo.Meal
import com.learning.mvvmfoodapp.pogo.MealList
import com.learning.mvvmfoodapp.retrofit.RetrofitInstance
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel(
    private val mealDatabase: MealDatabase
): ViewModel() {
    private var popularItemsLiveData = MutableLiveData<List<MealsByCategory>>()
    private  var randomMealLiveData = MutableLiveData<Meal>()
   private var categoriesLiveDate  = MutableLiveData<List<Category>>()
    private var favoriteMealsLiveData = mealDatabase.mealDao().getAllMeals()
    private var bottomSheetMealLiveData = MutableLiveData<Meal>()
    fun getRandomMeal(){
        RetrofitInstance.api.getRandomMeal().enqueue(object : Callback<MealList> {
            override fun onResponse(p0: Call<MealList>, p1: Response<MealList>) {
                if(p1.body() != null){
                    val randomMeal: Meal = p1.body()!!.meals[0]
                   randomMealLiveData.value = randomMeal
                }
                else{
                    return
                }
            }

            override fun onFailure(p0: Call<MealList>, t: Throwable) {
                Log.d("HomeFragment",t.message.toString())
            }
        })
    }

    fun getMealById(id: String){
        RetrofitInstance.api.getMealDetails(id).enqueue(object : Callback<MealList>{
            override fun onResponse(p0: Call<MealList>, p1: Response<MealList>) {
                val meal = p1.body()?.meals?.first()
                meal?.let {meal->
                    bottomSheetMealLiveData.postValue(meal)
                }
            }

            override fun onFailure(p0: Call<MealList>, p1: Throwable) {
                Log.d("HomeViewModel",p1.message.toString())
            }
        })
    }
    fun deleteMeal(meal: Meal){
        viewModelScope.launch {
            mealDatabase.mealDao().delete(meal)
        }
    }
    fun insertMeal(meal: Meal){
        viewModelScope.launch {
            mealDatabase.mealDao().upsert(meal)
        }
    }
    fun getPopularItems(){
        RetrofitInstance.api.getPopularItems("Seafood").enqueue(object : Callback<MealsByCategoryList>{
            override fun onResponse(p0: Call<MealsByCategoryList>, p1: Response<MealsByCategoryList>) {
                if(p1.body()!=null){
                    popularItemsLiveData.value = p1.body()!!.meals
                }
            }

            override fun onFailure(p0: Call<MealsByCategoryList>, p1: Throwable) {
                Log.d("HomeFragment",p1.message.toString())
            }
        })
    }

    fun getCategories(){
        RetrofitInstance.api.getCategory().enqueue(object : Callback<CategoryList>{
            override fun onResponse(p0: Call<CategoryList>, p1: Response<CategoryList>) {
                p1.body()?.let{
                    categoryList ->  categoriesLiveDate.postValue(categoryList.categories)
                }
            }

            override fun onFailure(p0: Call<CategoryList>, p1: Throwable) {
                Log.d("HomeViewModel",p1.message.toString())
            }
        })
    }

    fun observeRandomMealLivedata(): LiveData<Meal> {
        return  randomMealLiveData
    }

    fun observePopularItemsLiveData():LiveData<List<MealsByCategory>>{
        return popularItemsLiveData
    }

    fun observeCategoriesLiveData():LiveData<List<Category>>{
        return categoriesLiveDate
    }

    fun observeFavoriteMealsLiveData():LiveData<List<Meal>>{
        return favoriteMealsLiveData
    }

    fun observeBottomSheetMeal():LiveData<Meal> = bottomSheetMealLiveData
}