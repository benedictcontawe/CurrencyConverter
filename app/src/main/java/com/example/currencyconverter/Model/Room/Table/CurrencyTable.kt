package com.example.currencyconverter.Model.Room.Table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "currency_table")
class CurrencyTable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Id")
    private var id : Int? = null

    @ColumnInfo(name = "Amount")
    private var fromAmount : String? = null

    @ColumnInfo(name = "Currency")
    private var fromCurrency : String? = null

    @ColumnInfo(name = "Converted Currency")
    private var toCurrency : String? = null

    constructor(fromAmount : String, fromCurrency : String, toCurrency : String){
        this.id = 1
        this.fromAmount = fromAmount
        this.fromCurrency = fromCurrency
        this.toCurrency = toCurrency
    }

    fun getAmount() : String {
        return fromAmount?:"0.00"
    }

    fun getCurrency() : String {
        return fromCurrency?:"0.00"
    }

    fun getLatestCurrency() : String {
        return toCurrency?:"0.00"
    }
}