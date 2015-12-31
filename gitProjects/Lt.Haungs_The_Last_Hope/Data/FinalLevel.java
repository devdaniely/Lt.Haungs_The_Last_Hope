import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class FinalLevel here.
 * 
 * @author (Zach) 
 * @version (a version number or a date)
 */
public class FinalLevel extends Levelset
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
    private Portal rPortal2 = new Portal(Color.red);
    private Portal bPortal2 = new Portal(Color.blue);
    private int delay = 0;
    private int robotBottom = 300;
    /**
     * Constructor for objects of class FinalLevel.
     * 
     */
    public FinalLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        rPortal.setPortalLink(bPortal);
        bPortal.setPortalLink(rPortal);
        rPortal2.setPortalLink(bPortal2);
        bPortal2.setPortalLink(rPortal2);
        prepare();
    }
    

    public void prepare()
    {
        addObject(new Wall(), b, r);
        addObject(new Wall(), c, r);
        addObject(new Player(), a, q);
        addObject(new PSpawn(), a, q-2);
        addObject(new Wall(), d, r);
        addObject(new Obstacle(), d, q+2);
        addObject(new Turret2(), i, s);
        addObject(new Wall(), i, t);
        addObject(new Wall(), d, s);
        addObject(new Obstacle(), e, t+2);
        addObject(new Obstacle(), f, t+2);
        addObject(new Obstacle(), g, t+2);
        addObject(new Obstacle(), h, t+2);
        addObject(rPortal, f, s);
        addObject(bPortal, g, c);
        addObject(new Wall(), a, r);
        Gas gas = new Gas();
        addObject(gas,f, s);
        addObject(new CloneLever(gas), j, k);
        //addObject(new Wall(), j, l);
        addObject(new Wall(), f, d);
        addObject(new Wall(), g, d);
        addObject(new Wall(), h, d);
        Turret2 turret23 = new Turret2();
        addObject(turret23, 165, 83);
        turret23.setLocation(j, a);
        turret23.setRotation(-90);
        addObject(new Wall4(), j, t);
        addObject(new Obstacle(), j, j+2);
        addObject(new Wall(), l, m);
        Turret turret6 = new Turret();
        addObject(turret6, h, g);
        turret6.setRotation(180);
        turret6.getImage().mirrorVertically();
        addObject(new Wall4(), k, t);
        addObject(new Wall4(), l, t);
        addObject(new Wall4(), m, t);
        addObject(new Wall4(), n, t);
        addObject(new Wall4(), o, t);
        addObject(new Wall4(), p, t);
        addObject(new Wall4(), q, t);
        addObject(new Wall4(), r, t);
        addObject(new Wall4(), s, t);
        addObject(new Wall4(), t, t);
        addObject(new Obstacle(), t, t-5);
        addObject(new Wall(), m, g);
        addObject(new Alarm(this), m, r);
        addObject(new CloneTurret(), t, s);
        addObject(new Wall(), j, s);
        addObject(new Wall(), s, r);
        addObject(new Wall(), m, l);
        addObject(new Wall(), m, k);
        addObject(new Wall(), m, j);
        addObject(new Wall(), m, i);
        addObject(new Wall(), m, h);
        addObject(new Wall(), m, m);
        addObject(new Wall(), q, p);
        addObject(new Wall(), p, p);
        addObject(new Wall(), o, p);
        addObject(new Wall(), q, n);
        addObject(new Wall(), p, n);
        addObject(new Wall(), r, n);
        addObject(new Wall(), s, n);
        addObject(new CloneTurret(), t, m);
        addObject(new Turret(), t, o);
        addObject(new Wall(), m, n);
        addObject(new Wall(), m, o);
        addObject(new Wall(), r, l);
        addObject(new Wall(), q, l);
        addObject(new Wall(), p, l);
        addObject(new Wall(), o, l);
        addObject(new Turret2(), t, k);
        addObject(new Obstacle(), m, f);
        Gas gas2 = new Gas();
        addObject(gas2, q, m);
        addObject(new Wall(), p, j);
        addObject(new Wall(), q, j);
        addObject(new Obstacle(), r, j);
        addObject(new Obstacle(), s, j);
        addObject(new Obstacle(), t, j);
        Turret2 turret54 = new Turret2();
        addObject(turret54, n, f+2);
        turret54.setRotation(-135);
        Turret2 turret55 = new Turret2();
        addObject(turret55, t, f+2);
        turret55.setRotation(-45);
        addObject(rPortal2, q, i);
        addObject(bPortal2, b, b);
        addObject(new Obstacle(), b, e);
        addObject(new Wall(), r, j);
        addObject(new Wall(), c, g);
        addObject(new CloneLever(gas2), c, f);
        addObject(new Wall(), d, f);
        Turret turret9 = new Turret();
        addObject(turret9, a, d);
        turret9.setRotation(180);
        turret9.getImage().mirrorVertically();
        Turret turret10 = new Turret();
        addObject(turret10, a, f);
        turret10.setRotation(180);
        turret10.getImage().mirrorVertically();
        Turret turret99 = new Turret();
        addObject(turret99, a, i);
        turret99.setRotation(180);
        turret99.getImage().mirrorVertically();
        addObject(new Wall(), f, i);
        addObject(new Wall(), b, c);
        Gate gate  = new Gate();
        addObject(gate, s, b-8);
        addObject(new ClonePress(gate), b, m);
        addObject(new Wall(), b, n);
        Turret2 turret45 = new Turret2();
        addObject(turret45, b, l);
        turret45.setRotation(90);
        addObject(new Wall(), q, h);
        addObject(new Wall(), r, f);
        addObject(new NextLevel(), t, b-8);
        addObject(new Wall(), s, c);
        addObject(new Wall(), t, c);
        addObject(new Wall5(), p, e);
        addObject(new Wall5(), o, e);
        addObject(new Wall5(), n, e);
        addObject(new Wall5(), p, e);
        Turret turret01 = new Turret();
        addObject(turret01, o, a);
        turret01.setRotation(-90);
        addObject(new Trophy(), f, h);
        addObject(new Wall(), f, c);
        addObject(new Wall(), f, b);
        addObject(new Wall(), f, a);
        addObject(new Wall5(), q, c);
        addObject(new Countdown(),d,b);
    }
    public void spawnRobots()
    {
        // if( Greenfoot.getRandomNumber(1000)<10)
        if(delay>20)
        {
            Robot r = new Robot();
            r.setBottom(robotBottom);
            r.setTop(216);
            addObject(r, t+5, o);
            delay = 0;
        }
    }
    public int time = 0;
    ScoreBoard scoreboard = new ScoreBoard();
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
                LevelM2 go= new LevelM2();
                Greenfoot.setWorld(go);
            }
        }
    }

    public void endGame()
    {
        if (time < 1000)
        {
            addObject(new Continue(), 165, 253);
            scoreboard.addScore(100);
            addObject(scoreboard, 160,160);
            levelcheck = true;
        }
        if (time >1000)
        {
            addObject(new Continue(), 165, 253);
            scoreboard.addScore(0);
            addObject(scoreboard, 160,160);
            levelcheck = true;
        }

    }
}
