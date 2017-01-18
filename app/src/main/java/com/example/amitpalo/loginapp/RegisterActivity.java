package com.example.amitpalo.loginapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, password, email, phone;
    Button done;
    //DataBaseAdapter dataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }

    private void init() {
       // dataBaseAdapter = new DataBaseAdapter(this);
        name = (EditText) findViewById(R.id.registerNameEditText);
        password = (EditText) findViewById(R.id.registerPasswordEditText);
        email = (EditText) findViewById(R.id.registerEmailEditText);
        phone = (EditText) findViewById(R.id.registerPhoneEditText);
        done = (Button) findViewById(R.id.done_button);
        done.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.done_button :
                addUser();
                break;
        }
    }

    private void addUser() {

        String nameText = name.getText().toString();
        String passwordText = password.getText().toString();
        String emailText = email.getText().toString();
        long phoneno = Long.valueOf(phone.getText().toString()).longValue();
        Person person = new Person(0,nameText,passwordText,emailText,phoneno);
//        if (!nameText.isEmpty() || !passwordText.isEmpty() || !emailText.isEmpty()) {
//            long id = dataBaseAdapter.insertData(person);
//            if (id >= 0) {
//                Toast.makeText(this,"SUCCESSFULLY INSERTED",Toast.LENGTH_SHORT).show();
//                finish();
//            }else {
//                Toast.makeText(this,"INSERTION FAILED",Toast.LENGTH_SHORT).show();
//            }
//        }else {
//            Toast.makeText(this,"All FIELDS ARE MANDATORY",Toast.LENGTH_SHORT).show();
//        }
    }
}
