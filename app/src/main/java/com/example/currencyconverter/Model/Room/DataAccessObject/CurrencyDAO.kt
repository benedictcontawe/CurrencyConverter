package com.example.currencyconverter.Model.Room.DataAccessObject

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.currencyconverter.Model.Room.Table.CurrencyTable

interface CurrencyDAO {

    @Insert
    fun insert(currencyTable : CurrencyTable)

    @Update
    fun update(currencyTable : CurrencyTable)

    @Delete
    abstract fun delete(currencyTable : CurrencyTable)

    @Query("DELETE FROM currency_table")
    abstract fun deleteAll()

    @Query("SELECT * FROM currency_table ORDER BY Id ASC LIMIT 1")
    fun getFirst() : LiveData<List<CurrencyTable>>

    @Query("SELECT * FROM currency_table")
    fun getAll() : LiveData<List<CurrencyTable>>
}