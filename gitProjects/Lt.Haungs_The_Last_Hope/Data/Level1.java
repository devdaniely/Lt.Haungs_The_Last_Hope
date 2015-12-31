import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Test here.
 * 
 * @author (Daniel) 
 * @version (a version number or a date)
 */
public class Level1 extends Levelset
{
    private GreenfootSound bkgMusic;

    /**
     * Constructor for objects of class Test.
     * 
     */
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

    public Level1()
    {    

        prepare();
    }

    /**
     * Prepare the World for the start of the program. That is: create the initial
     * objects and add them to the World.
     */
    private void prepare()
    {
        addObject(new Wall(), a,s);
        addObject(new Wall(), b,s);
        addObject(new Wall(), c,s);
        addObject(new Wall(), d,s);
        addObject(new Wall(), e,s);
        addObject(new Wall(), f,s);
        addObject(new Wall(), g,s);
        addObject(new Wall(), h,s);
        addObject(new Wall(), i,s);
        addObject(new Wall(), j,s);
        addObject(new Wall(), k,s);
        addObject(new Wall(), l,s);
        addObject(new Wall(), m,s);
        addObject(new Wall(), n,s);
        addObject(new Wall(), o,s);
        addObject(new Wall(), p,s);
        addObject(new Wall(), q,s);
        addObject(new Wall(), r,s);
        addObject(new Wall(), s,s);
        addObject(new Wall(), t,s);

        addObject(new Player(), b, r);
        addObject(new PSpawn(), b, r);
        addObject(new NextLevel(), t, r-8);
        Obstacle obstacle13 = new Obstacle();
        addObject(obstacle13, 160, 273);
        obstacle13.setLocation(153, 282);

        bkgMusic = new GreenfootSound("game_song.mp3");
        //Credit to newgrounds.com
        bkgMusic.playLoop();

        tex.setImage("1.png");
        addObject(tex, 160, 238);
        addObject(new Countdown(),d,b);
    }
    Text tex = new Text();
    public int time = 0;
    public boolean levelcheck = false;
    public boolean textcheck = true;
    public int timer = 20000;
    public void act()
    {
        time = time +1;
        timer = timer -1;
        super.decreaseTime(timer);
        //System.out.println(time);
        if (time > 10)
        {
            if (textcheck ==true)
            {
                if (Greenfoot.isKeyDown("enter"))
                {
                    removeObject(tex);
                }
            }
        }

        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                Level2 go= new Level2();
                Greenfoot.setWorld(go);
            }
        }
        levelTime--;
    }
    int levelTime = 20000;
    public void endGame()
    {
        if (levelTime > 0)
        {
            super.increaseScore(levelTime);
        }
        addObject(new Continue(), 165, 253);
        addObject(scoreboard, 160,160);
        levelcheck = true;
        levelTime = levelTime + 1000;
    }
}