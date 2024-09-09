package com.learning.mvvmfoodapp.viewModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0007J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fJ\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\fJ\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\fJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\fJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\fJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/learning/mvvmfoodapp/viewModel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "mealDatabase", "Lcom/learning/mvvmfoodapp/db/MealDatabase;", "(Lcom/learning/mvvmfoodapp/db/MealDatabase;)V", "bottomSheetMealLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/learning/mvvmfoodapp/pogo/Meal;", "categoriesLiveDate", "", "Lcom/learning/mvvmfoodapp/pogo/Category;", "favoriteMealsLiveData", "Landroidx/lifecycle/LiveData;", "popularItemsLiveData", "Lcom/learning/mvvmfoodapp/pogo/MealsByCategory;", "randomMealLiveData", "saveStateRandomMeal", "searchMealsLiveDta", "deleteMeal", "", "meal", "getCategories", "getMealById", "id", "", "getPopularItems", "getRandomMeal", "insertMeal", "observeBottomSheetMeal", "observeCategoriesLiveData", "observeFavoriteMealsLiveData", "observePopularItemsLiveData", "observeRandomMealLivedata", "observerSearchMealsLiveData", "searchMeals", "searchQuery", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.learning.mvvmfoodapp.db.MealDatabase mealDatabase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.learning.mvvmfoodapp.pogo.MealsByCategory>> popularItemsLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.learning.mvvmfoodapp.pogo.Meal> randomMealLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Category>> categoriesLiveDate;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Meal>> favoriteMealsLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.learning.mvvmfoodapp.pogo.Meal> bottomSheetMealLiveData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Meal>> searchMealsLiveDta = null;
    @org.jetbrains.annotations.Nullable
    private com.learning.mvvmfoodapp.pogo.Meal saveStateRandomMeal;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.db.MealDatabase mealDatabase) {
        super();
    }
    
    public final void getRandomMeal() {
    }
    
    public final void getMealById(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public final void deleteMeal(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.pogo.Meal meal) {
    }
    
    public final void searchMeals(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Meal>> observerSearchMealsLiveData() {
        return null;
    }
    
    public final void insertMeal(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.pogo.Meal meal) {
    }
    
    public final void getPopularItems() {
    }
    
    public final void getCategories() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.learning.mvvmfoodapp.pogo.Meal> observeRandomMealLivedata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.mvvmfoodapp.pogo.MealsByCategory>> observePopularItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Category>> observeCategoriesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.learning.mvvmfoodapp.pogo.Meal>> observeFavoriteMealsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.learning.mvvmfoodapp.pogo.Meal> observeBottomSheetMeal() {
        return null;
    }
}