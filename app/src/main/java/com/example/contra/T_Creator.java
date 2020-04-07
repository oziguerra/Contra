package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class T_Creator extends AppCompatActivity {
    int[] numberOfP={4,8,16};
    public static final String KEY = "key5";
    public static final int VALUE = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t__creator);
    }
    public void onClickFinish(View view){
        Intent myIntent = new Intent(T_Creator.this, Tournaments.class);
        myIntent.putExtra(KEY, VALUE);
        T_Creator.this.startActivity(myIntent);
    }
    public void onClickSelectP(View view){
        Intent myIntent = new Intent(T_Creator.this, Select_Player.class);
        myIntent.putExtra(KEY, VALUE);
        T_Creator.this.startActivity(myIntent);
    }
}
