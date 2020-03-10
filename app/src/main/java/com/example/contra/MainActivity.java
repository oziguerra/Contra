package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "key1";
    public static final int VALUE = 1;
    Button buttonP, buttonT;
    //public static ArrayList<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonP=findViewById(R.id.button_P);
        buttonT=findViewById(R.id.button_T);
    }
    public void onClickP(View view){
        Intent myIntent = new Intent(MainActivity.this, PlayersActivity.class);
        myIntent.putExtra(KEY, VALUE);
        MainActivity.this.startActivity(myIntent);
    }
    public void onClickT(View view){
        Intent myIntent = new Intent(MainActivity.this, TournamentsActivity.class);
        myIntent.putExtra(KEY, VALUE);
        MainActivity.this.startActivity(myIntent);
    }
}
