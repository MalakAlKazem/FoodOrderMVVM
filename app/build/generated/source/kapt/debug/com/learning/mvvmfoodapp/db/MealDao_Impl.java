package com.learning.mvvmfoodapp.db;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.learning.mvvmfoodapp.pogo.Meal;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MealDao_Impl implements MealDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Meal> __insertionAdapterOfMeal;

  private final MealTypeConverter __mealTypeConverter = new MealTypeConverter();

  private final EntityDeletionOrUpdateAdapter<Meal> __deletionAdapterOfMeal;

  public MealDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMeal = new EntityInsertionAdapter<Meal>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `mealInformation` (`dateModified`,`idMeal`,`strArea`,`strCategory`,`strCreativeCommonsConfirmed`,`strDrinkAlternate`,`strImageSource`,`strIngredient1`,`strIngredient10`,`strIngredient11`,`strIngredient12`,`strIngredient13`,`strIngredient14`,`strIngredient15`,`strIngredient16`,`strIngredient17`,`strIngredient18`,`strIngredient19`,`strIngredient2`,`strIngredient20`,`strIngredient3`,`strIngredient4`,`strIngredient5`,`strIngredient6`,`strIngredient7`,`strIngredient8`,`strIngredient9`,`strInstructions`,`strMeal`,`strMealThumb`,`strMeasure1`,`strMeasure10`,`strMeasure11`,`strMeasure12`,`strMeasure13`,`strMeasure14`,`strMeasure15`,`strMeasure16`,`strMeasure17`,`strMeasure18`,`strMeasure19`,`strMeasure2`,`strMeasure20`,`strMeasure3`,`strMeasure4`,`strMeasure5`,`strMeasure6`,`strMeasure7`,`strMeasure8`,`strMeasure9`,`strSource`,`strTags`,`strYoutube`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Meal entity) {
        final String _tmp = __mealTypeConverter.fromAnyToString(entity.getDateModified());
        if (_tmp == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, _tmp);
        }
        if (entity.getIdMeal() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getIdMeal());
        }
        if (entity.getStrArea() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getStrArea());
        }
        if (entity.getStrCategory() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStrCategory());
        }
        final String _tmp_1 = __mealTypeConverter.fromAnyToString(entity.getStrCreativeCommonsConfirmed());
        if (_tmp_1 == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, _tmp_1);
        }
        final String _tmp_2 = __mealTypeConverter.fromAnyToString(entity.getStrDrinkAlternate());
        if (_tmp_2 == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, _tmp_2);
        }
        final String _tmp_3 = __mealTypeConverter.fromAnyToString(entity.getStrImageSource());
        if (_tmp_3 == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, _tmp_3);
        }
        if (entity.getStrIngredient1() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getStrIngredient1());
        }
        if (entity.getStrIngredient10() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getStrIngredient10());
        }
        if (entity.getStrIngredient11() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getStrIngredient11());
        }
        if (entity.getStrIngredient12() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getStrIngredient12());
        }
        if (entity.getStrIngredient13() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getStrIngredient13());
        }
        if (entity.getStrIngredient14() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getStrIngredient14());
        }
        if (entity.getStrIngredient15() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getStrIngredient15());
        }
        if (entity.getStrIngredient16() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getStrIngredient16());
        }
        if (entity.getStrIngredient17() == null) {
          statement.bindNull(16);
        } else {
          statement.bindString(16, entity.getStrIngredient17());
        }
        if (entity.getStrIngredient18() == null) {
          statement.bindNull(17);
        } else {
          statement.bindString(17, entity.getStrIngredient18());
        }
        if (entity.getStrIngredient19() == null) {
          statement.bindNull(18);
        } else {
          statement.bindString(18, entity.getStrIngredient19());
        }
        if (entity.getStrIngredient2() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getStrIngredient2());
        }
        if (entity.getStrIngredient20() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getStrIngredient20());
        }
        if (entity.getStrIngredient3() == null) {
          statement.bindNull(21);
        } else {
          statement.bindString(21, entity.getStrIngredient3());
        }
        if (entity.getStrIngredient4() == null) {
          statement.bindNull(22);
        } else {
          statement.bindString(22, entity.getStrIngredient4());
        }
        if (entity.getStrIngredient5() == null) {
          statement.bindNull(23);
        } else {
          statement.bindString(23, entity.getStrIngredient5());
        }
        if (entity.getStrIngredient6() == null) {
          statement.bindNull(24);
        } else {
          statement.bindString(24, entity.getStrIngredient6());
        }
        if (entity.getStrIngredient7() == null) {
          statement.bindNull(25);
        } else {
          statement.bindString(25, entity.getStrIngredient7());
        }
        if (entity.getStrIngredient8() == null) {
          statement.bindNull(26);
        } else {
          statement.bindString(26, entity.getStrIngredient8());
        }
        if (entity.getStrIngredient9() == null) {
          statement.bindNull(27);
        } else {
          statement.bindString(27, entity.getStrIngredient9());
        }
        if (entity.getStrInstructions() == null) {
          statement.bindNull(28);
        } else {
          statement.bindString(28, entity.getStrInstructions());
        }
        if (entity.getStrMeal() == null) {
          statement.bindNull(29);
        } else {
          statement.bindString(29, entity.getStrMeal());
        }
        if (entity.getStrMealThumb() == null) {
          statement.bindNull(30);
        } else {
          statement.bindString(30, entity.getStrMealThumb());
        }
        if (entity.getStrMeasure1() == null) {
          statement.bindNull(31);
        } else {
          statement.bindString(31, entity.getStrMeasure1());
        }
        if (entity.getStrMeasure10() == null) {
          statement.bindNull(32);
        } else {
          statement.bindString(32, entity.getStrMeasure10());
        }
        if (entity.getStrMeasure11() == null) {
          statement.bindNull(33);
        } else {
          statement.bindString(33, entity.getStrMeasure11());
        }
        if (entity.getStrMeasure12() == null) {
          statement.bindNull(34);
        } else {
          statement.bindString(34, entity.getStrMeasure12());
        }
        if (entity.getStrMeasure13() == null) {
          statement.bindNull(35);
        } else {
          statement.bindString(35, entity.getStrMeasure13());
        }
        if (entity.getStrMeasure14() == null) {
          statement.bindNull(36);
        } else {
          statement.bindString(36, entity.getStrMeasure14());
        }
        if (entity.getStrMeasure15() == null) {
          statement.bindNull(37);
        } else {
          statement.bindString(37, entity.getStrMeasure15());
        }
        if (entity.getStrMeasure16() == null) {
          statement.bindNull(38);
        } else {
          statement.bindString(38, entity.getStrMeasure16());
        }
        if (entity.getStrMeasure17() == null) {
          statement.bindNull(39);
        } else {
          statement.bindString(39, entity.getStrMeasure17());
        }
        if (entity.getStrMeasure18() == null) {
          statement.bindNull(40);
        } else {
          statement.bindString(40, entity.getStrMeasure18());
        }
        if (entity.getStrMeasure19() == null) {
          statement.bindNull(41);
        } else {
          statement.bindString(41, entity.getStrMeasure19());
        }
        if (entity.getStrMeasure2() == null) {
          statement.bindNull(42);
        } else {
          statement.bindString(42, entity.getStrMeasure2());
        }
        if (entity.getStrMeasure20() == null) {
          statement.bindNull(43);
        } else {
          statement.bindString(43, entity.getStrMeasure20());
        }
        if (entity.getStrMeasure3() == null) {
          statement.bindNull(44);
        } else {
          statement.bindString(44, entity.getStrMeasure3());
        }
        if (entity.getStrMeasure4() == null) {
          statement.bindNull(45);
        } else {
          statement.bindString(45, entity.getStrMeasure4());
        }
        if (entity.getStrMeasure5() == null) {
          statement.bindNull(46);
        } else {
          statement.bindString(46, entity.getStrMeasure5());
        }
        if (entity.getStrMeasure6() == null) {
          statement.bindNull(47);
        } else {
          statement.bindString(47, entity.getStrMeasure6());
        }
        if (entity.getStrMeasure7() == null) {
          statement.bindNull(48);
        } else {
          statement.bindString(48, entity.getStrMeasure7());
        }
        if (entity.getStrMeasure8() == null) {
          statement.bindNull(49);
        } else {
          statement.bindString(49, entity.getStrMeasure8());
        }
        if (entity.getStrMeasure9() == null) {
          statement.bindNull(50);
        } else {
          statement.bindString(50, entity.getStrMeasure9());
        }
        if (entity.getStrSource() == null) {
          statement.bindNull(51);
        } else {
          statement.bindString(51, entity.getStrSource());
        }
        final String _tmp_4 = __mealTypeConverter.fromAnyToString(entity.getStrTags());
        if (_tmp_4 == null) {
          statement.bindNull(52);
        } else {
          statement.bindString(52, _tmp_4);
        }
        if (entity.getStrYoutube() == null) {
          statement.bindNull(53);
        } else {
          statement.bindString(53, entity.getStrYoutube());
        }
      }
    };
    this.__deletionAdapterOfMeal = new EntityDeletionOrUpdateAdapter<Meal>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `mealInformation` WHERE `idMeal` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Meal entity) {
        if (entity.getIdMeal() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getIdMeal());
        }
      }
    };
  }

  @Override
  public Object upsert(final Meal meal, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMeal.insert(meal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final Meal meal, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMeal.handle(meal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Meal>> getAllMeals() {
    final String _sql = "SELECT * FROM mealInformation";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"mealInformation"}, false, new Callable<List<Meal>>() {
      @Override
      @Nullable
      public List<Meal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfDateModified = CursorUtil.getColumnIndexOrThrow(_cursor, "dateModified");
          final int _cursorIndexOfIdMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "idMeal");
          final int _cursorIndexOfStrArea = CursorUtil.getColumnIndexOrThrow(_cursor, "strArea");
          final int _cursorIndexOfStrCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "strCategory");
          final int _cursorIndexOfStrCreativeCommonsConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "strCreativeCommonsConfirmed");
          final int _cursorIndexOfStrDrinkAlternate = CursorUtil.getColumnIndexOrThrow(_cursor, "strDrinkAlternate");
          final int _cursorIndexOfStrImageSource = CursorUtil.getColumnIndexOrThrow(_cursor, "strImageSource");
          final int _cursorIndexOfStrIngredient1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient1");
          final int _cursorIndexOfStrIngredient10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient10");
          final int _cursorIndexOfStrIngredient11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient11");
          final int _cursorIndexOfStrIngredient12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient12");
          final int _cursorIndexOfStrIngredient13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient13");
          final int _cursorIndexOfStrIngredient14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient14");
          final int _cursorIndexOfStrIngredient15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient15");
          final int _cursorIndexOfStrIngredient16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient16");
          final int _cursorIndexOfStrIngredient17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient17");
          final int _cursorIndexOfStrIngredient18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient18");
          final int _cursorIndexOfStrIngredient19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient19");
          final int _cursorIndexOfStrIngredient2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient2");
          final int _cursorIndexOfStrIngredient20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient20");
          final int _cursorIndexOfStrIngredient3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient3");
          final int _cursorIndexOfStrIngredient4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient4");
          final int _cursorIndexOfStrIngredient5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient5");
          final int _cursorIndexOfStrIngredient6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient6");
          final int _cursorIndexOfStrIngredient7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient7");
          final int _cursorIndexOfStrIngredient8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient8");
          final int _cursorIndexOfStrIngredient9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strIngredient9");
          final int _cursorIndexOfStrInstructions = CursorUtil.getColumnIndexOrThrow(_cursor, "strInstructions");
          final int _cursorIndexOfStrMeal = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeal");
          final int _cursorIndexOfStrMealThumb = CursorUtil.getColumnIndexOrThrow(_cursor, "strMealThumb");
          final int _cursorIndexOfStrMeasure1 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure1");
          final int _cursorIndexOfStrMeasure10 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure10");
          final int _cursorIndexOfStrMeasure11 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure11");
          final int _cursorIndexOfStrMeasure12 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure12");
          final int _cursorIndexOfStrMeasure13 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure13");
          final int _cursorIndexOfStrMeasure14 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure14");
          final int _cursorIndexOfStrMeasure15 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure15");
          final int _cursorIndexOfStrMeasure16 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure16");
          final int _cursorIndexOfStrMeasure17 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure17");
          final int _cursorIndexOfStrMeasure18 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure18");
          final int _cursorIndexOfStrMeasure19 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure19");
          final int _cursorIndexOfStrMeasure2 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure2");
          final int _cursorIndexOfStrMeasure20 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure20");
          final int _cursorIndexOfStrMeasure3 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure3");
          final int _cursorIndexOfStrMeasure4 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure4");
          final int _cursorIndexOfStrMeasure5 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure5");
          final int _cursorIndexOfStrMeasure6 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure6");
          final int _cursorIndexOfStrMeasure7 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure7");
          final int _cursorIndexOfStrMeasure8 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure8");
          final int _cursorIndexOfStrMeasure9 = CursorUtil.getColumnIndexOrThrow(_cursor, "strMeasure9");
          final int _cursorIndexOfStrSource = CursorUtil.getColumnIndexOrThrow(_cursor, "strSource");
          final int _cursorIndexOfStrTags = CursorUtil.getColumnIndexOrThrow(_cursor, "strTags");
          final int _cursorIndexOfStrYoutube = CursorUtil.getColumnIndexOrThrow(_cursor, "strYoutube");
          final List<Meal> _result = new ArrayList<Meal>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Meal _item;
            final Object _tmpDateModified;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfDateModified)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfDateModified);
            }
            _tmpDateModified = __mealTypeConverter.fromStringToAny(_tmp);
            final String _tmpIdMeal;
            if (_cursor.isNull(_cursorIndexOfIdMeal)) {
              _tmpIdMeal = null;
            } else {
              _tmpIdMeal = _cursor.getString(_cursorIndexOfIdMeal);
            }
            final String _tmpStrArea;
            if (_cursor.isNull(_cursorIndexOfStrArea)) {
              _tmpStrArea = null;
            } else {
              _tmpStrArea = _cursor.getString(_cursorIndexOfStrArea);
            }
            final String _tmpStrCategory;
            if (_cursor.isNull(_cursorIndexOfStrCategory)) {
              _tmpStrCategory = null;
            } else {
              _tmpStrCategory = _cursor.getString(_cursorIndexOfStrCategory);
            }
            final Object _tmpStrCreativeCommonsConfirmed;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfStrCreativeCommonsConfirmed)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfStrCreativeCommonsConfirmed);
            }
            _tmpStrCreativeCommonsConfirmed = __mealTypeConverter.fromStringToAny(_tmp_1);
            final Object _tmpStrDrinkAlternate;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfStrDrinkAlternate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfStrDrinkAlternate);
            }
            _tmpStrDrinkAlternate = __mealTypeConverter.fromStringToAny(_tmp_2);
            final Object _tmpStrImageSource;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfStrImageSource)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfStrImageSource);
            }
            _tmpStrImageSource = __mealTypeConverter.fromStringToAny(_tmp_3);
            final String _tmpStrIngredient1;
            if (_cursor.isNull(_cursorIndexOfStrIngredient1)) {
              _tmpStrIngredient1 = null;
            } else {
              _tmpStrIngredient1 = _cursor.getString(_cursorIndexOfStrIngredient1);
            }
            final String _tmpStrIngredient10;
            if (_cursor.isNull(_cursorIndexOfStrIngredient10)) {
              _tmpStrIngredient10 = null;
            } else {
              _tmpStrIngredient10 = _cursor.getString(_cursorIndexOfStrIngredient10);
            }
            final String _tmpStrIngredient11;
            if (_cursor.isNull(_cursorIndexOfStrIngredient11)) {
              _tmpStrIngredient11 = null;
            } else {
              _tmpStrIngredient11 = _cursor.getString(_cursorIndexOfStrIngredient11);
            }
            final String _tmpStrIngredient12;
            if (_cursor.isNull(_cursorIndexOfStrIngredient12)) {
              _tmpStrIngredient12 = null;
            } else {
              _tmpStrIngredient12 = _cursor.getString(_cursorIndexOfStrIngredient12);
            }
            final String _tmpStrIngredient13;
            if (_cursor.isNull(_cursorIndexOfStrIngredient13)) {
              _tmpStrIngredient13 = null;
            } else {
              _tmpStrIngredient13 = _cursor.getString(_cursorIndexOfStrIngredient13);
            }
            final String _tmpStrIngredient14;
            if (_cursor.isNull(_cursorIndexOfStrIngredient14)) {
              _tmpStrIngredient14 = null;
            } else {
              _tmpStrIngredient14 = _cursor.getString(_cursorIndexOfStrIngredient14);
            }
            final String _tmpStrIngredient15;
            if (_cursor.isNull(_cursorIndexOfStrIngredient15)) {
              _tmpStrIngredient15 = null;
            } else {
              _tmpStrIngredient15 = _cursor.getString(_cursorIndexOfStrIngredient15);
            }
            final String _tmpStrIngredient16;
            if (_cursor.isNull(_cursorIndexOfStrIngredient16)) {
              _tmpStrIngredient16 = null;
            } else {
              _tmpStrIngredient16 = _cursor.getString(_cursorIndexOfStrIngredient16);
            }
            final String _tmpStrIngredient17;
            if (_cursor.isNull(_cursorIndexOfStrIngredient17)) {
              _tmpStrIngredient17 = null;
            } else {
              _tmpStrIngredient17 = _cursor.getString(_cursorIndexOfStrIngredient17);
            }
            final String _tmpStrIngredient18;
            if (_cursor.isNull(_cursorIndexOfStrIngredient18)) {
              _tmpStrIngredient18 = null;
            } else {
              _tmpStrIngredient18 = _cursor.getString(_cursorIndexOfStrIngredient18);
            }
            final String _tmpStrIngredient19;
            if (_cursor.isNull(_cursorIndexOfStrIngredient19)) {
              _tmpStrIngredient19 = null;
            } else {
              _tmpStrIngredient19 = _cursor.getString(_cursorIndexOfStrIngredient19);
            }
            final String _tmpStrIngredient2;
            if (_cursor.isNull(_cursorIndexOfStrIngredient2)) {
              _tmpStrIngredient2 = null;
            } else {
              _tmpStrIngredient2 = _cursor.getString(_cursorIndexOfStrIngredient2);
            }
            final String _tmpStrIngredient20;
            if (_cursor.isNull(_cursorIndexOfStrIngredient20)) {
              _tmpStrIngredient20 = null;
            } else {
              _tmpStrIngredient20 = _cursor.getString(_cursorIndexOfStrIngredient20);
            }
            final String _tmpStrIngredient3;
            if (_cursor.isNull(_cursorIndexOfStrIngredient3)) {
              _tmpStrIngredient3 = null;
            } else {
              _tmpStrIngredient3 = _cursor.getString(_cursorIndexOfStrIngredient3);
            }
            final String _tmpStrIngredient4;
            if (_cursor.isNull(_cursorIndexOfStrIngredient4)) {
              _tmpStrIngredient4 = null;
            } else {
              _tmpStrIngredient4 = _cursor.getString(_cursorIndexOfStrIngredient4);
            }
            final String _tmpStrIngredient5;
            if (_cursor.isNull(_cursorIndexOfStrIngredient5)) {
              _tmpStrIngredient5 = null;
            } else {
              _tmpStrIngredient5 = _cursor.getString(_cursorIndexOfStrIngredient5);
            }
            final String _tmpStrIngredient6;
            if (_cursor.isNull(_cursorIndexOfStrIngredient6)) {
              _tmpStrIngredient6 = null;
            } else {
              _tmpStrIngredient6 = _cursor.getString(_cursorIndexOfStrIngredient6);
            }
            final String _tmpStrIngredient7;
            if (_cursor.isNull(_cursorIndexOfStrIngredient7)) {
              _tmpStrIngredient7 = null;
            } else {
              _tmpStrIngredient7 = _cursor.getString(_cursorIndexOfStrIngredient7);
            }
            final String _tmpStrIngredient8;
            if (_cursor.isNull(_cursorIndexOfStrIngredient8)) {
              _tmpStrIngredient8 = null;
            } else {
              _tmpStrIngredient8 = _cursor.getString(_cursorIndexOfStrIngredient8);
            }
            final String _tmpStrIngredient9;
            if (_cursor.isNull(_cursorIndexOfStrIngredient9)) {
              _tmpStrIngredient9 = null;
            } else {
              _tmpStrIngredient9 = _cursor.getString(_cursorIndexOfStrIngredient9);
            }
            final String _tmpStrInstructions;
            if (_cursor.isNull(_cursorIndexOfStrInstructions)) {
              _tmpStrInstructions = null;
            } else {
              _tmpStrInstructions = _cursor.getString(_cursorIndexOfStrInstructions);
            }
            final String _tmpStrMeal;
            if (_cursor.isNull(_cursorIndexOfStrMeal)) {
              _tmpStrMeal = null;
            } else {
              _tmpStrMeal = _cursor.getString(_cursorIndexOfStrMeal);
            }
            final String _tmpStrMealThumb;
            if (_cursor.isNull(_cursorIndexOfStrMealThumb)) {
              _tmpStrMealThumb = null;
            } else {
              _tmpStrMealThumb = _cursor.getString(_cursorIndexOfStrMealThumb);
            }
            final String _tmpStrMeasure1;
            if (_cursor.isNull(_cursorIndexOfStrMeasure1)) {
              _tmpStrMeasure1 = null;
            } else {
              _tmpStrMeasure1 = _cursor.getString(_cursorIndexOfStrMeasure1);
            }
            final String _tmpStrMeasure10;
            if (_cursor.isNull(_cursorIndexOfStrMeasure10)) {
              _tmpStrMeasure10 = null;
            } else {
              _tmpStrMeasure10 = _cursor.getString(_cursorIndexOfStrMeasure10);
            }
            final String _tmpStrMeasure11;
            if (_cursor.isNull(_cursorIndexOfStrMeasure11)) {
              _tmpStrMeasure11 = null;
            } else {
              _tmpStrMeasure11 = _cursor.getString(_cursorIndexOfStrMeasure11);
            }
            final String _tmpStrMeasure12;
            if (_cursor.isNull(_cursorIndexOfStrMeasure12)) {
              _tmpStrMeasure12 = null;
            } else {
              _tmpStrMeasure12 = _cursor.getString(_cursorIndexOfStrMeasure12);
            }
            final String _tmpStrMeasure13;
            if (_cursor.isNull(_cursorIndexOfStrMeasure13)) {
              _tmpStrMeasure13 = null;
            } else {
              _tmpStrMeasure13 = _cursor.getString(_cursorIndexOfStrMeasure13);
            }
            final String _tmpStrMeasure14;
            if (_cursor.isNull(_cursorIndexOfStrMeasure14)) {
              _tmpStrMeasure14 = null;
            } else {
              _tmpStrMeasure14 = _cursor.getString(_cursorIndexOfStrMeasure14);
            }
            final String _tmpStrMeasure15;
            if (_cursor.isNull(_cursorIndexOfStrMeasure15)) {
              _tmpStrMeasure15 = null;
            } else {
              _tmpStrMeasure15 = _cursor.getString(_cursorIndexOfStrMeasure15);
            }
            final String _tmpStrMeasure16;
            if (_cursor.isNull(_cursorIndexOfStrMeasure16)) {
              _tmpStrMeasure16 = null;
            } else {
              _tmpStrMeasure16 = _cursor.getString(_cursorIndexOfStrMeasure16);
            }
            final String _tmpStrMeasure17;
            if (_cursor.isNull(_cursorIndexOfStrMeasure17)) {
              _tmpStrMeasure17 = null;
            } else {
              _tmpStrMeasure17 = _cursor.getString(_cursorIndexOfStrMeasure17);
            }
            final String _tmpStrMeasure18;
            if (_cursor.isNull(_cursorIndexOfStrMeasure18)) {
              _tmpStrMeasure18 = null;
            } else {
              _tmpStrMeasure18 = _cursor.getString(_cursorIndexOfStrMeasure18);
            }
            final String _tmpStrMeasure19;
            if (_cursor.isNull(_cursorIndexOfStrMeasure19)) {
              _tmpStrMeasure19 = null;
            } else {
              _tmpStrMeasure19 = _cursor.getString(_cursorIndexOfStrMeasure19);
            }
            final String _tmpStrMeasure2;
            if (_cursor.isNull(_cursorIndexOfStrMeasure2)) {
              _tmpStrMeasure2 = null;
            } else {
              _tmpStrMeasure2 = _cursor.getString(_cursorIndexOfStrMeasure2);
            }
            final String _tmpStrMeasure20;
            if (_cursor.isNull(_cursorIndexOfStrMeasure20)) {
              _tmpStrMeasure20 = null;
            } else {
              _tmpStrMeasure20 = _cursor.getString(_cursorIndexOfStrMeasure20);
            }
            final String _tmpStrMeasure3;
            if (_cursor.isNull(_cursorIndexOfStrMeasure3)) {
              _tmpStrMeasure3 = null;
            } else {
              _tmpStrMeasure3 = _cursor.getString(_cursorIndexOfStrMeasure3);
            }
            final String _tmpStrMeasure4;
            if (_cursor.isNull(_cursorIndexOfStrMeasure4)) {
              _tmpStrMeasure4 = null;
            } else {
              _tmpStrMeasure4 = _cursor.getString(_cursorIndexOfStrMeasure4);
            }
            final String _tmpStrMeasure5;
            if (_cursor.isNull(_cursorIndexOfStrMeasure5)) {
              _tmpStrMeasure5 = null;
            } else {
              _tmpStrMeasure5 = _cursor.getString(_cursorIndexOfStrMeasure5);
            }
            final String _tmpStrMeasure6;
            if (_cursor.isNull(_cursorIndexOfStrMeasure6)) {
              _tmpStrMeasure6 = null;
            } else {
              _tmpStrMeasure6 = _cursor.getString(_cursorIndexOfStrMeasure6);
            }
            final String _tmpStrMeasure7;
            if (_cursor.isNull(_cursorIndexOfStrMeasure7)) {
              _tmpStrMeasure7 = null;
            } else {
              _tmpStrMeasure7 = _cursor.getString(_cursorIndexOfStrMeasure7);
            }
            final String _tmpStrMeasure8;
            if (_cursor.isNull(_cursorIndexOfStrMeasure8)) {
              _tmpStrMeasure8 = null;
            } else {
              _tmpStrMeasure8 = _cursor.getString(_cursorIndexOfStrMeasure8);
            }
            final String _tmpStrMeasure9;
            if (_cursor.isNull(_cursorIndexOfStrMeasure9)) {
              _tmpStrMeasure9 = null;
            } else {
              _tmpStrMeasure9 = _cursor.getString(_cursorIndexOfStrMeasure9);
            }
            final String _tmpStrSource;
            if (_cursor.isNull(_cursorIndexOfStrSource)) {
              _tmpStrSource = null;
            } else {
              _tmpStrSource = _cursor.getString(_cursorIndexOfStrSource);
            }
            final Object _tmpStrTags;
            final String _tmp_4;
            if (_cursor.isNull(_cursorIndexOfStrTags)) {
              _tmp_4 = null;
            } else {
              _tmp_4 = _cursor.getString(_cursorIndexOfStrTags);
            }
            _tmpStrTags = __mealTypeConverter.fromStringToAny(_tmp_4);
            final String _tmpStrYoutube;
            if (_cursor.isNull(_cursorIndexOfStrYoutube)) {
              _tmpStrYoutube = null;
            } else {
              _tmpStrYoutube = _cursor.getString(_cursorIndexOfStrYoutube);
            }
            _item = new Meal(_tmpDateModified,_tmpIdMeal,_tmpStrArea,_tmpStrCategory,_tmpStrCreativeCommonsConfirmed,_tmpStrDrinkAlternate,_tmpStrImageSource,_tmpStrIngredient1,_tmpStrIngredient10,_tmpStrIngredient11,_tmpStrIngredient12,_tmpStrIngredient13,_tmpStrIngredient14,_tmpStrIngredient15,_tmpStrIngredient16,_tmpStrIngredient17,_tmpStrIngredient18,_tmpStrIngredient19,_tmpStrIngredient2,_tmpStrIngredient20,_tmpStrIngredient3,_tmpStrIngredient4,_tmpStrIngredient5,_tmpStrIngredient6,_tmpStrIngredient7,_tmpStrIngredient8,_tmpStrIngredient9,_tmpStrInstructions,_tmpStrMeal,_tmpStrMealThumb,_tmpStrMeasure1,_tmpStrMeasure10,_tmpStrMeasure11,_tmpStrMeasure12,_tmpStrMeasure13,_tmpStrMeasure14,_tmpStrMeasure15,_tmpStrMeasure16,_tmpStrMeasure17,_tmpStrMeasure18,_tmpStrMeasure19,_tmpStrMeasure2,_tmpStrMeasure20,_tmpStrMeasure3,_tmpStrMeasure4,_tmpStrMeasure5,_tmpStrMeasure6,_tmpStrMeasure7,_tmpStrMeasure8,_tmpStrMeasure9,_tmpStrSource,_tmpStrTags,_tmpStrYoutube);
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

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
