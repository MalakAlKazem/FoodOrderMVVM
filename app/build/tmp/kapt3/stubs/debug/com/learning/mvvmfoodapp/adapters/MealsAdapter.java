package com.learning.mvvmfoodapp.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/MealsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/learning/mvvmfoodapp/adapters/MealsAdapter$FavoriteMealsAdapterViewHolder;", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/learning/mvvmfoodapp/pogo/Meal;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoriteMealsAdapterViewHolder", "app_debug"})
public final class MealsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.learning.mvvmfoodapp.adapters.MealsAdapter.FavoriteMealsAdapterViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.learning.mvvmfoodapp.pogo.Meal> diffUtil = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.learning.mvvmfoodapp.pogo.Meal> differ = null;
    
    public MealsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.learning.mvvmfoodapp.pogo.Meal> getDiffer() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.learning.mvvmfoodapp.adapters.MealsAdapter.FavoriteMealsAdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.adapters.MealsAdapter.FavoriteMealsAdapterViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/MealsAdapter$FavoriteMealsAdapterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;", "(Lcom/learning/mvvmfoodapp/adapters/MealsAdapter;Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;)V", "getBinding", "()Lcom/learning/mvvmfoodapp/databinding/MealItemBinding;", "app_debug"})
    public final class FavoriteMealsAdapterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.learning.mvvmfoodapp.databinding.MealItemBinding binding = null;
        
        public FavoriteMealsAdapterViewHolder(@org.jetbrains.annotations.NotNull
        com.learning.mvvmfoodapp.databinding.MealItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.learning.mvvmfoodapp.databinding.MealItemBinding getBinding() {
            return null;
        }
    }
}