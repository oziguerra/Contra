package com.example.contra;

import java.util.ArrayList;

public class Tournament
{
    private ArrayList<TournamentBracket> brackets;
    private ArrayList<TournamentBracket> tempBrackets;
    private ArrayList<Player> winners;
    private String tournamentName;
    private Player tournamentWinner;

    public Tournament(String tn)
    {
        tournamentName = tn;
        brackets = new ArrayList<TournamentBracket>();
        tempBrackets = new ArrayList<TournamentBracket>();
        winners = new ArrayList<Player>();
    }

    public void addBracket(TournamentBracket newBracket)
    {
        brackets.add(newBracket);
    }

    public void removeBracket(TournamentBracket bracketToRemove)
    {
        brackets.remove(bracketToRemove);
    }

    public void nextBrackets()
    {
        for(int i = 0; i < brackets.size(); i++)
        {
            winners.add(brackets.get(i).selectWinner());
        }

        if(winners.size() == 1)
        {
            tournamentWinner = winners.get(0);
        }
        else
        {
            for(int i = 0, bracketNum = -1; i < winners.size(); i++)
            {
                if(i % 2 == 0)
                {
                    bracketNum++;
                    tempBrackets.add(new TournamentBracket());
                }
                tempBrackets.get(bracketNum).addPlayer(winners.get(0));
            }
        }

    }

}
