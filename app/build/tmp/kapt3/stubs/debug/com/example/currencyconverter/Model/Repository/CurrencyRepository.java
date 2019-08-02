package com.example.currencyconverter.Model.Repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository;", "Lcom/example/currencyconverter/Model/Repository/BaseRepository;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "delete", "", "currencyTable", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "deleteAll", "getAll", "getFirst", "Landroidx/lifecycle/LiveData;", "", "insert", "requestCurrency", "currencyRequestModel", "Lcom/example/currencyconverter/Model/Entity/CurrencyRequestModel;", "reset", "update", "Companion", "DeleteAllMediaAsyncTask", "DeleteMediaAsyncTask", "InsertMediaAsyncTask", "UpdateMediaAsyncTask", "app_debug"})
public final class CurrencyRepository implements com.example.currencyconverter.Model.Repository.BaseRepository {
    private com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO;
    @org.jetbrains.annotations.Nullable()
    private static com.example.currencyconverter.Model.Repository.CurrencyRepository currencyRepository;
    public static final com.example.currencyconverter.Model.Repository.CurrencyRepository.Companion Companion = null;
    
    public final void requestCurrency(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Entity.CurrencyRequestModel currencyRequestModel) {
    }
    
    @java.lang.Override()
    public void insert(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable) {
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    com.example.currencyconverter.Model.Room.Table.CurrencyTable currencyTable) {
    }
    
    @java.lang.Override()
    public void deleteAll() {
    }
    
    public final void reset() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.currencyconverter.Model.Room.Table.CurrencyTable>> getFirst() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.currencyconverter.Model.Room.Table.CurrencyTable getAll() {
        return null;
    }
    
    public CurrencyRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository$InsertMediaAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "Ljava/lang/Void;", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "(Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;)V", "doInBackground", "currencyEntities", "", "([Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;)Ljava/lang/Void;", "app_debug"})
    static final class InsertMediaAsyncTask extends android.os.AsyncTask<com.example.currencyconverter.Model.Room.Table.CurrencyTable, java.lang.Void, java.lang.Void> {
        private final com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.Table.CurrencyTable... currencyEntities) {
            return null;
        }
        
        public InsertMediaAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository$UpdateMediaAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "Ljava/lang/Void;", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "(Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;)V", "doInBackground", "currencyEntities", "", "([Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;)Ljava/lang/Void;", "app_debug"})
    static final class UpdateMediaAsyncTask extends android.os.AsyncTask<com.example.currencyconverter.Model.Room.Table.CurrencyTable, java.lang.Void, java.lang.Void> {
        private final com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.Table.CurrencyTable... currencyEntities) {
            return null;
        }
        
        public UpdateMediaAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository$DeleteMediaAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "Ljava/lang/Void;", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "(Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;)V", "doInBackground", "currencyEntities", "", "([Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;)Ljava/lang/Void;", "app_debug"})
    static final class DeleteMediaAsyncTask extends android.os.AsyncTask<com.example.currencyconverter.Model.Room.Table.CurrencyTable, java.lang.Void, java.lang.Void> {
        private final com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.Table.CurrencyTable... currencyEntities) {
            return null;
        }
        
        public DeleteMediaAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\t\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository$DeleteAllMediaAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;", "Ljava/lang/Void;", "currencyDAO", "Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;", "(Lcom/example/currencyconverter/Model/Room/DataAccessObject/CurrencyDAO;)V", "doInBackground", "currencyEntities", "", "([Lcom/example/currencyconverter/Model/Room/Table/CurrencyTable;)Ljava/lang/Void;", "app_debug"})
    static final class DeleteAllMediaAsyncTask extends android.os.AsyncTask<com.example.currencyconverter.Model.Room.Table.CurrencyTable, java.lang.Void, java.lang.Void> {
        private final com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.Table.CurrencyTable... currencyEntities) {
            return null;
        }
        
        public DeleteAllMediaAsyncTask(@org.jetbrains.annotations.NotNull()
        com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO currencyDAO) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/currencyconverter/Model/Repository/CurrencyRepository$Companion;", "", "()V", "currencyRepository", "Lcom/example/currencyconverter/Model/Repository/CurrencyRepository;", "getCurrencyRepository", "()Lcom/example/currencyconverter/Model/Repository/CurrencyRepository;", "setCurrencyRepository", "(Lcom/example/currencyconverter/Model/Repository/CurrencyRepository;)V", "getInstance", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.currencyconverter.Model.Repository.CurrencyRepository getCurrencyRepository() {
            return null;
        }
        
        public final void setCurrencyRepository(@org.jetbrains.annotations.Nullable()
        com.example.currencyconverter.Model.Repository.CurrencyRepository p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.currencyconverter.Model.Repository.CurrencyRepository getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}