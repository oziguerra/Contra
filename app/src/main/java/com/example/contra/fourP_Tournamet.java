package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourP_Tournamet extends AppCompatActivity {

    public static final String KEY = "key 7";
    public static final int VALUE = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_p__tournamet);
    }
    public void onClicklogo(View view){
        Intent myIntent = new Intent(fourP_Tournamet.this, MainActivity.class);
        myIntent.putExtra(KEY, VALUE);
        fourP_Tournamet.this.startActivity(myIntent);

    }
    public void onClickmatch(View view){
        Intent myIntent = new Intent(fourP_Tournamet.this, MatchView.class);
        myIntent.putExtra(KEY, VALUE);
        fourP_Tournamet.this.startActivity(myIntent);

    }
}
