package helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQLHelper extends SQLiteOpenHelper {

    private static final String db_name="Dictionary";
    private static final int db_version=1;

    private static final String tblname="tblword";


    private static final String tblid="tblid";
    private static final String wordName="wordName";
    private static final String wordmeaning="wordmeaning";


    public MySQLHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE" +tblname +"("+tblid+"INTEGER PRIMARY KEY AUTOINCREMENT,"+
                wordName+"TEXGT,"+wordmeaning+"TEXT"+")";

        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
