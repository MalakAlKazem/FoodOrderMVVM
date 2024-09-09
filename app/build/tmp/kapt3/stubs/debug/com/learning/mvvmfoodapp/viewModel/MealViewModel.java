package com.learning.mvvmfoodapp.viewModel;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/learning/mvvmfoodapp/viewModel/MealViewModel;", "Landroidx/lifecycle/ViewModel;", "mealDatabase", "Lcom/learning/mvvmfoodapp/db/MealDatabase;", "(Lcom/learning/mvvmfoodapp/db/MealDatabase;)V", "getMealDatabase", "()Lcom/learning/mvvmfoodapp/db/MealDatabase;", "mealDetailsLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/learning/mvvmfoodapp/pogo/Meal;", "deleteMeal", "", "meal", "getMealDetail", "id", "", "insertMeal", "observeMealDetailLiveData", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class MealViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.learning.mvvmfoodapp.db.MealDatabase mealDatabase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.learning.mvvmfoodapp.pogo.Meal> mealDetailsLiveData;
    
    public MealViewModel(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.db.MealDatabase mealDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.learning.mvvmfoodapp.db.MealDatabase getMealDatabase() {
        return null;
    }
    
    public final void getMealDetail(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.learning.mvvmfoodapp.pogo.Meal> observeMealDetailLiveData() {
        return null;
    }
    
    public final void insertMeal(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.pogo.Meal meal) {
    }
    
    public final void deleteMeal(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.pogo.Meal meal) {
    }
}