package com.example.currencyconverter.Model.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/BaseRepository;", "", "delete", "", "currencyTable", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "deleteAll", "insert", "update", "app_debug"})
public abstract interface BaseRepository {
    
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    public abstract void deleteAll();
}