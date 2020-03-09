package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import static com.example.contra.MainActivity.playerList;

public class AddPlayer extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
    }

    public void addPlayer(View view)
    {
        playerList.add(new Player())
    }
}
