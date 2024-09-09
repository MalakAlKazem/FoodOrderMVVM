package com.learning.mvvmfoodapp.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\b\u0010\u001d\u001a\u00020\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u000eH\u0002J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010!\u001a\u00020\u000eH\u0002J\b\u0010\"\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/learning/mvvmfoodapp/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/learning/mvvmfoodapp/databinding/FragmentHomeBinding;", "categoriesAdapter", "Lcom/learning/mvvmfoodapp/adapters/CategoriesAdapter;", "popularItemsAdapter", "Lcom/learning/mvvmfoodapp/adapters/MostPopularAdapter;", "randomMeal", "Lcom/learning/mvvmfoodapp/pogo/Meal;", "viewModel", "Lcom/learning/mvvmfoodapp/viewModel/HomeViewModel;", "observeCategoriesLiveData", "", "observePopularItemsLiveData", "observerRandomMeal", "onCategoryClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPopularItemClick", "onPopularItemLongClick", "onRandomMealClick", "onSearchIconClick", "onViewCreated", "view", "prepareCategoriesRecyclerView", "preparePopularItemsRecyclerView", "Companion", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.learning.mvvmfoodapp.databinding.FragmentHomeBinding binding;
    private com.learning.mvvmfoodapp.viewModel.HomeViewModel viewModel;
    private com.learning.mvvmfoodapp.pogo.Meal randomMeal;
    private com.learning.mvvmfoodapp.adapters.MostPopularAdapter popularItemsAdapter;
    private com.learning.mvvmfoodapp.adapters.CategoriesAdapter categoriesAdapter;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_ID = "com.learning.mvvmfoodapp.fragments.idMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_NAME = "com.learning.mvvmfoodapp.fragments.nameMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MEAL_THUMB = "com.learning.mvvmfoodapp.fragments.thumbMeal";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CATEGORY_NAME = "com.learning.mvvmfoodapp.fragments.categoryName";
    @org.jetbrains.annotations.NotNull
    public static final com.learning.mvvmfoodapp.fragments.HomeFragment.Companion Companion = null;
    
    public HomeFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onSearchIconClick() {
    }
    
    private final void onPopularItemLongClick() {
    }
    
    private final void onCategoryClick() {
    }
    
    private final void prepareCategoriesRecyclerView() {
    }
    
    private final void observeCategoriesLiveData() {
    }
    
    private final void onPopularItemClick() {
    }
    
    private final void preparePopularItemsRecyclerView() {
    }
    
    private final void observePopularItemsLiveData() {
    }
    
    private final void onRandomMealClick() {
    }
    
    private final void observerRandomMeal() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/learning/mvvmfoodapp/fragments/HomeFragment$Companion;", "", "()V", "CATEGORY_NAME", "", "MEAL_ID", "MEAL_NAME", "MEAL_THUMB", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}