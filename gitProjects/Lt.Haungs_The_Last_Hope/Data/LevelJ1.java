import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class LevelJ1 here.
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class LevelJ1 extends Levelset
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

    /**
     * Constructor for objects of class LevelJ1.
     * 
     */
    public LevelJ1()
    {    
        prepare();
    }

    public void prepare()
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
        addObject(new Player(), b, s);
        addObject(new Obstacle(), d, s+2);
        addObject(new PSpawn(), b, s);
        addObject(new Obstacle(), j, s+2);

        addObject(new Obstacle(), p, s+2);
        addObject(new Wall(), s, s);
        addObject(new Wall(), t, q);
        addObject(new Wall(), a, o);
        addObject(new Wall(), b, o);
        addObject(new Wall(), c, o);
        addObject(new Wall(), d, o);
        addObject(new Wall(), e, o);
        addObject(new Wall(), h, q);
        addObject(new Wall(), f, o);
        addObject(new Wall(), g, o);
        addObject(new Wall(), i, o);
        addObject(new Wall(), j, o);
        addObject(new Wall(), k, o);
        addObject(new Wall(), l, o);
        addObject(new Wall(), m, o);
        addObject(new Wall(), g, s);
        addObject(new Wall(), n, o);
        addObject(new Wall(), o, o);
        addObject(new Wall(), p, o);
        addObject(new Wall(), q, o);
        addObject(new Wall(), r, o);
        addObject(new Wall(), s, o);
        addObject(new Wall(), i, i);
        addObject(new Wall(), i, k);
        addObject(new Wall(), i, l);
        addObject(new Wall(), i, m);
        addObject(new Wall(), i, n);
        addObject(new Wall(), i, j);
        addObject(new Obstacle(), m, n+2);
        addObject(new Obstacle(), q, n+2);
        addObject(new Obstacle(), d, n+2);
        addObject(new Wall(), a, n);
        addObject(new Wall(), b, l);
        addObject(new Wall(), a, j);
        addObject(new Wall(), b, h);
        addObject(new Wall(), c, h);
        addObject(new Wall(), d, h);
        addObject(new Wall(), e, h);
        addObject(new Wall(), f, h);
        addObject(new Wall(), g, h);
        addObject(new Wall(), h, h);
        addObject(new Wall(), i, h);
        addObject(new Wall(), j, h);
        addObject(new Wall(), k, h);
        addObject(new Wall(), l, h);
        addObject(new Wall(), m, h);
        addObject(new Wall(), n, h);
        addObject(new Wall(), o, h);
        addObject(new Wall(), p, h);
        addObject(new Wall(), q, h);
        addObject(new Wall(), r, h);
        addObject(new Wall(), s, h);
        addObject(new Wall(), t, h);
        addObject(new Obstacle(), g, g+2);
        addObject(new Obstacle(), m, g+2);
        addObject(new Wall(), s, g);
        addObject(new Wall(), t, f);
        addObject(new Wall(), a, d);
        addObject(new Wall(), b, d);
        addObject(new Wall(), c, d);
        addObject(new Wall(), d, d);
        addObject(new Wall(), e, d);
        addObject(new Wall(), f, d);
        addObject(new Wall(), g, d);
        addObject(new Wall(), h, d);
        addObject(new Wall(), i, d);
        addObject(new Wall(), j, d);
        addObject(new Wall(), k, d);
        addObject(new Wall(), l, d);
        addObject(new Wall(), m, d);
        addObject(new Wall(), n, d);
        addObject(new Wall(), o, d);
        addObject(new Wall(), p, d);
        addObject(new Wall(), q, d);
        addObject(new Wall(), r, d);
        addObject(new Wall(), s, d);
        addObject(new Wall(), c, g);
        addObject(new Obstacle(), j, c+2);
        addObject(new CloneTurret(), p, g);
        NextLevel nextlevel = new NextLevel();
        addObject(nextlevel, a, c);
        Gate gate = new Gate();
        addObject(gate, q, e);
        addObject(new ClonePress(gate), j, n);
        addObject(new Trophy(), r, s);
        addObject(new Wall(), q, g);
        gate.setLocation(264, 80);
        nextlevel.setLocation(7, 32);
        Gas gas = new Gas();
        addObject(gas, m, s-8);
        addObject(new CloneLever(gas), t, p);
        addObject(new Countdown(),p,b);
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

        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                Level10 go= new Level10();
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