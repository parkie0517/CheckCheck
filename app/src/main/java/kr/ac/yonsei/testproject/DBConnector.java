package kr.ac.yonsei.testproject;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBConnector extends SQLiteOpenHelper {

    static String DB_NAME = "testDB";
    static String DB_CREATE_USER = "CREATE TABLE tbl_user (id char(20), userName char(20), pwd password(20))";
    static String DB_DELETE_USER = "DROP TABLE IF EXISTS tbl_user";

    public DBConnector(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //DB가 존재하지 않을때 최초로 호출된다.
        db.execSQL(DB_CREATE_USER);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //DB초기화시 호출된다.
        db.execSQL(DB_DELETE_USER);
        onCreate(db);
    }
}
