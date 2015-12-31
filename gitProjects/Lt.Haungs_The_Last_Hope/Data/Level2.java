import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level3 here.
 * 
 * @author (Mike) 
 * @version (a version number or a date)
/**
 * Constructor for objects of class Test.
 * 
 */
public class Level2 extends Levelset
{
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

    public Level2()
    {    

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        addObject(new Wall(), a, s);
        addObject(new Wall(), b, s);
        addObject(new Wall4(), c, s);
        addObject(new Wall4(), d, s);
        addObject(new Wall4(), e, s);
        addObject(new Wall4(), f, s);
        addObject(new Wall4(), g, s);
        addObject(new Wall4(), h, s);
        addObject(new Wall4(), i, s);
        addObject(new Wall(), j, s);
        addObject(new Wall(), l, q);
        addObject(new Wall(), m, q);
        addObject(new Wall(), o, o);
        addObject(new Wall(), p, n);
        addObject(new Wall(), q, m);
        addObject(new Wall(), r, m);
        addObject(new Wall(), s, m);
        addObject(new Wall(), t, m);
        addObject(new Player(), b, r);
        addObject(new PSpawn(), b, r);
        addObject(new NextLevel(), t, l-8);
        addObject(new Obstacle(), a,t+2);
        addObject(new Obstacle(), b,t+2);
        addObject(new Obstacle(), c,t+2);
        addObject(new Obstacle(), d,t+2);
        addObject(new Obstacle(), e,t+2);
        addObject(new Obstacle(), f,t+2);
        addObject(new Obstacle(), g,t+2);
        addObject(new Obstacle(), h,t+2);
        addObject(new Obstacle(), i,t+2);
        addObject(new Obstacle(), j,t+2);
        addObject(new Obstacle(), k,t+2);
        addObject(new Obstacle(), l,t+2);
        addObject(new Obstacle(), m,t+2);
        addObject(new Obstacle(), n,t+2);
        addObject(new Obstacle(), o,t+2);
        addObject(new Obstacle(), p,t+2);
        addObject(new Obstacle(), q,t+2);
        addObject(new Obstacle(), r,t+2);
        addObject(new Obstacle(), s,t+2);
        addObject(new Obstacle(), t,t+2);
        addObject(new Countdown(),g,g);
        tex.setImage("2.png");
        addObject(tex, 160, 249);
    }
    Text tex = new Text();
    public int time = 0;
    public boolean levelcheck = false;
    public boolean textcheck = false;
    public int timer = 20000;
    public void act()
    {
        time = time +1;
        timer = timer -1;
        super.decreaseTime(timer);
        

        if( time > 10)
        {
            textcheck = true;
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
                Level3 go= new Level3();
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