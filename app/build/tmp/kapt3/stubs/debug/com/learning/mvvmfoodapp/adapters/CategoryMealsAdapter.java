package com.learning.mvvmfoodapp.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/CategoryMealsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/learning/mvvmfoodapp/adapters/CategoryMealsAdapter$CategoryMealsViewModel;", "()V", "mealsList", "Ljava/util/ArrayList;", "Lcom/learning/mvvmfoodapp/pogo/MealsByCategory;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMealsList", "", "CategoryMealsViewModel", "app_debug"})
public final class CategoryMealsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.learning.mvvmfoodapp.adapters.CategoryMealsAdapter.CategoryMealsViewModel> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.learning.mvvmfoodapp.pogo.MealsByCategory> mealsList;
    
    public CategoryMealsAdapter() {
        super();
    }
    
    public final void setMealsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.learning.mvvmfoodapp.pogo.MealsByCategory> mealsList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.learning.mvvmfoodapp.adapters.CategoryMealsAdapter.CategoryMealsViewModel onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.adapters.CategoryMealsAdapter.CategoryMealsViewModel holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/CategoryMealsAdapter$CategoryMealsViewModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;", "(Lcom/learning/mvvmfoodapp/adapters/CategoryMealsAdapter;Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;)V", "getBinding", "()Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;", "app_debug"})
    public final class CategoryMealsViewModel extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.learning.mvvmfoodapp.databinding.MealItemBinding binding = null;
        
        public CategoryMealsViewModel(@org.jetbrains.annotations.NotNull
        com.learning.mvvmfoodapp.databinding.MealItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.learning.mvvmfoodapp.databinding.MealItemBinding getBinding() {
            return null;
        }
    }
}