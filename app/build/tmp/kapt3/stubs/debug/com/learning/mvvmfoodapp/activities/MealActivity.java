package com.learning.mvvmfoodapp.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/learning/mvvmfoodapp/activities/MealActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/learning/mvvmfoodapp/databinding/ActivityMealBinding;", "mealId", "", "mealMvvm", "Lcom/learning/mvvmfoodapp/viewModel/MealViewModel;", "mealName", "mealThumb", "mealToSave", "Lcom/learning/mvvmfoodapp/pogo/Meal;", "youtubeLink", "getMealInformationFromIntent", "", "loadingCase", "observerMealDetailsLiveData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavoriteClick", "onResponseCase", "onYoutubeImageClick", "setInformationViews", "app_debug"})
public final class MealActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.learning.mvvmfoodapp.databinding.ActivityMealBinding binding;
    private java.lang.String mealId;
    private java.lang.String mealName;
    private java.lang.String mealThumb;
    private com.learning.mvvmfoodapp.viewModel.MealViewModel mealMvvm;
    private java.lang.String youtubeLink;
    @org.jetbrains.annotations.Nullable
    private com.learning.mvvmfoodapp.pogo.Meal mealToSave;
    
    public MealActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onFavoriteClick() {
    }
    
    private final void onYoutubeImageClick() {
    }
    
    private final void observerMealDetailsLiveData() {
    }
    
    private final void setInformationViews() {
    }
    
    private final void getMealInformationFromIntent() {
    }
    
    private final void loadingCase() {
    }
    
    private final void onResponseCase() {
    }
}