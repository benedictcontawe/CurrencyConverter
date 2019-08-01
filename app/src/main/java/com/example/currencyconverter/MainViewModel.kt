package com.example.currencyconverter

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.currencyconverter.Model.Repository.CurrencyRepository
import com.example.currencyconverter.Model.Entity.CurrencyRequestModel
import com.example.currencyconverter.Model.Entity.CurrencyResponseModel
import com.google.gson.Gson

public class MainViewModel : AndroidViewModel {

    private lateinit var repository : CurrencyRepository
    private lateinit var status: MutableLiveData<String> //You have converted [fromAmount] [fromCurrency] to [amount] [toCurrency].

    constructor(application: Application) : super(application){
        repository = CurrencyRepository.getInstance(application)
    }

    fun getStatus(): LiveData<String> {
        return status
    }

    fun requestCurrency(fromAmount : String, fromCurrency : String, toCurrency : String){
        val currencyRequestModel : CurrencyRequestModel = CurrencyRequestModel(fromAmount,fromCurrency,toCurrency)
        repository.requestCurrency(currencyRequestModel)
        this.status.setValue("")
    }

    fun readGSON() : String{
        val gson : Gson = Gson()
        var json : String = "{\"amount\":\"40468\",\"currency\":\"JPY\"}"
        val currencyResponseModel: CurrencyResponseModel = gson.fromJson(json, CurrencyResponseModel::class.java)
        currencyResponseModel.Amount
        currencyResponseModel.Currency

        return  "${currencyResponseModel.Amount} ${currencyResponseModel.Currency}"
    }
}