package com.example.currencyconverter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\b\u0010\u000b\u001a\u00020\fH\u0007J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/currencyconverter/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/currencyconverter/Model/Repository/CurrencyRepository;", "getCurrency", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "readGSON", "", "requestCurrency", "", "fromAmount", "fromCurrency", "toCurrency", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.currencyconverter.Model.Repository.CurrencyRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.currencyconverter.Model.Room.Table.CurrencyTable>> getCurrency() {
        return null;
    }
    
    public final void requestCurrency(@org.jetbrains.annotations.NotNull()
    java.lang.String fromAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrency) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String readGSON() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}