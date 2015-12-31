import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level12 here.
 * 
 * @author (Zach) 
 * @version (a version number or a date)
 */
public class Level12 extends Levelset
{

    /**
     * Constructor for objects of class Level12.
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
    private int delay = 0;
    private int top = 210;
    private int bottom = 270;
    /**
     * Constructor for objects of class Level12.
     * 
     */
    public Level12()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject( new Wall(), a, q);
        addObject( new Wall(), b, q);
        addObject( new Wall(), c, q);
        addObject( new Wall(), d, q);
        addObject( new Wall(), e, q);
        addObject( new Wall(), f, q);
        addObject( new Wall(), g, q);
        addObject( new Wall(), h, q);
        addObject( new Wall(), i, q);
        addObject( new Wall(), j, q);
        addObject( new Wall(), k, q);
        addObject( new Wall(), l, q);
        addObject( new Wall(), m, q);
        addObject( new Wall(), n, q);
        addObject( new Wall(), o, q);
        addObject( new Wall(), p, q);
        addObject( new Wall(), q, q);
        addObject( new Wall(), r, q);
        addObject( new Wall(), s, q);
        addObject( new Wall(), t, q);
        addObject( new Player(), a, p);
        addObject( new PSpawn(), a, p-2);
        World world;
        world = this;
        addObject( new Alarm(world), g, n);
        addObject( new Alarm(world), l, n);
        addObject( new Alarm(world), q, n);
        addObject( new Obstacle(), g, p+2);
        addObject( new Obstacle(), l, p+2);
        addObject( new Obstacle(), q, p+2);
        Gate gate = new Gate();
        addObject(gate, k, e-8);
        addObject(new ClonePress(gate), t, p);
        addObject(new NextLevel(), l, e-8);
        addObject( new Wall(), k, f);
        addObject( new Wall(), l, f);
        addObject( new Wall(), b, o);
        addObject( new Wall(), c, m);
        addObject( new Wall(), d, l);
        addObject( new Wall(), e, k);
        addObject( new Wall(), f, j);
        addObject( new Wall(), g, i);
        addObject( new Wall(), h, h);
        addObject( new Wall(), i, g);
        addObject( new Wall(), j, f);
        addObject( new Wall(), k, c);
        addObject( new Wall(), l, c);
        addObject( new Wall(), k, b);
        addObject( new Wall(), l, b);
        addObject( new Wall(), k, a);
        addObject( new Wall(), l, a);
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
            addObject(r, t+5, o);
            delay = 0;
        }
    }

    public int time = 0;
    public boolean levelcheck = false;
    public int timer = 20000;
    public void act()
    {
        time = time +1;
        timer = timer -1;
        super.decreaseTime(timer);
        //System.out.println(time);

        delay++;
        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                FinalLevel go= new FinalLevel();
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