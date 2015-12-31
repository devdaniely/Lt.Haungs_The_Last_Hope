import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverScreen here.
 * 
 * @author (Mike) 
 * @version (a version number or a date)
 */
public class OverScreen extends Levelset
{
    private ScoreBoard scoreboard;

    private int a = 8;
    private int b = 24;
    private int c = 40;
    private int d = 56;
    private int e = 72;
    private int f = 88;
    private int g = 104;
    private int h = 120;
    private int i = 136;
    private int j = 152;
    private int k = 168;
    private int l = 184;
    private int m = 200;
    private int n = 216;
    private int o = 232;
    private int p = 248;
    private int q = 264;
    private int r = 280;
    private int s = 296;
    private int t = 312;

    /**
     * Constructor for objects of class OverScreen.
     * 
     */
    public OverScreen()
    {    
        scoreboard = new ScoreBoard();
        addObject(scoreboard, d, d);
    }
    public int time = 0;
    public void act()
    {
        time= time +1; 

        if (time >10 )
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                Level1 l = new Level1();
                Greenfoot.setWorld(l);
            } 
        }

        if(Greenfoot.isKeyDown("z"))
        {
            LevelM2 l = new LevelM2();
            Greenfoot.setWorld(l);
        }

    }
}
