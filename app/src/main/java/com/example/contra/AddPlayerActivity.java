package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
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
        this.finish();
    }
}
