package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;

import static com.example.contra.PlayerList.playerList;

public class MainActivity<T> extends AppCompatActivity {
    public static final String KEY = "key1";
    public static final int VALUE = 1;
    Button buttonP, buttonT;
    SharedPreferences prefs;
    //public static ArrayList<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonP=findViewById(R.id.button_P);
        buttonT=findViewById(R.id.button_T);
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.contains("Players"))
        {
            playerList = getArrayList("Players");
        }


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

    /**
     *     Save and get ArrayList in SharedPreference
     */

    public void saveArrayList(ArrayList<Player> list, String key){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public ArrayList<Player> getArrayList(String key){

        Gson gson = new Gson();
        String json = prefs.getString(key, null);
        Type type = new TypeToken<ArrayList<Player>>() {}.getType();
        return gson.fromJson(json, type);
    }
}
