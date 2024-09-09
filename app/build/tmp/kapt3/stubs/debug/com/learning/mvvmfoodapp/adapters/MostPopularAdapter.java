package com.learning.mvvmfoodapp.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u001e\u0010\u001a\u001a\u00020\t2\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u001bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/MostPopularAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/learning/mvvmfoodapp/adapters/MostPopularAdapter$PopularMealViewHolder;", "()V", "mealsList", "Ljava/util/ArrayList;", "Lcom/learning/mvvmfoodapp/pogo/MealsByCategory;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "onLongItemClick", "getOnLongItemClick", "setOnLongItemClick", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMeals", "Lkotlin/collections/ArrayList;", "PopularMealViewHolder", "app_debug"})
public final class MostPopularAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.learning.mvvmfoodapp.adapters.MostPopularAdapter.PopularMealViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.learning.mvvmfoodapp.pogo.MealsByCategory> mealsList;
    public kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> onItemClick;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> onLongItemClick;
    
    public MostPopularAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> getOnLongItemClick() {
        return null;
    }
    
    public final void setOnLongItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.MealsByCategory, kotlin.Unit> p0) {
    }
    
    public final void setMeals(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.learning.mvvmfoodapp.pogo.MealsByCategory> mealsList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.learning.mvvmfoodapp.adapters.MostPopularAdapter.PopularMealViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.adapters.MostPopularAdapter.PopularMealViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/MostPopularAdapter$PopularMealViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/learning/mvvmfoodapp/databinding/PopularItemsBinding;", "(Lcom/learning/mvvmfoodapp/databinding/PopularItemsBinding;)V", "getBinding", "()Lcom/learning/mvvmfoodapp/databinding/PopularItemsBinding;", "app_debug"})
    public static final class PopularMealViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.learning.mvvmfoodapp.databinding.PopularItemsBinding binding = null;
        
        public PopularMealViewHolder(@org.jetbrains.annotations.NotNull
        com.learning.mvvmfoodapp.databinding.PopularItemsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.learning.mvvmfoodapp.databinding.PopularItemsBinding getBinding() {
            return null;
        }
    }
}