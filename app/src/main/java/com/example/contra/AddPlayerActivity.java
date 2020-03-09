package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.contra.MainActivity.playerList;

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
    }
}
