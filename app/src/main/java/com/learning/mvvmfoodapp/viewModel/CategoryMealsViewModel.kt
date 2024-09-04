package com.learning.mvvmfoodapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.learning.mvvmfoodapp.pogo.MealsByCategory
import com.learning.mvvmfoodapp.pogo.MealsByCategoryList
import com.learning.mvvmfoodapp.retrofit.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryMealsViewModel : ViewModel(){
    val mealsLiveData = MutableLiveData<List<MealsByCategory>>()

    fun getMeasByCategory(categoryName: String){
        RetrofitInstance.api.getMealsByCategory(categoryName).enqueue(object : Callback<MealsByCategoryList>{
            override fun onResponse(
                p0: Call<MealsByCategoryList>,
                p1: Response<MealsByCategoryList>
            ) {
                p1.body()?.let { mealsList ->
                    mealsLiveData.postValue(mealsList.meals)
                }
            }

            override fun onFailure(p0: Call<MealsByCategoryList>, p1: Throwable) {
                Log.d("CategoryMealsViewModel", p1.message.toString())
            }
        })
    }
    fun observeMealsLiveData() : LiveData<List<MealsByCategory>>{
        return mealsLiveData
    }
}