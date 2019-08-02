package com.example.currencyconverter.Model.Room.DataAccessObject;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\b\u0010\u0007\u001a\u00020\u0005H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "", "delete", "", "currencyTable", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "deleteAll", "getAll", "getFirst", "Landroidx/lifecycle/LiveData;", "", "insert", "update", "app_debug"})
public abstract interface CurrencyDAO {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable);
    
    @androidx.room.Query(value = "DELETE FROM currency_table")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM currency_table WHERE Id = 1")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.currencyconverter.Model.Room.Table.CurrencyTable>> getFirst();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM currency_table")
    public abstract com.example.currencyconverter.Model.Room.Table.CurrencyTable getAll();
}