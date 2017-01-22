package com.example.amitpalo.loginapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Amit Palo on 9/25/2016.
 */


//public class DataBaseAdapter {
//
//    DataBaseHelper dataBaseHelper;
//
//    public DataBaseAdapter(Context context) {
//        dataBaseHelper = new DataBaseHelper(context);
//        SQLiteDatabase db = dataBaseHelper.getWritableDatabase();
//    }
//
//    public long insertData(Person person) {
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(DataBaseHelper.NAME, person.getName());
//        contentValues.put(DataBaseHelper.PASSWORD, person.getPassword());
//        contentValues.put(DataBaseHelper.EMAIL, person.getEmail());
//        contentValues.put(DataBaseHelper.PHONE, person.getPhone());
//
//        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getWritableDatabase();
//        return sqLiteDatabase.insert(DataBaseHelper.TABLE_NAME, null, contentValues);
//    }
//
//    public Person retriveData(String name, String password) {
//        SQLiteDatabase sqLiteDatabase = dataBaseHelper.getReadableDatabase();
//        String[] columns = {DataBaseHelper.UID, DataBaseHelper.EMAIL, DataBaseHelper.PHONE};
//        String[] selectionArgs = {name, password};
//        Cursor cursor = sqLiteDatabase.query(DataBaseHelper.TABLE_NAME, columns, DataBaseHelper.NAME + " =? AND " + DataBaseHelper.PASSWORD + "=?", selectionArgs, null, null, null, null);
//        Person person = new Person();
//        while (cursor.moveToNext()) {
//            person.setId(cursor.getInt(cursor.getColumnIndex(DataBaseHelper.UID)));
//            person.setName(name);
//            person.setPassword(password);
//            person.setEmail(cursor.getString(cursor.getColumnIndex(DataBaseHelper.EMAIL)));
//            person.setPhone(cursor.getLong(cursor.getColumnIndex(DataBaseHelper.PHONE)));
//            break;
//        }
//        return person;
//    }
//
//}
     class DataBaseHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "logindatabase";
        private static final String TABLE_NAME = "Record";
        private static final int DATABASE_VERSION = 1;
        private static final String UID = "Id";
        private static final String NAME = "Name";
        private static final String PASSWORD = "Password";
        private static final String EMAIL = "Email";
        private static final String PHONE = "Phone";
        private Context context;
        private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME
                + "("
                + UID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + NAME + " VARCHAR(255),"
                + PASSWORD + " VARCHAR(255),"
                + EMAIL + " VARCHAR(255),"
                + PHONE + " BIGINT(10)"
                + ");";
        private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;


        public DataBaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase db) {

            try {
                db.execSQL(CREATE_TABLE);
                Toast.makeText(context,"DB CREATED",Toast.LENGTH_SHORT).show();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            try {
                db.execSQL(DROP_TABLE);
                Toast.makeText(context,"DB UPDATED",Toast.LENGTH_SHORT).show();
                onCreate(db);

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

