package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Players extends AppCompatActivity {
    public static final String KEY = "key2";
    public static final int VALUE = 2;
    Button buttonAdd, buttonView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        buttonAdd = findViewById(R.id.button_Add);

    }
    public void onClickAdd(View view){

            Intent myIntent = new Intent(Players.this, AddPlayer.class);
            myIntent.putExtra(KEY, VALUE);
            Players.this.startActivity(myIntent);

    }
}
