package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TournamentsActivity extends AppCompatActivity {

    public static final String KEY = "key 4";
    public static final int VALUE = 4;
    public static Button t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments);
        t1= findViewById(R.id.button_t1);

    }
    public void onClickCreate(View view){
        Intent myIntent = new Intent(TournamentsActivity.this, T_Creator.class);
        myIntent.putExtra(KEY, VALUE);
        TournamentsActivity.this.startActivity(myIntent);

    }
    public void onClickt1(View view){
        Intent myIntent = new Intent(TournamentsActivity.this, fourP_Tournamet.class);
        myIntent.putExtra(KEY, VALUE);
        TournamentsActivity.this.startActivity(myIntent);

    }
}
