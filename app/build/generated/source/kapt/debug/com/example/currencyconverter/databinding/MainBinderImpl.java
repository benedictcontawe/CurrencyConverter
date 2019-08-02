package com.example.currencyconverter.databinding;
import com.example.currencyconverter.R;
import com.example.currencyconverter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainBinderImpl extends MainBinder  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_status, 1);
        sViewsWithIds.put(R.id.spinner_fromCurrency, 2);
        sViewsWithIds.put(R.id.et_amount, 3);
        sViewsWithIds.put(R.id.spinner_toCurrency, 4);
        sViewsWithIds.put(R.id.btn_convert, 5);
    }
    // views
    @NonNull
    private final android.widget.TableLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainBinderImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private MainBinderImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[2]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (android.widget.TableLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.currencyconverter.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.currencyconverter.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}