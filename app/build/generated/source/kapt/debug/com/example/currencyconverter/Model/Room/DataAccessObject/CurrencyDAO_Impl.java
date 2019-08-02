package com.example.currencyconverter.Model.Room.DataAccessObject;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.currencyconverter.Model.Room.Table.CurrencyTable;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrencyDAO_Impl implements CurrencyDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfCurrencyTable;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfCurrencyTable;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfCurrencyTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CurrencyDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrencyTable = new EntityInsertionAdapter<CurrencyTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `currency_table`(`Id`,`CurrentAmount`,`CurrentCurrency`,`ConvertedAmount`,`ConvertedCurrency`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrencyTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getFromAmount() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFromAmount());
        }
        if (value.getFromCurrency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFromCurrency());
        }
        if (value.getToAmount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getToAmount());
        }
        if (value.getToCurrency() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getToCurrency());
        }
      }
    };
    this.__deletionAdapterOfCurrencyTable = new EntityDeletionOrUpdateAdapter<CurrencyTable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `currency_table` WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrencyTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfCurrencyTable = new EntityDeletionOrUpdateAdapter<CurrencyTable>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `currency_table` SET `Id` = ?,`CurrentAmount` = ?,`CurrentCurrency` = ?,`ConvertedAmount` = ?,`ConvertedCurrency` = ? WHERE `Id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrencyTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getFromAmount() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFromAmount());
        }
        if (value.getFromCurrency() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFromCurrency());
        }
        if (value.getToAmount() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getToAmount());
        }
        if (value.getToCurrency() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getToCurrency());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM currency_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final CurrencyTable currencyTable) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCurrencyTable.insert(currencyTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final CurrencyTable currencyTable) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCurrencyTable.handle(currencyTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final CurrencyTable currencyTable) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCurrencyTable.handle(currencyTable);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public LiveData<List<CurrencyTable>> getFirst() {
    final String _sql = "SELECT * FROM currency_table WHERE Id = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"currency_table"}, false, new Callable<List<CurrencyTable>>() {
      @Override
      public List<CurrencyTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
          final int _cursorIndexOfFromAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "CurrentAmount");
          final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "CurrentCurrency");
          final int _cursorIndexOfToAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "ConvertedAmount");
          final int _cursorIndexOfToCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "ConvertedCurrency");
          final List<CurrencyTable> _result = new ArrayList<CurrencyTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CurrencyTable _item;
            final String _tmpFromAmount;
            _tmpFromAmount = _cursor.getString(_cursorIndexOfFromAmount);
            final String _tmpFromCurrency;
            _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
            final String _tmpToAmount;
            _tmpToAmount = _cursor.getString(_cursorIndexOfToAmount);
            final String _tmpToCurrency;
            _tmpToCurrency = _cursor.getString(_cursorIndexOfToCurrency);
            _item = new CurrencyTable(_tmpFromAmount,_tmpFromCurrency,_tmpToAmount,_tmpToCurrency);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public CurrencyTable getAll() {
    final String _sql = "SELECT * FROM currency_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "Id");
      final int _cursorIndexOfFromAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "CurrentAmount");
      final int _cursorIndexOfFromCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "CurrentCurrency");
      final int _cursorIndexOfToAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "ConvertedAmount");
      final int _cursorIndexOfToCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "ConvertedCurrency");
      final CurrencyTable _result;
      if(_cursor.moveToFirst()) {
        final String _tmpFromAmount;
        _tmpFromAmount = _cursor.getString(_cursorIndexOfFromAmount);
        final String _tmpFromCurrency;
        _tmpFromCurrency = _cursor.getString(_cursorIndexOfFromCurrency);
        final String _tmpToAmount;
        _tmpToAmount = _cursor.getString(_cursorIndexOfToAmount);
        final String _tmpToCurrency;
        _tmpToCurrency = _cursor.getString(_cursorIndexOfToCurrency);
        _result = new CurrencyTable(_tmpFromAmount,_tmpFromCurrency,_tmpToAmount,_tmpToCurrency);
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
