package com.example.currencyconverter.Model.Repository

import android.app.Application
import android.content.Context
import android.os.AsyncTask
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.currencyconverter.Model.Entity.CurrencyRequestModel
import com.example.currencyconverter.Model.Entity.CurrencyResponseModel
import com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO
import com.example.currencyconverter.Model.Room.Database.CurrencyDatabase
import com.example.currencyconverter.Model.Room.Table.CurrencyTable
import com.example.currencyconverter.Model.WebService.CurrencyAPI
import com.example.currencyconverter.Model.WebService.NetworkClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

public class CurrencyRepository : BaseRepository {

    companion object {
        var currencyRepository : CurrencyRepository? = null

        fun getInstance(application : Application) : CurrencyRepository {
            /*
            if (currencyRepository == null) {
                return CurrencyRepository(application)
            }
            return currencyRepository!!
            */
            return  currencyRepository?:CurrencyRepository(application)
        }
    }

    private lateinit var currencyDAO : CurrencyDAO

    constructor(application: Application) {
        val database = CurrencyDatabase.getDatabase(application as Context)
        this.currencyDAO = database.currencyDAO()
    }

    fun requestCurrency(currencyRequestModel: CurrencyRequestModel) {
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

                update(
                    CurrencyTable(
                        currencyRequestModel.fromAmount?:"0.00",
                        currencyRequestModel.fromCurrency?:"Null",
                        currencyResponseModels.Amount?:"0.00",
                        currencyResponseModels.Currency?:"Null"
                    )
                )
            }

            override fun onFailure(call: Call<CurrencyResponseModel>, throwable: Throwable) {
                Log.e("CurrencyRepository","Callback $throwable")
            }

        })
    }
    //region CRUD Operation Basic
    override fun insert(currencyTable: CurrencyTable) {
        InsertMediaAsyncTask(currencyDAO).execute(currencyTable)
        //currencyDAO?.let { InsertMediaAsyncTask(it).execute(currencyTable) }
    }

    override fun update(currencyTable: CurrencyTable) {
        UpdateMediaAsyncTask(currencyDAO).execute(currencyTable)
        //currencyDAO?.let { UpdateMediaAsyncTask(it).execute(currencyTable) }
    }

    override fun delete(currencyTable: CurrencyTable) {
        DeleteMediaAsyncTask(currencyDAO).execute(currencyTable)
        //currencyDAO?.let { DeleteMediaAsyncTask(it).execute(currencyTable) }
    }

    override fun deleteAll() {
        DeleteAllMediaAsyncTask(currencyDAO).execute()
        //currencyDAO.let { DeleteAllMediaAsyncTask(it).execute() }
    }
    //endregion
    //region  Query
    public fun reset(){
        deleteAll()
        insert(
            CurrencyTable(
                "0.00",
                "0.00",
                "0.00",
                "0.00"
            )
        )
    }

    public fun getFirst() : LiveData<List<CurrencyTable>> {
        return this.currencyDAO.getFirst()
    }

    public fun getAll() : CurrencyTable {
        return this.currencyDAO.getAll()
    }
    //endregion
    //region Async Task Class For Repository
    private class InsertMediaAsyncTask internal constructor(private val currencyDAO: CurrencyDAO) :
        AsyncTask<CurrencyTable, Void, Void>() {

        override fun doInBackground(vararg currencyEntities: CurrencyTable): Void? {
            currencyDAO.insert(currencyEntities[0])
            return null
        }
    }

    private class UpdateMediaAsyncTask internal constructor(private val currencyDAO: CurrencyDAO) :
        AsyncTask<CurrencyTable, Void, Void>() {

        override fun doInBackground(vararg currencyEntities: CurrencyTable): Void? {
            currencyDAO.update(currencyEntities[0])
            return null
        }
    }

    private class DeleteMediaAsyncTask internal constructor(private val currencyDAO: CurrencyDAO) :
        AsyncTask<CurrencyTable, Void, Void>() {

        override fun doInBackground(vararg currencyEntities: CurrencyTable): Void? {
            currencyDAO.delete(currencyEntities[0])
            return null
        }
    }

    private class DeleteAllMediaAsyncTask internal constructor(private val currencyDAO: CurrencyDAO) :
        AsyncTask<CurrencyTable, Void, Void>() {


        override fun doInBackground(vararg currencyEntities: CurrencyTable): Void? {
            currencyDAO.deleteAll()
            return null
        }
    }
    //endregion
}