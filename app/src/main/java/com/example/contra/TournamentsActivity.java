package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TournamentsActivity extends AppCompatActivity {

    public static final String KEY = "key 4";
    public static final int VALUE = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments);
    }
    public void onClickCreate(View view){
        Intent myIntent = new Intent(TournamentsActivity.this, T_Creator.class);
        myIntent.putExtra(KEY, VALUE);
        TournamentsActivity.this.startActivity(myIntent);
    }
}
