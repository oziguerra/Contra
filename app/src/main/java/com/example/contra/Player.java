package com.example.contra;

public class Player implements Comparable<Player>
{
    private String name;
    private int score;
    public Player(String n)
    {
        name = n;
        score = 0;
    }

    /**
     * If this player wins, returns positive
     * If this player loses, return negative
     * If its a tie, returns 0
     * @param player to be compared against
     */
    @Override
    public int compareTo(Player player) {
        return (score - player.getScore());
    }

    public int getScore()
    {
        return score;
    }
}
