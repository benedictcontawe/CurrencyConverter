package com.example.currencyconverter.Model.Room.Database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO;
import com.example.currencyconverter.Model.Room.DataAccessObject.CurrencyDAO_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDatabase_Impl extends CurrencyDatabase {
  private volatile CurrencyDAO _currencyDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `currency_table` (`Id` INTEGER NOT NULL, `CurrentAmount` TEXT, `CurrentCurrency` TEXT, `ConvertedAmount` TEXT, `ConvertedCurrency` TEXT, PRIMARY KEY(`Id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'edf064c324149d58f0ff89e0ccb1c881')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `currency_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrencyTable = new HashMap<String, TableInfo.Column>(5);
        _columnsCurrencyTable.put("Id", new TableInfo.Column("Id", "INTEGER", true, 1));
        _columnsCurrencyTable.put("CurrentAmount", new TableInfo.Column("CurrentAmount", "TEXT", false, 0));
        _columnsCurrencyTable.put("CurrentCurrency", new TableInfo.Column("CurrentCurrency", "TEXT", false, 0));
        _columnsCurrencyTable.put("ConvertedAmount", new TableInfo.Column("ConvertedAmount", "TEXT", false, 0));
        _columnsCurrencyTable.put("ConvertedCurrency", new TableInfo.Column("ConvertedCurrency", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrencyTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrencyTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrencyTable = new TableInfo("currency_table", _columnsCurrencyTable, _foreignKeysCurrencyTable, _indicesCurrencyTable);
        final TableInfo _existingCurrencyTable = TableInfo.read(_db, "currency_table");
        if (! _infoCurrencyTable.equals(_existingCurrencyTable)) {
          throw new IllegalStateException("Migration didn't properly handle currency_table(com.example.currencyconverter.Model.Room.Table.CurrencyTable).\n"
                  + " Expected:\n" + _infoCurrencyTable + "\n"
                  + " Found:\n" + _existingCurrencyTable);
        }
      }
    }, "edf064c324149d58f0ff89e0ccb1c881", "02dd2b7d7a9518eea6604252a191642b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "currency_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `currency_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CurrencyDAO currencyDAO() {
    if (_currencyDAO != null) {
      return _currencyDAO;
    } else {
      synchronized(this) {
        if(_currencyDAO == null) {
          _currencyDAO = new CurrencyDAO_Impl(this);
        }
        return _currencyDAO;
      }
    }
  }
}
