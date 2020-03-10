package com.example.contra;

public class Player implements Comparable<Player>
{
    private String name;
    private String gamerTag;
    private int score;

    public Player(String n, String gt)
    {
        name = n;
        score = 0;
        gamerTag = gt;
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

    public String getName()
    {
        return name;
    }

    public String getGamerTag() { return gamerTag; }

    public void addToScore()
    {
        score++;
    }

    public void subtractFromScore()
    {
        if(score > 0)
        {
            score--;
        }
    }
}
