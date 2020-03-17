package com.example.currencyconverter

import com.example.currencyconverter.Model.Entity.CurrencyResponseModel
import com.google.gson.Gson
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun readGSON() {
        val gson : Gson = Gson()
        var json : String = "{\"amount\":\"40468\",\"currency\":\"JPY\"}"
        val currencyResponseModel: CurrencyResponseModel = gson.fromJson(json, CurrencyResponseModel::class.java)
        currencyResponseModel.Amount
        currencyResponseModel.Currency

        Assert.assertEquals(true,currencyResponseModel.Amount!!.isNotEmpty() && currencyResponseModel.Currency!!.isNotEmpty())
        //return  "${currencyResponseModel.Amount} ${currencyResponseModel.Currency}"
    }
}
