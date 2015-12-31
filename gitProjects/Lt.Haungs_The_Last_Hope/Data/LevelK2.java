import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class LevelK2 here.
 * 
 * @author (Ken) 
 * @version (a version number or a date)
 */
public class LevelK2 extends Levelset
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
    private Portal rPortal = new Portal(Color.red);
    private Portal bPortal = new Portal(Color.blue);

    /**
     * Constructor for objects of class LevelK2.
     * 
     */
    public LevelK2()
    {    
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
        addObject(new Wall(), a, s);
        addObject(new Wall(), d, r);
        addObject(new Wall(), f, r);
        addObject(new Wall(), g, r);
        addObject(new Wall(), i, q-2);
        addObject(new Wall(), l, o);
        addObject(new Wall(), m, o);
        addObject(new Wall(), n, o);
        addObject(new Wall(), o, o);
        addObject(new Wall(), j, m);
        addObject(new Wall(), i, m);
        addObject(new Wall(), h, m);
        addObject(new Wall(), f, l);
        addObject(new Wall(), e, l);
        addObject(new Wall(), e, l);
        addObject(new Wall(), d, l);
        addObject(new Wall(), b, j);
        addObject(new Wall(), a, j);
        addObject(new Wall(), e, i);
        addObject(new Wall(), f, i);
        addObject(new Wall(), g, i);
        addObject(new Wall(), j ,h-1);
        //addObject(new Wall(), h ,f);
        //addObject(new Wall(), g, f);
        addObject(new Wall(), l, g);
        addObject(new Wall(), m, g);
        //addObject(new Wall(), e ,d);
        //addObject(new Wall(), d, d);
        addObject(new Wall(), b, b);
        addObject(new Wall(), a, b);
        addObject(new Wall(), o, f);
        addObject(new Wall(), p, f);
        addObject(new Wall(), t, d);
        addObject(new Wall(), s ,d);
        addObject(new Wall(), a, e);
        addObject(new Wall(), c, b);
        addObject(new Wall(), c, a);
        Gate gate = new Gate();
        addObject(gate, s, c);
        addObject(new ClonePress(gate), a, a);
        addObject(new NextLevel(), t, c);
        addObject(new Turret(), t, q);
        addObject(new Turret(), t, m);
        addObject(new Turret(), t, l);
        addObject(new Turret2(), t, j);
        addObject(new Turret(), t ,e);
        addObject(new Turret(), t, s);
        addObject(new Turret(), t, h);
        addObject(new Turret(), t, g);
        addObject(new PSpawn(), a-2, r);
        addObject(new Player(), a-2, r);
        Gas gas = new Gas();
        addObject(gas, i, l-8);
        addObject(new CloneLever(gas), a, i);

        addObject(rPortal, r, r);
        addObject(bPortal, b, a);
        
        addObject(new Countdown(),g,a);

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
                LevelJ1 go= new LevelJ1();
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
