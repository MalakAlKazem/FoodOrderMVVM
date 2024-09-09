package com.learning.mvvmfoodapp.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0014\u0010\u0017\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/CategoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/learning/mvvmfoodapp/adapters/CategoriesAdapter$CategoryViewHolder;", "()V", "categoriesList", "Ljava/util/ArrayList;", "Lcom/learning/mvvmfoodapp/pogo/Category;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCategoriesList", "", "CategoryViewHolder", "app_debug"})
public final class CategoriesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.learning.mvvmfoodapp.adapters.CategoriesAdapter.CategoryViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.learning.mvvmfoodapp.pogo.Category> categoriesList;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.Category, kotlin.Unit> onItemClick;
    
    public CategoriesAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.learning.mvvmfoodapp.pogo.Category, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.learning.mvvmfoodapp.pogo.Category, kotlin.Unit> p0) {
    }
    
    public final void setCategoriesList(@org.jetbrains.annotations.NotNull
    java.util.List<com.learning.mvvmfoodapp.pogo.Category> categoriesList) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.learning.mvvmfoodapp.adapters.CategoriesAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.learning.mvvmfoodapp.adapters.CategoriesAdapter.CategoryViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/learning/mvvmfoodapp/adapters/CategoriesAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/learning/mvvmfoodapp/databinding/CategoryItemBinding;", "(Lcom/learning/mvvmfoodapp/adapters/CategoriesAdapter;Lcom/learning/mvvmfoodapp/databinding/CategoryItemBinding;)V", "getBinding", "()Lcom/learning/mvvmfoodapp/databinding/CategoryItemBinding;", "app_debug"})
    public final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.learning.mvvmfoodapp.databinding.CategoryItemBinding binding = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull
        com.learning.mvvmfoodapp.databinding.CategoryItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.learning.mvvmfoodapp.databinding.CategoryItemBinding getBinding() {
            return null;
        }
    }
}