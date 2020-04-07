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

    public void addPlayer(Player newPlayer)
    {
        players.add(newPlayer);
    }

    public Player selectWinner()
    {
        if(players.size() == 1)
        {
            winner = players.get(0);
            return winner;
        }
        else
        {
            if(players.get(0).compareTo(players.get(1)) > 0)
            {
                winner = players.get(0);
                return winner;
            }
            winner = players.get(1);
            return winner;
        }
    }
}

