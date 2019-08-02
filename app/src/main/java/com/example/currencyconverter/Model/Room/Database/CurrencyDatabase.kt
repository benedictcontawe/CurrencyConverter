package com.example.currencyconverter.Model.Room.Database

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO
import com.example.currencyconverter.Model.Room.Table.CurrencyTable

@Database(entities = [CurrencyTable::class], version = 1)
public  abstract class CurrencyDatabase : RoomDatabase() {

    abstract fun currencyDAO(): CurrencyDAO

    companion object{
        private var instance : CurrencyDatabase? = null

        @Synchronized
        fun getInstance(context: Context): CurrencyDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    CurrencyDatabase::class.java, "media_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build()
            }

            return instance
        }

        private val roomCallback = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                PopulateDatabaseAsyncTask(instance).execute()
            }

            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
            }
        }

        private class PopulateDatabaseAsyncTask : AsyncTask<Void, Void, Void> {
            private lateinit var currencyDAO: CurrencyDAO

            constructor(db: CurrencyDatabase?){
                currencyDAO = db?.currencyDAO()!!
            }

            override fun doInBackground(vararg voids: Void): Void? {
                currencyDAO.insert(CurrencyTable("USB","VIDEO","video.mp4"));
                return null
            }
        }
    }
}