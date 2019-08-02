package com.example.currencyconverter.Model.Repository

import com.example.currencyconverter.Model.Room.Table.CurrencyTable

interface BaseRepository {

    abstract fun insert(currencyTable: CurrencyTable)

    abstract fun update(currencyTable: CurrencyTable)

    abstract fun delete(currencyTable: CurrencyTable)

    abstract fun deleteAll()
}