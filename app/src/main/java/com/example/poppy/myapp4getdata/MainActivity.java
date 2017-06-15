package com.example.poppy.myapp4getdata;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String yourName;
    String yoursurname;
    String yourid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Button button = (Button) findViewById(R.id.button);
        SharedPreferences sharedPreferences = getSharedPreferences("pop", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name","Elena");
        editor.putInt("idName",12);
        editor.commit();*/

        /*button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        // TO DO
                        EditText editTextName = (EditText) findViewById(R.id.yourName);
                        yourName = editTextName.getText().toString();

                        //Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                        intent.putExtra("yourName",yourName);
                        intent.putExtra("tel","0653101391");
                        startActivity(intent);
                       // startActivity(new Intent(MainActivity.this,SecondActivity.class));
                    }
                }
        );*/

    }

    public void sendData(View view){
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        yourName = editTextName.getText().toString();

        EditText editTextyoursurname = (EditText) findViewById(R.id.yoursurname);
        yoursurname = editTextyoursurname.getText().toString();

        EditText editTextyourid = (EditText) findViewById(R.id.yourid);
        yourid = editTextyourid.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("yourName",yourName);
        intent.putExtra("yoursurname",yoursurname);
        intent.putExtra("yourid",yourid);

        intent.putExtra("tel","0653101391");
        startActivity(intent);
    }
}
