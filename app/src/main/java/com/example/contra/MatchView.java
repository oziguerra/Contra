package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MatchView extends AppCompatActivity {

    public static final String KEY = "key 8";
    public static final int VALUE = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_view);
    }
    public void onClickContra(View view){
        Intent myIntent = new Intent(MatchView.this, fourP_Tournamet.class);
        myIntent.putExtra(KEY, VALUE);
        MatchView.this.startActivity(myIntent);

    }
}
