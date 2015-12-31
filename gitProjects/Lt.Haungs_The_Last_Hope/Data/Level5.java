import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level5 here.
 * 
 * @author (Ken) 
 * @version (a version number or a date)
 */
public class Level5 extends Levelset
{
    //Constuctor for objects of class Level2
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
    private int delay = 0;
    private int top = 30;
    private int bottom = 88;

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        prepare();
    }

    private void prepare()
    {
        addObject(new Wall(), a, t);
        addObject(new Wall(), b, t);
        addObject(new Wall(), c, t);
        addObject(new Wall(), d, t);
        addObject(new Wall(), e, t);
        addObject(new Wall(), f, t);
        addObject(new Wall(), g, t);
        addObject(new Wall(), h, t);
        addObject(new Wall(), i, t);
        addObject(new Wall(), j, t);
        addObject(new Wall(), k, t);
        addObject(new Wall(), l, t);
        addObject(new Wall(), m, t);
        addObject(new Wall(), n, t);
        addObject(new Wall(), o, t);
        addObject(new Wall(), p, t);
        addObject(new Wall(), q, t);
        addObject(new Wall(), r, t);
        addObject(new Wall(), s, t);
        addObject(new Wall(), t, t);
        addObject(new Wall(), d, s);
        addObject(new Wall(), k, s);
        addObject(new Wall(), k, r);
        addObject(new Wall(), k, q);
        addObject(new Wall(), k, p);
        addObject(new Wall(), k, o);
        addObject(new Wall(), k, n);
        addObject(new Wall(), k, m);
        addObject(new Wall(), k, l);
        addObject(new Wall(), k, k);
        addObject(new Wall(), k, j);
        addObject(new Wall(), k, i);
        addObject(new Wall(), k, h);
        addObject(new Wall(), k, g);
        addObject(new Wall(), k, f);
        addObject(new Wall(), f, s);
        addObject(new Wall(), g, s);
        addObject(new Wall(), h, s);
        addObject(new Wall(), i, s);
        addObject(new Wall(), j, s);
        addObject(new Wall(), i, q);
        addObject(new Wall(), h, p);
        addObject(new Wall(), g, p);
        addObject(new Wall(), f, p);
        addObject(new Wall(), e, p);
        addObject(new Wall(), d, p);
        addObject(new Wall(), c, p);
        addObject(new Wall(), b, p);
        addObject(new Wall(), a, p); 
        addObject(new Wall(), b, n);
        addObject(new Wall(), c, m);
        addObject(new Wall4(), d, m);
        addObject(new Wall4(), e, m);
        addObject(new Wall4(), f, m);

        addObject(new Wall4(), g, m);
        addObject(new Wall(), h, m);
        addObject(new Wall(), i, m);
        addObject(new Wall(), j, m);
        addObject(new Wall(), i, k);
        addObject(new Wall(), h, j);
        addObject(new Wall5(), g, j);
        addObject(new Wall5(), f, j);
        addObject(new Wall5(), e, j);
        addObject(new Wall5(), d, j);
        addObject(new Wall(), c, j);
        addObject(new Wall(), b, j);
        addObject(new Wall(), c, h);
        addObject(new Wall(), e, f);
        addObject(new Wall4(), f, e);
        addObject(new Wall4(), g, e);
        addObject(new Wall4(), h, e);
        addObject(new Wall4(), i, e);
        addObject(new Wall4(), j, e);
        addObject(new Wall4(), k, e);
        addObject(new Wall(), l, e);
        addObject(new Wall(), m, f);
        addObject(new Wall(), o, g);
        addObject(new Wall(), p, h);
        addObject(new Wall(), r, i);
        addObject(new Wall(), t, k);
        addObject(new Wall(), r, m);
        addObject(new Wall(), q, n);
        addObject(new Obstacle(), p, o);
        addObject(new Wall(), o, p);
        addObject(new Wall(), n, q);
        addObject(new Wall(), m, r);
        addObject(new Obstacle(), e, s+2);
        addObject(new Obstacle(), q, i);
        addObject(new Obstacle(), n, g);
        addObject(new Wall(), s, l);
        addObject(new Player(), a, s);
        addObject(new PSpawn(), a, s);
        addObject(new NextLevel(), t, s-8);

        addObject(new Alarm(this), i, d+5); 
        Gas gas = new Gas();
        Gas gas1 = new Gas();
        addObject(gas, f, o-8);

        addObject(new CloneLever(gas), b, m);

        tex.setImage("8.png");
        addObject(tex, 160, 144);
        addObject(new Countdown(),d,b);
    }

    public void spawnRobots()
    {
        // if( Greenfoot.getRandomNumber(1000)<10)
        if(delay>20)
        {
            Robot r = new Robot();
            r.setTop(top);
            r.setBottom(bottom);
            addObject(r, t+5, d);
            delay = 0;
        }
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
        //System.out.println(time);

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

        delay++;
        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                Level7 go= new Level7();
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