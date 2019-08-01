package com.example.currencyconverter.Model.Repository

import android.app.Application
import android.util.Log
import com.example.currencyconverter.Model.Entity.CurrencyRequestModel
import com.example.currencyconverter.Model.Entity.CurrencyResponseModel
import com.example.currencyconverter.Model.WebService.CurrencyAPI
import com.example.currencyconverter.Model.WebService.NetworkClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CurrencyRepository(application: Application) : BaseRepository{

    companion object {
        var currencyRepository : CurrencyRepository? = null

        fun getInstance(application : Application) : CurrencyRepository {
            if (currencyRepository == null) {
                return CurrencyRepository(application)
            }
            else {
                return currencyRepository as CurrencyRepository
            }
        }
    }

    fun requestCurrency(currencyRequestModel: CurrencyRequestModel){
        //Obtain an instance of Retrofit by calling the static method.
        val retrofit = NetworkClient.provideOkHttpClient()

        var currencyAPI : CurrencyAPI = retrofit!!.create(CurrencyAPI::class.java)

        var call = currencyAPI.getCurrencyDatils(currencyRequestModel.fromAmount?:"0.00",currencyRequestModel.fromCurrency?:"EUR",currencyRequestModel.toCurrency?:"USD")

        call.enqueue(object : Callback<CurrencyResponseModel> {

            override fun onResponse(call: Call<CurrencyResponseModel>, response: Response<CurrencyResponseModel>) {
                if (!response.isSuccessful) {
                    return
                }

                response.body()

                val currencyResponseModels : CurrencyResponseModel = response.body()!!


                Log.e("CurrencyRepository","${currencyResponseModels.Amount} ${currencyResponseModels.Currency}")
            }

            override fun onFailure(call: Call<CurrencyResponseModel>, throwable: Throwable) {
                Log.e("CurrencyRepository","Callback $throwable")
            }

        })
    }
}