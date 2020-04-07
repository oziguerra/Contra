package com.example.contra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.contra.PlayerList.playerList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class PlayersActivity extends AppCompatActivity {
    public static final String KEY = "key2";
    public static final int VALUE = 2;
    Button buttonAdd, buttonView;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        buttonAdd = findViewById(R.id.button_Add);




        //Recycler view
        recyclerView = (RecyclerView) findViewById(R.id.playerListRecyclerView);
        //Linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //Adapter for recycler view
        mAdapter = new MyRecyclerViewAdapter(playerList);

        recyclerView.setAdapter(mAdapter);

    }
    public void onClickAdd(View view){

            Intent myIntent = new Intent(PlayersActivity.this, AddPlayerActivity.class);
            myIntent.putExtra(KEY, VALUE);
            PlayersActivity.this.startActivity(myIntent);

    }

    @Override
    public void onResume(){
        super.onResume();
        mAdapter.notifyDataSetChanged();

    }

}
