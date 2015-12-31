import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level10 here.
 * 
 * @author (Zach) 
 * @version (a version number or a date)
 */
public class Level10 extends Levelset
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
     * Constructor for objects of class Level10.
     * 
     */
    public Level10()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //Wall wall = new Wall();
        addObject(new Wall(), t, s);
        addObject(new Wall(), s, s);
        addObject(new Wall(), r, r);
        addObject(new Wall(), s, s);
        addObject(new PSpawn(), t, r-2);
        addObject(new Player(), t, r);
        addObject(new Wall(), q, q);
        addObject(new Obstacle(), p, p);
        addObject(new Wall(), o, o);
        addObject(new Wall(), n, n);
        addObject(new Wall(), p, m);
        addObject(new Wall(), q, m);
        addObject(new Wall(), r, m);
        addObject(new Wall(), s, m);
        addObject(new Wall(), t, m);
        addObject(new Turret2(), t, l);
        addObject(new Wall(), s, k);
        addObject(new Wall(), t, j);
        addObject(new Wall(), r, i);
        addObject(new Wall(), q, i);
        addObject(new Wall(), p, h);
        //addObject(new Wall(), o, g);
        addObject(new Wall(), n, f);
        addObject(new Wall(), l, e);
        addObject(new Obstacle(), m, f);
        addObject(new Wall(), k, e);
        addObject(new Wall(), j, e);
        addObject(new Wall(), i, e);
        addObject(new Wall(), h, e);
        addObject(new Wall(), g, e);
        addObject(new Wall(), e, e);
        addObject(new Wall(), d, e);
        addObject(new Wall(), c, e);
        addObject(new Wall(), b, e);
        addObject(new Wall(), a, e);
        addObject(new NextLevel(), a, d-8);
        Gate gate = new Gate();
        addObject(gate, b, d-8);
        ClonePress clonepress = new ClonePress(gate);
        addObject(clonepress, f, q);
        addObject(new Wall(), b, b);
        addObject(new Wall(), a, b);
        addObject(new Wall(), a, a);
        addObject(new Wall(), b, a);
        addObject(new Wall(), a, l);
        addObject(new Obstacle(), a, t+2);
        addObject(new Obstacle(), b, t+2);
        addObject(new Obstacle(), c, t+2);
        addObject(new Obstacle(), d, t+2);
        addObject(new Obstacle(), e, t+2);
        addObject(new Obstacle(), f, t+2);
        addObject(new Obstacle(), g, t+2);
        addObject(new Obstacle(), h, t+2);
        addObject(new Obstacle(), i, t+2);
        addObject(new Obstacle(), j, t+2);
        addObject(new Obstacle(), k, t+2);
        addObject(new Obstacle(), l, t+2);
        addObject(new Obstacle(), m, t+2);
        addObject(new Obstacle(), n, t+2);
        addObject(new Obstacle(), o, t+2);
        addObject(new Obstacle(), p, t+2);
        addObject(new Obstacle(), q, t+2);
        addObject(new Obstacle(), r, t+2);
        addObject(new Obstacle(), s, t+2);
        addObject(new Obstacle(), e, q+2);
        addObject(new Obstacle(), e, r+2);
        addObject(new Obstacle(), e, p+2);
        addObject(new Obstacle(), f, t+2);
        addObject(new Obstacle(), t, t+2);
        addObject(new Obstacle(), g, r+2);
        addObject(new Obstacle(), g, q+2);
        addObject(new Obstacle(), g, p+2);
        addObject(new Obstacle(), f, r+2);
        addObject(new Wall(), d, p);
        addObject(new Wall(), d, q);
        addObject(new Wall(), d, r);
        addObject(new Wall(), d, s);
        addObject(new Wall(), e, s);
        addObject(new Wall(), f, s);
        addObject(new Wall(), g, s);
        addObject(new Wall(), h, s);
        addObject(new Wall(), h, r);
        addObject(new Wall(), h, q);
        addObject(new Wall(), h, p);
        addObject(new Wall(), a, l);
        addObject(new Obstacle(), f, i);
        addObject(new Wall(), t, e);
        addObject(new Turret(), s, d);
        addObject(new Wall(), g, c);
        addObject(new Wall(), t, d);
        addObject(new Wall(), s, e);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Turret turret = new Turret();
        addObject(turret, d, d);
        turret.setRotation(180);
        GreenfootImage image = turret.getImage();
        image.mirrorVertically();
        turret.setImage(image);
        addObject(new Countdown(),l,b);
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
                Level11 go= new Level11();
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