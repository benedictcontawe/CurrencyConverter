package com.example.currencyconverter.Model.Room.Database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.currencyconverter.Model.Room.Table.CurrencyTable.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "Companion", "app_debug"})
public abstract class CurrencyDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.currencyconverter.Model.Room.Database.CurrencyDatabase INSTANCE;
    private static final androidx.room.RoomDatabase.Callback roomCallback = null;
    public static final com.example.currencyconverter.Model.Room.Database.CurrencyDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO();
    
    public CurrencyDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase;", "roomCallback", "Landroidx/room/RoomDatabase$Callback;", "getDatabase", "context", "Landroid/content/Context;", "PopulateDatabaseAsyncTask", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final synchronized com.example.currencyconverter.Model.Room.Database.CurrencyDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase$Companion$PopulateDatabaseAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "db", "Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase;", "(Lcom/example/currencyconverter/Model/Room/Database/CurrencyDatabase;)V", "doInBackground", "voids", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
        static final class PopulateDatabaseAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
            
            @org.jetbrains.annotations.Nullable()
            @java.lang.Override()
            protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
            java.lang.Void... voids) {
                return null;
            }
            
            public PopulateDatabaseAsyncTask(@org.jetbrains.annotations.Nullable()
            com.example.currencyconverter.Model.Room.Database.CurrencyDatabase db) {
                super();
            }
        }
    }
}