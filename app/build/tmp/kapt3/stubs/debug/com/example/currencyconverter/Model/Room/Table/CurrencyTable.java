package com.example.currencyconverter.Model.Room.Table;

import java.lang.System;

@androidx.room.Entity(tableName = "currency_table")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "", "fromAmount", "", "fromCurrency", "toAmount", "toCurrency", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromAmount", "()Ljava/lang/String;", "setFromAmount", "(Ljava/lang/String;)V", "getFromCurrency", "setFromCurrency", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getToAmount", "setToAmount", "getToCurrency", "setToCurrency", "app_debug"})
public final class CurrencyTable {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "Id")
    @androidx.annotation.NonNull()
    @androidx.room.PrimaryKey()
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CurrentAmount")
    private java.lang.String fromAmount;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "CurrentCurrency")
    private java.lang.String fromCurrency;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ConvertedAmount")
    private java.lang.String toAmount;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ConvertedCurrency")
    private java.lang.String toCurrency;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFromAmount() {
        return null;
    }
    
    public final void setFromAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFromCurrency() {
        return null;
    }
    
    public final void setFromCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToAmount() {
        return null;
    }
    
    public final void setToAmount(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToCurrency() {
        return null;
    }
    
    public final void setToCurrency(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public CurrencyTable(@org.jetbrains.annotations.NotNull()
    java.lang.String fromAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String fromCurrency, @org.jetbrains.annotations.NotNull()
    java.lang.String toAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String toCurrency) {
        super();
    }
}