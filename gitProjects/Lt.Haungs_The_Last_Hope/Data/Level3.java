import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (Daniel) 
 * @version (a version number or a date)
 */
public class Level3 extends Levelset
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

    public Level3()
    {    

        prepare();
    }

    public void prepare()
    {
        addObject(new Player(), b, g);

        addObject(new PSpawn(), b, g);
        addObject(new Wall(), b, h);
        addObject(new Wall4(), d, s);
        addObject(new Wall4(), e, s);
        addObject(new Wall4(), f, s);
        addObject(new Wall4(), g, s);
        addObject(new Wall4(), h, s);
        addObject(new Wall4(), i, s);
        addObject(new Wall4(), j, s);
        addObject(new Wall(), k, s);
        addObject(new Wall(), f, b);
        addObject(new Wall(), f, c);
        addObject(new Wall(), f, d);
        addObject(new Wall(), f, e);
        addObject(new Wall(), f, f);
        addObject(new Wall(), f, g);
        addObject(new Wall(), f, h);
        addObject(new Wall(), f, i);
        addObject(new Wall(), f, j);
        addObject(new Wall(), f, k);
        addObject(new Wall(), f, l);
        addObject(new Wall(), f, m);
        addObject(new Wall(), f, n);
        addObject(new Wall(), f, o);

        addObject(new Wall(), g, b);
        addObject(new Wall(), g, c);
        addObject(new Wall(), g, d);
        addObject(new Wall(), g, e);
        addObject(new Wall(), g, f);
        addObject(new Wall(), g, g);
        addObject(new Wall(), g, h);
        addObject(new Wall(), g, i);
        addObject(new Wall(), g, j);
        addObject(new Wall(), g, k);
        addObject(new Wall(), g, l);
        addObject(new Wall(), g, m);
        addObject(new Wall(), g, n);
        addObject(new Wall(), g, o);

        addObject(new Wall(), i, p);
        addObject(new Wall(), i, q);
        addObject(new Wall(), j, q);
        addObject(new Wall(), l, o);
        addObject(new Wall(), m, o);
        addObject(new Wall(), m, n);

        addObject(new Wall(), i, l);
        addObject(new Wall(), i, m);
        addObject(new Wall(), j, m);
        addObject(new Wall(), l, k);
        addObject(new Wall(), n, j);
        addObject(new Wall(), o, h);
        addObject(new Wall(), m, f);
        addObject(new Wall(), o, d);
        addObject(new Wall(), p, c);
        addObject(new Wall(), q, d);
        addObject(new Wall(), r, e);
        addObject(new Wall(), s, f);
        addObject(new Wall(), t, f);
        addObject(new NextLevel(), t, e-8);
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
        Gas gas = new Gas();
        addObject(gas, k, p-8);
        addObject(new CloneLever(gas), i, k);
        tex.setImage("3.png");
        addObject(tex, 160, 171);
        addObject(new Countdown(),d,b);
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
        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                Level4 go= new Level4();
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