package com.example.contra;

import java.util.ArrayList;

public class Tournament
{
    private ArrayList<TournamentBracket> brackets;
    private String tournamentName;

    public Tournament(String tn)
    {
        tournamentName = tn;
        brackets = new ArrayList<TournamentBracket>();
    }

    public void addBracket(TournamentBracket newBracket)
    {
        brackets.add(newBracket);
    }

    public void removeBracket(TournamentBracket bracketToRemove)
    {
        brackets.remove(bracketToRemove);
    }

}
