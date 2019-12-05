package helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLHelper extends SQLiteOpenHelper {

    private static final String db_name="Dictionary";
    private static final int db_version=1;

    private static final String tbl_name="tblword";


    private static final String tbl_id="tblid";
    private static final String wordName="wordName";
    private static final String word_meaning="wordmeaning";


    public MySQLHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " +tbl_name + "(" +tbl_id+ "INTEGER PRIMARY KEY AUTOINCREMENT ," +
                wordName+ "TEXGT," +word_meaning+ "TEXT" + ")";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
