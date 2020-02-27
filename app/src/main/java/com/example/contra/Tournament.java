package com.example.contra;

import java.util.ArrayList;

public class Tournament
{
    private ArrayList<Player> players;
    private String tournamentName;

    public Tournament(String tn)
    {
        tournamentName = tn;
        players = new ArrayList<Player>();
    }

    public void addPlayer(Player newPlayer)
    {
        players.add(newPlayer);
    }

}
