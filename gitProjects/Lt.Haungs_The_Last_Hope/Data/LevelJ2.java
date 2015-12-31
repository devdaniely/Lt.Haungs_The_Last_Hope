import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class LevelJ1 here.
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class LevelJ2 extends Levelset
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
    public LevelJ2()
    {    
        prepare();
    }

    public void prepare()
    {
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
        addObject(new Obstacle(), t, t+2);
        addObject(new Wall(), b, s);
        addObject(new Wall(), d, s);
        addObject(new Wall(), f, s);
        addObject(new Wall(), h, s);
        addObject(new Wall(), j, s);
        addObject(new Wall(), l, s);
        addObject(new Wall(), n, s);
        addObject(new Wall(), p, s);
        addObject(new Wall(), r, s);
        addObject(new Wall(), t, s);
        addObject(new PSpawn(), b, r);
        addObject(new Player(), b, r);
        addObject(new Wall(), k, q);
        addObject(new Wall(), l, o);
        addObject(new Wall(), m, m);
        addObject(new Wall(), n, m);
        addObject(new Wall(), o, m);
        addObject(new Wall(), p, m);
        addObject(new Wall(), q, m);
        addObject(new Wall(), r, m);
        addObject(new Wall(), s, m);
        addObject(new Wall(), t, m);
        addObject(new Trophy(), t, r);
        addObject(new Wall(), s, k);
        addObject(new Wall(), r, i);
        addObject(new Wall(), q, g);
        addObject(new Wall(), q, g);
        addObject(new Wall(), p, g);
        addObject(new Wall(), m, g);
        addObject(new Wall(), l, g);
        addObject(new Wall(), i, g);
        addObject(new Wall(), f, g);
        addObject(new Wall(), c, g);
        addObject(new Wall(), b, g);
        addObject(new Wall(), a, g);
        Turret turret1 = new Turret();
        addObject(turret1, a, m);
        turret1.setRotation(180);
        GreenfootImage image = turret1.getImage();
        image.mirrorVertically();
        turret1.setImage(image);
        Turret turret2 = new Turret();
        addObject(turret2, a, j);
        turret2.setRotation(180);
        GreenfootImage image2 = turret2.getImage();
        image2.mirrorVertically();
        turret2.setImage(image2);
        addObject(new Turret(), t, p);
        addObject(new Wall(), a, e);
        addObject(new Wall(), b, c);
        addObject(new Wall(), c, c);
        addObject(new Wall(), d, c);
        addObject(new Wall(), e, c);
        addObject(new Wall(), f, c);
        addObject(new Wall(), g, c);
        addObject(new Wall(), h, c);
        addObject(new Wall(), i, c);
        addObject(new Wall(), j, c);
        addObject(new Wall(), k, c);
        addObject(new Wall(), l, c);
        addObject(new Wall(), m, c);
        addObject(new Wall(), n, c);
        addObject(new Wall(), o, c);
        addObject(new Wall(), p, c);
        addObject(new Wall(), q, c);
        addObject(new Wall(), r, c);
        addObject(new Wall(), s, c);
        addObject(new Wall(), t, c);
        addObject(new Turret(), t, f);
        Gate gate = new Gate();
        addObject(gate, s, b-8);
        ClonePress cp = new ClonePress(gate);
        addObject(cp, b, f);
        addObject(new NextLevel(), t, b-8);
        addObject(new Wall(), a, q);
        addObject(new Wall(), b, o);
        addObject(new Wall(), c, o);
        addObject(new Wall(), d, o);
        addObject(new Wall(), e, o);
        addObject(new Wall(), e, p);
        addObject(new Wall(), t, j);
        addObject(new Wall(), a, f);
        addObject(new Turret2(), d, q);
        Gas gas = new Gas();
        addObject(gas, p, r-8);
        addObject(new CloneLever(gas), d, n);
        addObject(new Countdown(),d,l);
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

        if (Greenfoot.isKeyDown("enter"))
        {
            Level12 go= new Level12();
            Greenfoot.setWorld(go);
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
