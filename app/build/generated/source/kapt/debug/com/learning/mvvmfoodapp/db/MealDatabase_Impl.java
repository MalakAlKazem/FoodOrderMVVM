package com.learning.mvvmfoodapp.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MealDatabase_Impl extends MealDatabase {
  private volatile MealDao _mealDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `mealInformation` (`dateModified` TEXT, `idMeal` TEXT NOT NULL, `strArea` TEXT, `strCategory` TEXT, `strCreativeCommonsConfirmed` TEXT, `strDrinkAlternate` TEXT, `strImageSource` TEXT, `strIngredient1` TEXT, `strIngredient10` TEXT, `strIngredient11` TEXT, `strIngredient12` TEXT, `strIngredient13` TEXT, `strIngredient14` TEXT, `strIngredient15` TEXT, `strIngredient16` TEXT, `strIngredient17` TEXT, `strIngredient18` TEXT, `strIngredient19` TEXT, `strIngredient2` TEXT, `strIngredient20` TEXT, `strIngredient3` TEXT, `strIngredient4` TEXT, `strIngredient5` TEXT, `strIngredient6` TEXT, `strIngredient7` TEXT, `strIngredient8` TEXT, `strIngredient9` TEXT, `strInstructions` TEXT, `strMeal` TEXT, `strMealThumb` TEXT, `strMeasure1` TEXT, `strMeasure10` TEXT, `strMeasure11` TEXT, `strMeasure12` TEXT, `strMeasure13` TEXT, `strMeasure14` TEXT, `strMeasure15` TEXT, `strMeasure16` TEXT, `strMeasure17` TEXT, `strMeasure18` TEXT, `strMeasure19` TEXT, `strMeasure2` TEXT, `strMeasure20` TEXT, `strMeasure3` TEXT, `strMeasure4` TEXT, `strMeasure5` TEXT, `strMeasure6` TEXT, `strMeasure7` TEXT, `strMeasure8` TEXT, `strMeasure9` TEXT, `strSource` TEXT, `strTags` TEXT, `strYoutube` TEXT, PRIMARY KEY(`idMeal`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '32fb9fe233d732af27e8f2c98ba5ad5c')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `mealInformation`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsMealInformation = new HashMap<String, TableInfo.Column>(53);
        _columnsMealInformation.put("dateModified", new TableInfo.Column("dateModified", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("idMeal", new TableInfo.Column("idMeal", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strArea", new TableInfo.Column("strArea", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strCategory", new TableInfo.Column("strCategory", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strCreativeCommonsConfirmed", new TableInfo.Column("strCreativeCommonsConfirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strDrinkAlternate", new TableInfo.Column("strDrinkAlternate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strImageSource", new TableInfo.Column("strImageSource", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient1", new TableInfo.Column("strIngredient1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient10", new TableInfo.Column("strIngredient10", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient11", new TableInfo.Column("strIngredient11", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient12", new TableInfo.Column("strIngredient12", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient13", new TableInfo.Column("strIngredient13", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient14", new TableInfo.Column("strIngredient14", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient15", new TableInfo.Column("strIngredient15", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient16", new TableInfo.Column("strIngredient16", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient17", new TableInfo.Column("strIngredient17", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient18", new TableInfo.Column("strIngredient18", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient19", new TableInfo.Column("strIngredient19", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient2", new TableInfo.Column("strIngredient2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient20", new TableInfo.Column("strIngredient20", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient3", new TableInfo.Column("strIngredient3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient4", new TableInfo.Column("strIngredient4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient5", new TableInfo.Column("strIngredient5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient6", new TableInfo.Column("strIngredient6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient7", new TableInfo.Column("strIngredient7", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient8", new TableInfo.Column("strIngredient8", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strIngredient9", new TableInfo.Column("strIngredient9", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strInstructions", new TableInfo.Column("strInstructions", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeal", new TableInfo.Column("strMeal", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMealThumb", new TableInfo.Column("strMealThumb", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure1", new TableInfo.Column("strMeasure1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure10", new TableInfo.Column("strMeasure10", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure11", new TableInfo.Column("strMeasure11", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure12", new TableInfo.Column("strMeasure12", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure13", new TableInfo.Column("strMeasure13", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure14", new TableInfo.Column("strMeasure14", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure15", new TableInfo.Column("strMeasure15", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure16", new TableInfo.Column("strMeasure16", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure17", new TableInfo.Column("strMeasure17", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure18", new TableInfo.Column("strMeasure18", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure19", new TableInfo.Column("strMeasure19", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure2", new TableInfo.Column("strMeasure2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure20", new TableInfo.Column("strMeasure20", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure3", new TableInfo.Column("strMeasure3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure4", new TableInfo.Column("strMeasure4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure5", new TableInfo.Column("strMeasure5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure6", new TableInfo.Column("strMeasure6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure7", new TableInfo.Column("strMeasure7", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure8", new TableInfo.Column("strMeasure8", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strMeasure9", new TableInfo.Column("strMeasure9", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strSource", new TableInfo.Column("strSource", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strTags", new TableInfo.Column("strTags", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMealInformation.put("strYoutube", new TableInfo.Column("strYoutube", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMealInformation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMealInformation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMealInformation = new TableInfo("mealInformation", _columnsMealInformation, _foreignKeysMealInformation, _indicesMealInformation);
        final TableInfo _existingMealInformation = TableInfo.read(db, "mealInformation");
        if (!_infoMealInformation.equals(_existingMealInformation)) {
          return new RoomOpenHelper.ValidationResult(false, "mealInformation(com.learning.mvvmfoodapp.pogo.Meal).\n"
                  + " Expected:\n" + _infoMealInformation + "\n"
                  + " Found:\n" + _existingMealInformation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "32fb9fe233d732af27e8f2c98ba5ad5c", "e6688c666f764956d90e755a627b250a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "mealInformation");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `mealInformation`");
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
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MealDao.class, MealDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public MealDao mealDao() {
    if (_mealDao != null) {
      return _mealDao;
    } else {
      synchronized(this) {
        if(_mealDao == null) {
          _mealDao = new MealDao_Impl(this);
        }
        return _mealDao;
      }
    }
  }
}
