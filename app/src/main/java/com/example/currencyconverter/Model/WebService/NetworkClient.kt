package com.example.currencyconverter.Model.WebService

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class NetworkClient {
    companion object{
        private val BASE_URL = "http://api.evp.lt"
        private var retrofit: Retrofit? = null
        /*
        This public static method will return Retrofit client
        anywhere in the appplication
        */
        fun provideOkHttpClient(): Retrofit? {
            //If condition to ensure we don't create multiple retrofit instances in a single application
            if (retrofit == null) {
                //Defining the Retrofit using Builder
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL) //This is the only mandatory call on Builder object.
                    .addConverterFactory(GsonConverterFactory.create()) // Convertor library used to convert response into POJO
                    .build()
            }
            return retrofit
        }
    }
}