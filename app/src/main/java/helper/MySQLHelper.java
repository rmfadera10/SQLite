package helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class MySQLHelper extends SQLiteOpenHelper {

    private static final String db_name="Dictionary";
    private static final int db_version=1;

    private static final String tbl_word="tblword";


    private static final String tbl_id="tblid";
    private static final String word="wordName";
    private static final String meaning="wordmeaning";


    public MySQLHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + tbl_word  + "(" + tbl_id + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                word + " TEXGT, " + meaning + " TEXT " + ")";

        db.execSQL(query);

    }


    public long InsertData(String wordName, String word_meaning, SQLiteDatabase db){

        long id;
        ContentValues contentValues=new ContentValues();
        contentValues.put(word, wordName);
        contentValues.put(meaning, word_meaning);

        id=db.insert(tbl_word, null, contentValues);
        return id;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
