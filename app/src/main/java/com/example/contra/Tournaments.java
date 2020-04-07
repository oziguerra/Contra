package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tournaments extends AppCompatActivity {

    public static final String KEY = "key 4";
    public static final int VALUE = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments);
    }
    public void onClickCreate(View view){
        Intent myIntent = new Intent(Tournaments.this, T_Creator.class);
        myIntent.putExtra(KEY, VALUE);
        Tournaments.this.startActivity(myIntent);
    }
}
