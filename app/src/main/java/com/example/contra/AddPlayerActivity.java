package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

import java.util.ArrayList;

import static com.example.contra.PlayerList.playerList;

public class AddPlayerActivity extends AppCompatActivity {

    EditText nameEditText;
    EditText ignEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);

        nameEditText = findViewById(R.id.editText_name);
        ignEditText = findViewById(R.id.editText_IGN);


    }

    public void addPlayer(View view)
    {
        playerList.add(new Player(nameEditText.getText().toString(), ignEditText.getText().toString()));
        Log.i("Player list: ", playerList.get(playerList.size() - 1).getName() + " " + playerList.get(playerList.size() - 1).getGamerTag());
        saveArrayList(playerList, "Players");
        this.finish();
    }

    public void saveArrayList(ArrayList<Player> list, String key){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }
}
