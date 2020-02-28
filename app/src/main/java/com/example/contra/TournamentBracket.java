package com.example.contra;

import java.util.ArrayList;

public class TournamentBracket
{
    private ArrayList<Player> players;
    private Player winner;

    public TournamentBracket()
    {

    }

    public TournamentBracket(Player player)
    {
        players.add(player);
    }

    public TournamentBracket(Player player1, Player player2)
    {
        players.add(player1);
        players.add(player2);
    }

    public void selectWinner()
    {

    }
}

