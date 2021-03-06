package com.example.currencyconverter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.currencyconverter.MainViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MainBinder extends ViewDataBinding {
  @NonNull
  public final Button btnConvert;

  @NonNull
  public final EditText etAmount;

  @NonNull
  public final AppCompatSpinner spinnerFromCurrency;

  @NonNull
  public final AppCompatSpinner spinnerToCurrency;

  @NonNull
  public final AppCompatTextView tvStatus;

  @Bindable
  protected MainViewModel mViewModel;

  protected MainBinder(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnConvert, EditText etAmount, AppCompatSpinner spinnerFromCurrency,
      AppCompatSpinner spinnerToCurrency, AppCompatTextView tvStatus) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnConvert = btnConvert;
    this.etAmount = etAmount;
    this.spinnerFromCurrency = spinnerFromCurrency;
    this.spinnerToCurrency = spinnerToCurrency;
    this.tvStatus = tvStatus;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static MainBinder inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MainBinder inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MainBinder>inflateInternal(inflater, com.example.currencyconverter.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static MainBinder inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MainBinder inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<MainBinder>inflateInternal(inflater, com.example.currencyconverter.R.layout.activity_main, null, false, component);
  }

  public static MainBinder bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MainBinder bind(@NonNull View view, @Nullable Object component) {
    return (MainBinder)bind(component, view, com.example.currencyconverter.R.layout.activity_main);
  }
}
