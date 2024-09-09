package com.learning.mvvmfoodapp.retrofit;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\bH\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\bH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u000f\u001a\u00020\bH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/learning/mvvmfoodapp/retrofit/MealApi;", "", "getCategory", "Lretrofit2/Call;", "Lcom/learning/mvvmfoodapp/pogo/CategoryList;", "getMealDetails", "Lcom/learning/mvvmfoodapp/pogo/MealList;", "id", "", "getMealsByCategory", "Lcom/learning/mvvmfoodapp/pogo/MealsByCategoryList;", "categoryName", "getPopularItems", "getRandomMeal", "searchMeals", "searchQuery", "app_debug"})
public abstract interface MealApi {
    
    @retrofit2.http.GET(value = "random.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.MealList> getRandomMeal();
    
    @retrofit2.http.GET(value = "lookup.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.MealList> getMealDetails(@retrofit2.http.Query(value = "i")
    @org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @retrofit2.http.GET(value = "filter.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.MealsByCategoryList> getPopularItems(@retrofit2.http.Query(value = "c")
    @org.jetbrains.annotations.NotNull
    java.lang.String categoryName);
    
    @retrofit2.http.GET(value = "categories.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.CategoryList> getCategory();
    
    @retrofit2.http.GET(value = "filter.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.MealsByCategoryList> getMealsByCategory(@retrofit2.http.Query(value = "c")
    @org.jetbrains.annotations.NotNull
    java.lang.String categoryName);
    
    @retrofit2.http.GET(value = "search.php")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.learning.mvvmfoodapp.pogo.MealList> searchMeals(@retrofit2.http.Query(value = "s")
    @org.jetbrains.annotations.NotNull
    java.lang.String searchQuery);
}