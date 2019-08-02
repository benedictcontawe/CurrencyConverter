package com.example.currencyconverter.Model.WebService;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/currencyconverter/Model/WebService/NetworkClient;", "", "()V", "Companion", "app_debug"})
public final class NetworkClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "http://api.evp.lt";
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retrofit;
    public static final com.example.currencyconverter.Model.WebService.NetworkClient.Companion Companion = null;
    
    public NetworkClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/currencyconverter/Model/WebService/NetworkClient$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "provideOkHttpClient", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetrofit() {
            return null;
        }
        
        public final void setRetrofit(@org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit provideOkHttpClient() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}