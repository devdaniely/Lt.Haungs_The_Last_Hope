import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Level11 here.
 * 
 * @author (Zach) 
 * @version (a version number or a date)
 */
public class Level11 extends Levelset
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
     * Constructor for objects of class Level11.
     * 
     */
    public Level11()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(new Wall(), a, p);
        addObject(new Wall(), b, p);
        addObject(new Wall(), c, p);
        //addObject(new Wall(), d, p);
        addObject(new Wall(), e, p);
        addObject(new Wall(), f, p);
        addObject(new Wall(), g, p);
        //addObject(new Wall(), h, p);
        addObject(new Wall(), i, p);
        addObject(new Wall(), j, p);
        addObject(new Wall(), k, p);
        //addObject(new Wall(), l, p);
        addObject(new Wall(), m, p);
        addObject(new Wall(), a, n);
        addObject(new Player(), a, m);
        addObject(new PSpawn(), a,m-2);
        addObject(new Wall(), n, p);
        addObject(new Wall(), o, p);
        addObject(new Wall(), p, p);
        addObject(new Wall(), q, p);
        addObject(new Wall(), r, p);
        addObject(new Wall(), s, p);
        addObject(new Wall(), t, p);
        addObject(new Wall(), c, q);
        addObject(new Wall(), d, q);
        addObject(new Wall(), e, q);
        addObject(new Wall(), g, q);
        addObject(new Wall(), h, q);
        addObject(new Wall(), i, q);
        addObject(new Wall(), l, q);
        addObject(new Wall(), m, q);
        addObject(new Wall(), k, q);
        addObject(new Turret2(), t, o); 
        addObject(new Wall(), a, o);
        addObject(new Wall(), r, n);
        addObject(new Wall(), s, n);
        addObject(new Wall(), t, n);
        addObject(new Wall(), t, i);
        addObject(new Wall(), s, i);
        //addObject(new Wall(), s, l);
        //addObject(new Wall(), t, j);
        addObject(new Wall(), r, i);
        addObject(new Wall(), q, i);
        addObject(new Wall(), p, i);
        addObject(new Wall(), o, i);
        addObject(new Wall(), n, i);
        addObject(new Wall(), m, i);
        //addObject(new Wall(), l, i);
        //addObject(new Wall(), k, i);
        //addObject(new Wall(), j, i);
        //addObject(new Wall(), i, i);
        //addObject(new Wall(), h, i);
        addObject(new Wall(), g, i);
        addObject(new Wall(), f, i);
        addObject(new Wall(), e, i);
        //addObject(new Wall(), d, i);
        addObject(new Wall(), c, i);
        addObject(new Wall(), b, i);
        addObject(new Wall(), a, i);
        addObject(new Wall(), c, j);
        addObject(new Wall(), d, j);
        addObject(new Wall(), e, j);
        addObject(new Wall(), g, j);
        addObject(new Wall(), h, j);
        addObject(new Wall(), i, j);
        addObject(new Wall(), l, j);
        addObject(new Wall(), m, j);
        addObject(new Wall(), k, j);
        addObject(new Obstacle(), j, j+2);
        addObject(new Wall(), j, k);
        //addObject(new Turret2(), a, h);
        addObject(new Wall(), q, h);
        addObject(new Wall(), h, g);
        addObject(new Wall(), i, f);
        addObject(new Wall(), j, e);
        addObject(new Wall(), k, e);
        addObject(new Wall(), l, e);
        addObject(new Wall(), p, e);
        //addObject(new Wall(), r, e);
        //addObject(new Wall(), s, e);
        addObject(new Wall(), t, e);
        Gate gate = new Gate();
        addObject(gate, b, b-8);
        addObject(new ClonePress(gate), t, d);
        addObject( new Wall(), a, c);
        addObject( new Wall(), b, c);
        addObject(new NextLevel(), a, b-8);
        //addObject(new Obstacle(), m, f);
        addObject(new Obstacle(), n, e+2);
        //addObject(new Obstacle(), o, f);
        //addObject(new Obstacle(), q, f);
        addObject(new Obstacle(), r, e+2);
        //addObject(new Obstacle(), s, f);
        addObject(new Wall(), r, f);
        addObject(new Wall(), n, f);
        addObject(new Wall(), b, g);
        addObject(new Wall(), c, e);
        addObject(rPortal, t, m);
        addObject(bPortal, t, h);
        prepare();
        
        rPortal.setPortalLink(bPortal);
        bPortal.setPortalLink(rPortal);
        addObject(new Countdown(),g,b);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //Turret2 turret2 = new Turret2();
        //addObject(turret2, 7, 120);
        //turret2.turn(180);
        Turret turret = new Turret();
        addObject(turret, 13, 119);
        turret.setLocation(9, 121);
        turret.setRotation(180);
        GreenfootImage image = turret.getImage();
        image.mirrorVertically();
        turret.setImage(image);
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
                LevelJ2 go= new LevelJ2();
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