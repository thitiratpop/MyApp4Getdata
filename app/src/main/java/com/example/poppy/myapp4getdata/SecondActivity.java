package com.example.poppy.myapp4getdata;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

       // SharedPreferences sharedPreferences = getSharedPreferences("pop", Context.MODE_PRIVATE);
       // String yourname = sharedPreferences.getString("name","");


        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        String surname = intent.getStringExtra("yoursurname");
        String idname = intent.getStringExtra("yourid");
        TextView textName = (TextView) findViewById(R.id.textView);
        TextView textsurName = (TextView) findViewById(R.id.textView4);
        TextView textidName = (TextView) findViewById(R.id.textView5);
        textName.setText(name);
        textsurName.setText(surname);
        textidName.setText(idname);
    }
}
