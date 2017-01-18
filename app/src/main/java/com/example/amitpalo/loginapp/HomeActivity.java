package com.example.amitpalo.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Person person = getIntent().getParcelableExtra("Person");
        display = (TextView) findViewById(R.id.home_textView);
        display.setText("Hi "+person.getName()+".Your Email is "+person.getEmail()+"and your phone no. is "+person.getPhone());

    }
}
