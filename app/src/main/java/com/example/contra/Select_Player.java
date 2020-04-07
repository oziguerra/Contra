package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Select_Player extends AppCompatActivity {

    public static final String KEY = "key6";
    public static final int VALUE = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__player);
    }
    public void onClickAddP(View view){
        Intent myIntent = new Intent(Select_Player.this, T_Creator.class);
        myIntent.putExtra(KEY, VALUE);
        Select_Player.this.startActivity(myIntent);
    }
}
