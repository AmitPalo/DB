package com.example.amitpalo.loginapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login, register;
    EditText name,password;
    //DataBaseAdapter dataBaseAdapter;
    DataBaseHelper dataBaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        dataBaseHelper = new DataBaseHelper(this);
        SQLiteDatabase db = dataBaseHelper.getWritableDatabase();
       // configureLoginScreen();


    }

    public void configureLoginScreen() {
        login = (Button) findViewById(R.id.login_button);
        login.setOnClickListener(this);
        register = (Button) findViewById(R.id.register_button);
        register.setOnClickListener(this);
        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
       // dataBaseAdapter = new DataBaseAdapter(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.login_button:
                   validateUser();
                break;

            case R.id.register_button:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
        }
    }

    private void validateUser() {

        if (name.getText().toString().isEmpty() || password.getText().toString().isEmpty()) {

            Toast.makeText(this,"ALL FIELDS ARE MANDATORY",Toast.LENGTH_SHORT).show();
        }else {

            //Person person = dataBaseAdapter.retriveData(name.getText().toString(),password.getText().toString());
//            if (person.getId() > 0) {
//
//                Intent intent =  new Intent(this,HomeActivity.class);
//                intent.putExtra("Person", (Parcelable) person);
//                startActivity(intent);
//            }
        }
    }
}
