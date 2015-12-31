import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level5 here.
 * 
 * @author (Daniel) 
 * @version (a version number or a date)
 */
public class LevelD extends Levelset
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
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public LevelD()
    {    

        prepare();
    }

    private void prepare()
    {
        addObject(new Wall(), a, r);
        addObject(new Wall(), b, r);
        addObject(new Wall(), c, r);
        addObject(new Wall(), d, r);
        addObject(new Wall(), e, r);
        addObject(new Wall(), f, r);
        addObject(new Wall(), g, r);
        addObject(new Wall(), h, r);
        addObject(new Wall(), i, r);
        addObject(new Wall(), j, r);
        addObject(new Wall(), k, r);
        addObject(new Wall(), l, r);
        addObject(new Wall(), m, r);
        addObject(new Wall(), n, r);
        addObject(new Wall(), o, r);
        addObject(new Wall(), p, r);
        addObject(new Wall(), q, r);
        addObject(new Wall(), r, r);
        addObject(new Wall(), s, r);
        addObject(new Wall(), t, r);
        addObject(new Wall(), a, q);

        Turret turret = new Turret();
        addObject(turret, d, p);
        turret.setRotation(-90);

        Turret turret2 = new Turret();
        addObject(turret2, e, o);
        turret2.setRotation(-90);

        Turret turret3 = new Turret();
        addObject(turret3, f, n);
        turret3.setRotation(-90);

        Turret turret4 = new Turret();
        addObject(turret4, g, m);
        turret4.setRotation(-90);

        Turret turret5 = new Turret();
        addObject(turret5, h, l);
        turret5.setRotation(-90);

        Turret turret6 = new Turret();
        addObject(turret6, i, k);
        turret6.setRotation(-90);

        Turret turret7 = new Turret();
        addObject(turret7, j, j);
        turret7.setRotation(-90);

        Turret turret8 = new Turret();
        addObject(turret8, k, i);
        turret8.setRotation(-90);

        Turret turret9 = new Turret();
        addObject(turret9, p, k);
        turret9.setRotation(-90);

        Turret turret10 = new Turret();
        addObject(turret10, q, k);
        turret10.setRotation(-90);

        Turret turret11 = new Turret();
        addObject(turret11, r, l);
        turret11.setRotation(-90);

        Turret turret12 = new Turret();
        addObject(turret12, s, n);
        turret12.setRotation(-90);

        Turret turret13 = new Turret();
        addObject(turret13, m, q);

        addObject(new Player(), a-2, p);
        addObject(new PSpawn(), a-2, p);
        NextLevel nextlevel = new NextLevel();
        addObject(nextlevel, 315, 259);
        nextlevel.setLocation(312, 255);
        addObject(new Countdown(),d,b);
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
                LevelK3 go= new LevelK3();
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