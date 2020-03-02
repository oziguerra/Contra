package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "key1";
    public static final int VALUE = 1;
    Button buttonP, buttonT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonP=findViewById(R.id.button_P);
        buttonT=findViewById(R.id.button_T);
    }
    public void onClickP(View view){
        Intent myIntent = new Intent(MainActivity.this, Players.class);
        myIntent.putExtra(KEY, VALUE);
        MainActivity.this.startActivity(myIntent);
    }
    public void onClickT(View view){
        Intent myIntent = new Intent(MainActivity.this, Tournaments.class);
        myIntent.putExtra(KEY, VALUE);
        MainActivity.this.startActivity(myIntent);
    }
}
