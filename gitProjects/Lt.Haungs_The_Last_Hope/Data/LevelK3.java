import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LevelK3 here.
 * 
 * @author (Ken) 
 * @version (a version number or a date)
 */
public class LevelK3 extends Levelset
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
    private  Portal rPortal = new Portal(Color.red);
    private   Portal bPortal = new Portal(Color.blue);
    /**
     * Constructor for objects of class LevelK3.
     * 
     */
    public LevelK3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        prepare();

        rPortal.setPortalLink(bPortal);
        bPortal.setPortalLink(rPortal);
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
        addObject(new Wall(), k, a);
        addObject(new Wall(), k, b);
        addObject(new Wall(), k, c);
        addObject(new Wall(), k, d);
        addObject(new Wall(), k, e);
        addObject(new Wall(), k, f);
        addObject(new Wall(), k, g);
        addObject(new Wall(), k, h);
        addObject(new Wall(), k, i);
        addObject(new Wall(), k, j);
        addObject(new Wall(), k, k);
        addObject(new Wall(), k, l);
        addObject(new Wall(), k, m);
        addObject(new Wall(), k, n);
        addObject(new Wall(), k, o);
        addObject(new Wall(), k, p);
        addObject(new Wall(), k, q);
        addObject(new Wall(), k, r);
        addObject(new Wall(), k, s);
        addObject(new Wall(), c, r);
        addObject(new Wall(), d, r);
        addObject(new Wall(), e, r);
        addObject(new Wall(), f, r);
        addObject(new Wall(), g, r);
        addObject(new Wall(), h, r);
        addObject(new Wall(), i, r);
        addObject(new Wall(), j, r);
        addObject(new Wall(), a, q);
        addObject(new Wall(), e, p);
        addObject(new Wall(), f, p);
        addObject(new Wall(), g, p);
        addObject(new Wall(), h, p);
        addObject(new Wall(), i, p);
        addObject(new Wall(), j, p);
        addObject(new Wall(), a, m);
        addObject(new Wall(), g, n);
        addObject(new Wall(), h, n);
        addObject(new Wall(), i, n);
        addObject(new Wall(), j, n);
        addObject(new Turret(), j, q);
        addObject(new Turret(), j, m);
        addObject(new Wall(), f, l);
        addObject(new Wall(), f, h);
        addObject(new Wall(), g, g);
        addObject(new Wall(), h, f);
        addObject(new Wall(), i, e);
        addObject(new Wall(), j, d);
        addObject(new Wall(), h, c);
        addObject(new Wall(), g, c);
        addObject(new Wall(), f, c);
        addObject(new Wall(), e ,c);
        addObject(new Wall(), d, c);
        addObject(new Wall(), c, c);
        addObject(new Wall(), b, c);
        addObject(new Wall(), a, c);  
        addObject(new Wall(), e, l);
        addObject(new Wall(), d, l);
        addObject(new Wall(), c, l);
        addObject(new Wall(), b, l);
        addObject(new Wall(), a, l);
        addObject(new Wall(), d, j);
        addObject(new Wall(), c, j);
        addObject(new Wall(), b, j);
        addObject(new Wall(), a, j);
        addObject(new Wall(), l, c);
        addObject(new Wall(), m, c);
        addObject(new Wall(), n, c);
        addObject(new Wall(), o, c);
        addObject(new Wall(), p, c);
        addObject(new Wall(), q, c);
        addObject(new Wall(), r, c);
        addObject(new Wall(), t, e);
        addObject(new Wall(), s, e);
        addObject(new Wall(), r, e);
        addObject(new Wall(), q, e);
        addObject(new Wall(), t, g);
        addObject(new Wall(), s, g);
        addObject(new Wall(), r, g);
        addObject(new Wall(), q, g);
        addObject(new Wall(), p, g);
        addObject(new Wall(), o, g);
        addObject(new Wall(), n, g);
        addObject(new Wall(), l, i);
        addObject(new Wall(), m, i);
        addObject(new Wall(), p, p);
        addObject(new Wall(), a, o);
        Gate gate = new Gate();
        addObject(new ClonePress(gate), p, o);
        addObject(gate, b, a+9);
        addObject(new NextLevel(), a,a+9);
        addObject(new Obstacle(), t, s+2);
        addObject(new Obstacle(), s, s+2);
        addObject(new Obstacle(), r, s+2);
        addObject(new Obstacle(), q, s+2);
        addObject(new Obstacle(), p, s+2);
        addObject(new Obstacle(), o, s+2);
        addObject(new Obstacle(), n, s+2);
        addObject(new Obstacle(), m, s+2);
        addObject(new Obstacle(), l, s+2);
        addObject(new Obstacle(), e, b+5);
        addObject(new Turret(), t, f);
        addObject(new CloneTurret(), j, o);
        addObject(rPortal, a, i);
        addObject(bPortal, l ,b);
        addObject(new Player(), a+2, s-2);
        addObject(new PSpawn(), a+2, s-2);
        tex.setImage("9.png");
        addObject(tex, 160, 149);
        addObject(new Countdown(),p,s);
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
                LevelK2 go= new LevelK2();
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