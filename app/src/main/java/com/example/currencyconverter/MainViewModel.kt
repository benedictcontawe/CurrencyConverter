package com.example.currencyconverter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.currencyconverter.Model.Repository.CurrencyRepository
import com.example.currencyconverter.Model.Entity.CurrencyRequestModel
import com.example.currencyconverter.Model.Entity.CurrencyResponseModel
import com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO
import com.example.currencyconverter.Model.Room.Table.CurrencyTable
import com.google.gson.Gson

public class MainViewModel : AndroidViewModel {

    private lateinit var repository : CurrencyRepository

    constructor(application: Application) : super(application){
        repository = CurrencyRepository.getInstance(application)

        repository.reset()
    }

    fun getCurrency() : LiveData<List<CurrencyTable>> {
        return repository.getFirst()
    }

    fun requestCurrency(fromAmount : String, fromCurrency : String, toCurrency : String) {
        val currencyRequestModel : CurrencyRequestModel = CurrencyRequestModel(fromAmount,fromCurrency,toCurrency)
        repository.requestCurrency(currencyRequestModel)
    }

    @Deprecated("Use readGSON method in ExampleUnitTest class")
    fun readGSON() : String {
        val gson : Gson = Gson()
        var json : String = "{\"amount\":\"40468\",\"currency\":\"JPY\"}"
        val currencyResponseModel: CurrencyResponseModel = gson.fromJson(json, CurrencyResponseModel::class.java)
        currencyResponseModel.Amount
        currencyResponseModel.Currency

        return  "${currencyResponseModel.Amount} ${currencyResponseModel.Currency}"
    }
}