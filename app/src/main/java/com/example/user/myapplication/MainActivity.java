package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static public EditText editText1;
    static public Button button1;
    static public String content=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.et1);
        button1 = (Button) findViewById(R.id.bt1);
    }


    public void onClick(View view) {
        content = MainActivity.editText1.getText().toString();
        Intent i = new Intent();
        i.setClass(MainActivity.this, Result.class);
        startActivity(i);
    }

}
