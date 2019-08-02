package com.example.currencyconverter.Model.WebService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/currencyconverter/Model/WebService/CurrencyAPI;", "", "getCurrencyDatils", "Lretrofit2/Call;", "Lcom/example/currencyconverter/Model/Entity/CurrencyResponseModel;", "fromAmount", "", "fromCurrency", "toCurrency", "app_debug"})
public abstract interface CurrencyAPI {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/currency/commercial/exchange/{fromAmount}-{fromCurrency}/{toCurrency}/latest")
    public abstract retrofit2.Call<com.example.currencyconverter.Model.Entity.CurrencyResponseModel> getCurrencyDatils(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "fromAmount")
    java.lang.String fromAmount, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "fromCurrency")
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "toCurrency")
    java.lang.String toCurrency);
}