import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levelset here.
 * 
 * @author (Daniel and Jonathan and Chris) 
 * @version (a version number or a date)
 */
public class Levelset extends World
{
    private GreenfootSound bkgMusic;
    ScoreBoard scoreboard = new ScoreBoard();
    Countdown count = new Countdown();
    /**
     * Constructor for objects of class Levelset.
     * 
     */
    public Levelset()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(320, 320, 1);

    }

    public void endGame()
    {
    }

    public void increaseScore(int time)
    {
        scoreboard.addScore(time);
    }

    public void decreaseTime(int timer)
    {
        count.addScore(timer);
    }

    public void spawnRobots()
    {    
    }
}
